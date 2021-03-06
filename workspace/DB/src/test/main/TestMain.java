package test.main;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import test.vo.MembersVo;

public class TestMain {
	public static void main(String[] args) {
		String res = "config.xml";
		try {
		  	InputStream is = Resources.getResourceAsStream(res);
			
			SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
			System.out.println("factory ok");
			SqlSession session = factory.openSession();
		
			MembersVo vo = new MembersVo("batis1", "1111", "batis@co.kr", "010",null);

			//member 는 memberMapper.xml 파일 안에 네임 스페이스
			//n 은 변경된 레코드의 갯수
			int n = session.insert("member.add", vo);

			vo = new MembersVo("batis2", "2222", "batis@co.kr", "010",null);
			n = session.insert("member.add", vo);
			
			vo = new MembersVo("batis3", "3333", "batis@co.kr", "010",null);
			n = session.insert("member.add", vo);
			
			vo = new MembersVo("batis4", "4444", "batis@co.kr", "010",null);
			n = session.insert("member.add", vo);
			
			//변경 된 레코드가 있다.
			if (n > 0) {

				session.commit();
				System.out.println("insert ok");
			} else {
				session.rollback();
				System.out.println("insert f");
			}

		n = session.delete("member.remove", "batis");
			System.out.println("delete 처리건수:" + n);

			session.commit();

			session.close();

		} catch (IOException ie) {
			System.out.println(ie.getMessage());
		}
	}
}