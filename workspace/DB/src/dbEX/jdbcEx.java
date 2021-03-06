package dbEX;
import java.sql.*;

public class jdbcEx {
	static {
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
		}
		catch( ClassNotFoundException cnfe){
			cnfe.printStackTrace();
		}
	}
	
	public static void main(String [] args){
		try{
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","scott","tiger");
			
			Statement stmt = con.createStatement();
			StringBuffer sb = new StringBuffer();
			sb.append("create table test1(id varchar2(10), age number)");
			int updateCount = stmt.executeUpdate(sb.toString());
			System.out.println("createCount : "+ updateCount);
			sb.setLength(0);
			sb.append("insert into test1 values ('abc1011',10)");
			updateCount = stmt.executeUpdate(sb.toString());
			System.out.println("insertConut : " + updateCount);
			
			sb.setLength(0);
			sb.append("select * from test1");
			ResultSet rs = stmt.executeQuery(sb.toString());
			while(rs.next()){
				System.out.print("id : " + rs.getString(1) + " , ");
				System.out.println("age : " + rs.getString("age"));
			}
			
			sb.setLength(0);
			sb.append("update test1 set id = 'abc2022', age=20 where id = 'abc1011'");
			updateCount = stmt.executeUpdate(sb.toString());
			System.out.println("Updatecount : " + updateCount);
			sb.setLength(0);
			sb.append("select * from test1");    
			rs = stmt.executeQuery(sb.toString());
			while(rs.next()){
				System.out.print("id : " + rs.getString(1)+ " , ");
				System.out.println("age : " +rs.getString("age"));
			}
			
			sb.setLength(0);
			sb.append("delete from test1");
			updateCount = stmt.executeUpdate(sb.toString());
			System.out.println("deleteCount : " +updateCount);
			
			sb.setLength(0);
			sb.append("drop table test1");
			updateCount = stmt.executeUpdate(sb.toString());
			System.out.println("droCount : " + updateCount);
			
			rs.close();
			stmt.close();
			con.close();
			
			
		}catch(SQLException sqle){
			System.out.println("Connection Error");
			sqle.printStackTrace();
		}
	}
}
