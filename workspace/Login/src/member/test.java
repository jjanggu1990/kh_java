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
						//ȸ������
						System.out.println("ȸ������");
						System.out.println("�̸��� �Է��ϼ���.");
						String name = in.readLine();
						System.out.println("���̵� �Է��ϼ���.");
						String id = in.readLine();
						System.out.println("��й�ȣ�� �Է��ϼ���.");
						String pwd = in.readLine();
						User u = new User(id, pwd, name);
						int snum = session.insert("member.add", u);
						if (num != 0) {
							System.out.println("ȸ�������� �����մϴ�.");
							session.commit();
						} else {
							System.out.println("���̵� �ߺ� �˴ϴ�.");
						}
					} else if (num == 2) {
						//�α���
						System.out.println("�α���");
						System.out.println("���̵� �Է��Ͻÿ�.");
						String id = in.readLine();
						System.out.println("��й�ȣ�� �Է��Ͻÿ�.");
						String pwd = in.readLine();
						User u = new User(id,pwd,"");
						String input_pwd = session.selectOne("member.login",u);
						if(pwd.equals(input_pwd)){
							System.out.println("�α��� ����");
						}else{
							System.out.println("ȸ������ ����ġ!");
						}
					} else if (num == 3) {
						//�̸�����(���̵�� �̸� �Է�)
						System.out.println("�̸��� ���� �մϴ�.");
						System.out.println("���̵� �Է��ϼ���.");
						String id = in.readLine();
						System.out.println("�̸��� �Է��ϼ���.");
						String name = in.readLine();
						User u = new User(id,"",name);
						User compa_u = session.selectOne("member.name_ch",u);
						if(compa_u.getId().equals(id) && compa_u.getName().equals(name)){
							System.out.println("���� ��ġ. �ٲ� �̸��� �Է��ϼ���.");
							String new_name = in.readLine();
							User input_u = new User(id,"",new_name);
							session.update("member.name_modi",input_u);
							session.commit();
							System.out.println("���� ����");
							continue;
						}else{
							System.out.println("���� ����ġ");
							continue;
						}
						
					} else if (num == 4) {
						//��й�ȣ ����(���̵�� ��й�ȣ �Է�)
						System.out.println("��й�ȣ�� �����մϴ�.");
						System.out.println("���̵� �Է��ϼ���");
						String id = in.readLine();
						System.out.println("��й�ȣ�� �Է��ϼ���.");
						String pwd = in.readLine();
						User u = new User(id,pwd,"");
						String result_id = session.selectOne("member.pwd_ch", u);
						if(id.equals(result_id)){
							System.out.println("������ ��� ��ȣ�� �Է��ϼ���.");
							String new_pwd = in.readLine();
							User new_u = new User(id,new_pwd,"");
							session.update("member.pwd_modi",new_u);
							session.commit();
							System.out.println("��й�ȣ ���� �Ϸ�");
						}else{
							System.out.println("���� ����!");
							continue;
						}
						
					} else if (num == 5) {
						//���̵� �ߺ�üũ(���̵��Է�)
						System.out.println("�ߺ� üũ. ���̵� �Է��ϼ���.");
						String id = in.readLine();
						String result_id = session.selectOne("member.id_ch", id);
						if(id.equals(result_id)){
							System.out.println("id�� ���� �մϴ�.");
						}else{
							System.out.println("��� �����մϴ�.");
						}
					} else if (num == 6) {
						//��й�ȣ ã��(���̵�� �̸� �Է�)
						System.out.println("��й�ȣ ã��");
						System.out.println("���̵� �Է��ϼ���");
						String id = in.readLine();
						System.out.println("�̸��� �Է��ϼ���");
						String name = in.readLine();
						User u = new User(id,"",name);
						String result_id = session.selectOne("member.pwd_ch2", u);
						System.out.println("��й�ȣ�� : "+result_id);
					} else if (num == 7) {
						//ȸ�� Ż��(��й�ȣ �ٽ� �Է�)
						System.out.println("ȸ��Ż��");
						System.out.println("���̵� �Է��ϼ���.");
						String id = in.readLine();
						System.out.println("��й�ȣ�� �Է��ϼ���.");
						String pwd = in.readLine();
						User u = new User(id,pwd,"");
						String result_id = session.selectOne("member.remove_ch",u);
						if(result_id.equals(id)){
							System.out.println("��й�ȣ�� �ѹ� �� �Է����ּ���.");
							pwd = in.readLine();
							session.delete("member.remove_id", id);
							session.commit();
							System.out.println("����ó�� �Ǿ����ϴ�.");
						}
					} else if (num == 8) {
						System.out.println("�����մϴ�.");
						System.exit(0);
					}

				} catch (Exception e) {
					System.out.println("�ٽ� �Է��ϼ���.");
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
		System.out.println("1. ȸ������");
		System.out.println("2. �α���");
		System.out.println("3. �̸� ����(���̵�� �̸� �Է�)");
		System.out.println("4. ��й�ȣ ����(���̵�� ��й�ȣ �Է�)");
		System.out.println("5. ���̵� �ߺ�üũ(���̵��Է�)");
		System.out.println("6. ��й�ȣ ã��(���̵�� �̸� �Է�)");
		System.out.println("7. ȸ�� Ż��(��й�ȣ �ٽ� �Է�)");
		System.out.println("8. ����");
		System.out.println("���ڸ� �Է� �ϼ���.");
	}

}