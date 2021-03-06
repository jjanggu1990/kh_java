package board;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Vector;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class LogonDBBean {
	private static LogonDBBean instance = new LogonDBBean();
	
	public static LogonDBBean getInstance(){
		return instance;
	}
	private LogonDBBean(){}
	
	private static SqlSessionFactory getFactory() throws Exception{
		String res = "config.xml";
		InputStream is =null;
		SqlSessionFactory factory = null;
		try {
		  	is = Resources.getResourceAsStream(res);
			
			factory = new SqlSessionFactoryBuilder().build(is);
			System.out.println("factory ok");
			//SqlSession session = factory.openSession();
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return factory;
	}
	
	public void insertMember(LogonDataBean member) throws Exception{
		SqlSessionFactory factory = null;
		SqlSession session = null;
		try{
			factory = getFactory();
			session = factory.openSession();
			session.insert("login.insertMember", member);
			
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			if(session != null) try{session.close();}catch(Exception ex){}
		}
	}
	
	public int userCheck(String id, String passwd) throws Exception{
		SqlSessionFactory factory = null;
		SqlSession session = null;
		String dbpasswd="";
		int x = -1;
		LogonDataBean member= new LogonDataBean();
		member.setId(id);
		member.setPasswd(passwd);
		try{
			factory = getFactory();
			session = factory.openSession();
			
			member = (LogonDataBean)session.selectOne("logon.userCheck", member);
			
			if(member != null){
				dbpasswd = member.getPasswd();
				if(dbpasswd.equals(passwd)){
					x= 1;
				}else{
					x= 0;
				}
			}else{
				x = -1;
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			if(session !=null) try{session.close();} catch(Exception ex){}
		}
		return x;
	}
	public int confirmId(String id) throws Exception{
		SqlSessionFactory factory =null;
		SqlSession session = null;
		LogonDataBean member = new LogonDataBean();
		int x = -1;
		
		try{
			factory = getFactory();
			session = factory.openSession();
			member = (LogonDataBean)session.selectOne("logon.confirmId",id);
			
			if(member != null){
				x =1;
			}else{
				x = -1;
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			if(session != null) try{session.close();}catch(Exception ex){}
		}
		return x;
	}
	public LogonDataBean getMember(String id) throws Exception{
		SqlSessionFactory factory = null;
		SqlSession session = null;
		LogonDataBean member = null;
		try{
			factory = getFactory();
			session = factory.openSession();
			
			member = (LogonDataBean)session.selectOne("logon.getMember", id);
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			if (session != null) try { session.close(); } catch(Exception ex) {}
		}
		return member;
	}
	
	public void updateMember(LogonDataBean member) throws Exception{
		SqlSessionFactory factory = null;
		SqlSession session = null;
		try{
			factory = getFactory();
			session = factory.openSession();
			
			session.update("logon.updateMember", member);
			
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			if (session != null) try { session.close(); } catch(Exception ex) {}
		}
	}
	
	public int deleteMember(String id, String passwd) throws Exception{
		String dbpasswd = "";
		int x= -1;
		SqlSessionFactory factory = null;
		SqlSession session = null;
		LogonDataBean member = new LogonDataBean();
		member.setId(id);
		member.setPasswd(passwd);
		try{
			factory = getFactory();
			session = factory.openSession();
			
			member = (LogonDataBean)session.selectOne("logon.getMember", id);
			
			if(member != null){
				dbpasswd = member.getPasswd();
				if(dbpasswd.equals(passwd)){
					x = session.delete("logon.deleteMember", member);
				}else{
					x= 0;
				}
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			if (session != null) try { session.close(); } catch(Exception ex) {}
		}
		return x;
	}
	
	public ArrayList<ZipcodeBean> zipcodeRead(String area4){
		SqlSessionFactory factory = null;
		SqlSession session = null;
		ArrayList <ZipcodeBean> vecList = new ArrayList<ZipcodeBean>();
		System.out.println("area4 ::: "+area4);
		
		
		try{
			factory = getFactory();
			session = factory.openSession();
			
			vecList = (ArrayList)session.selectList("zipcode.zipcodeRead",area4);
			
		}catch(Exception e){
			System.out.println("Exception" + e);
		}finally{
			if (session != null) try { session.close(); } catch(Exception ex) {}
		}
		return vecList;
	}

}
