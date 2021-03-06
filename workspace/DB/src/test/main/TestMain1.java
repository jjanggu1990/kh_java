package test.main;

import java.io.InputStream;
import java.sql.Timestamp;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import test.vo.MembersVo;

public class TestMain1 {
	public static void main(String [] args){
		String res = "config.xml";
		InputStream is = null;
		SqlSessionFactory factory = null;
		SqlSession session = null;
		try{
			is = Resources.getResourceAsStream(res);
			factory = new SqlSessionFactoryBuilder().build(is);
			session = factory.openSession();
			List<MembersVo> list = session.selectList("member.getlist");
			if(list.size() == 0){
				System.out.println("데이터 없음");
			}
			for (MembersVo vo : list){
				System.out.println("id: " + vo.getId());
				System.out.println("pwd: " + vo.getPwd());
				System.out.println("email: " + vo.getEmail());
				System.out.println("phone: " + vo.getPhone());
				System.out.println("regdate: " + vo.getRegdate());
				System.out.println();
			}
			
			
			MembersVo vo = session.selectOne("member.find","batis1");
			System.out.println("id가 batis1 인 객체 find");
			System.out.println("id: " + vo.getId());
			System.out.println("pwd: " + vo.getPwd());
			System.out.println("email: " + vo.getEmail());
			System.out.println("phone: " + vo.getPhone());
			System.out.println("regdate: " + vo.getRegdate());
			System.out.println();
			
			HashMap hm = session.selectOne("member.getInfo","batis1");
			System.out.println("id가 batis1 인 객체 getInfo");
			System.out.println("id: " + hm.get("ID"));
			System.out.println("pwd: " + hm.get("PWD"));
			System.out.println("email: " + hm.get("EMAIL"));
			System.out.println("phone: " + hm.get("PHONE"));
			System.out.println("regdate: " + hm.get("REGDATE"));
			Timestamp reg = (Timestamp) hm.get("REGDATE");
			System.out.println("regdate _ Timestamp: " + reg);
		}catch(Exception e){
			e.printStackTrace();
		}
		finally{
			session.close();
			try{
				is.close();
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}
}
