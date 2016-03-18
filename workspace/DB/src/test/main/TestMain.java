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

			//member �� memberMapper.xml ���� �ȿ� ���� �����̽�
			//n �� ����� ���ڵ��� ����
			int n = session.insert("member.add", vo);

			vo = new MembersVo("batis2", "2222", "batis@co.kr", "010",null);
			n = session.insert("member.add", vo);
			
			vo = new MembersVo("batis3", "3333", "batis@co.kr", "010",null);
			n = session.insert("member.add", vo);
			
			vo = new MembersVo("batis4", "4444", "batis@co.kr", "010",null);
			n = session.insert("member.add", vo);
			
			//���� �� ���ڵ尡 �ִ�.
			if (n > 0) {

				session.commit();
				System.out.println("insert ok");
			} else {
				session.rollback();
				System.out.println("insert f");
			}

		n = session.delete("member.remove", "batis");
			System.out.println("delete ó���Ǽ�:" + n);

			session.commit();

			session.close();

		} catch (IOException ie) {
			System.out.println(ie.getMessage());
		}
	}
}