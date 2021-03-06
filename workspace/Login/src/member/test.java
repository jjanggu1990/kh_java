package member;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class test {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		InputStream is = null;
		SqlSessionFactory factory = null;
		SqlSession session = null;
		
		try {
			is = Resources.getResourceAsStream("info/config.xml");
			factory = new SqlSessionFactoryBuilder().build(is);
			session = factory.openSession();

			
			while (true) {
				printMenu();
				try {
					int num = Integer.parseInt(in.readLine());
					if (num == 1) {
						//회원가입
						System.out.println("회원가입");
						System.out.println("이름을 입력하세요.");
						String name = in.readLine();
						System.out.println("아이디를 입력하세요.");
						String id = in.readLine();
						System.out.println("비밀번호를 입력하세요.");
						String pwd = in.readLine();
						User u = new User(id, pwd, name);
						int snum = session.insert("member.add", u);
						if (num != 0) {
							System.out.println("회원가입을 축하합니다.");
							session.commit();
						} else {
							System.out.println("아이디가 중복 됩니다.");
						}
					} else if (num == 2) {
						//로그인
						System.out.println("로그인");
						System.out.println("아이디를 입력하시오.");
						String id = in.readLine();
						System.out.println("비밀번호를 입력하시오.");
						String pwd = in.readLine();
						User u = new User(id,pwd,"");
						String input_pwd = session.selectOne("member.login",u);
						if(pwd.equals(input_pwd)){
							System.out.println("로그인 성공");
						}else{
							System.out.println("회원정보 불일치!");
						}
					} else if (num == 3) {
						//이름수정(아이디와 이름 입력)
						System.out.println("이름을 수정 합니다.");
						System.out.println("아이디를 입력하세요.");
						String id = in.readLine();
						System.out.println("이름을 입력하세요.");
						String name = in.readLine();
						User u = new User(id,"",name);
						User compa_u = session.selectOne("member.name_ch",u);
						if(compa_u.getId().equals(id) && compa_u.getName().equals(name)){
							System.out.println("정보 일치. 바꿀 이름을 입력하세요.");
							String new_name = in.readLine();
							User input_u = new User(id,"",new_name);
							session.update("member.name_modi",input_u);
							session.commit();
							System.out.println("변경 성공");
							continue;
						}else{
							System.out.println("정보 불일치");
							continue;
						}
						
					} else if (num == 4) {
						//비밀번호 변경(아이디와 비밀번호 입력)
						System.out.println("비밀번호를 수정합니다.");
						System.out.println("아이디를 입력하세요");
						String id = in.readLine();
						System.out.println("비밀번호를 입력하세요.");
						String pwd = in.readLine();
						User u = new User(id,pwd,"");
						String result_id = session.selectOne("member.pwd_ch", u);
						if(id.equals(result_id)){
							System.out.println("변경할 비밀 번호를 입력하세요.");
							String new_pwd = in.readLine();
							User new_u = new User(id,new_pwd,"");
							session.update("member.pwd_modi",new_u);
							session.commit();
							System.out.println("비밀번호 변경 완료");
						}else{
							System.out.println("변경 실패!");
							continue;
						}
						
					} else if (num == 5) {
						//아이디 중복체크(아이디입력)
						System.out.println("중복 체크. 아이디를 입력하세요.");
						String id = in.readLine();
						String result_id = session.selectOne("member.id_ch", id);
						if(id.equals(result_id)){
							System.out.println("id가 존재 합니다.");
						}else{
							System.out.println("사용 가능합니다.");
						}
					} else if (num == 6) {
						//비밀번호 찾기(아이디와 이름 입력)
						System.out.println("비밀번호 찾기");
						System.out.println("아이디를 입력하세요");
						String id = in.readLine();
						System.out.println("이름을 입력하세요");
						String name = in.readLine();
						User u = new User(id,"",name);
						String result_id = session.selectOne("member.pwd_ch2", u);
						System.out.println("비밀번호는 : "+result_id);
					} else if (num == 7) {
						//회원 탈퇴(비밀번호 다시 입력)
						System.out.println("회원탈퇴");
						System.out.println("아이디를 입력하세요.");
						String id = in.readLine();
						System.out.println("비밀번호를 입력하세요.");
						String pwd = in.readLine();
						User u = new User(id,pwd,"");
						String result_id = session.selectOne("member.remove_ch",u);
						if(result_id.equals(id)){
							System.out.println("비밀번호를 한번 더 입력해주세요.");
							pwd = in.readLine();
							session.delete("member.remove_id", id);
							session.commit();
							System.out.println("정상처리 되었습니다.");
						}
					} else if (num == 8) {
						System.out.println("종료합니다.");
						System.exit(0);
					}

				} catch (Exception e) {
					System.out.println("다시 입력하세요.");
					continue;
				}
			}
		} catch (Exception e2) {
			System.out.println(e2.getMessage());
		} finally {
			session.close();
			in.close();
		}

	}

	public static void printMenu() {
		System.out.println("1. 회원가입");
		System.out.println("2. 로그인");
		System.out.println("3. 이름 수정(아이디와 이름 입력)");
		System.out.println("4. 비밀번호 변경(아이디와 비밀번호 입력)");
		System.out.println("5. 아이디 중복체크(아이디입력)");
		System.out.println("6. 비밀번호 찾기(아이디와 이름 입력)");
		System.out.println("7. 회원 탈퇴(비밀번호 다시 입력)");
		System.out.println("8. 종료");
		System.out.println("숫자를 입력 하세요.");
	}

}
