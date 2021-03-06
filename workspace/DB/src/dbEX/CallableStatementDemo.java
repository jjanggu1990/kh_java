package dbEX;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CallableStatementDemo {
	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Connection con = null;
		CallableStatement cstmt = null;
		ResultSet rs = null;
		Statement stmt = null;
		try {
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "scott", "tiger");
			cstmt = con.prepareCall("{call adjust(?,?)}");
			cstmt.setString(1, "abc1011");
			cstmt.setFloat(2, 0.3f);
			cstmt.executeUpdate();
			stmt = con.createStatement();
			rs = stmt.executeQuery("select * from salary");
			
			while(rs.next()){
				for(int i=1;i<=rs.getMetaData().getColumnCount();i++){
					System.out.print(rs.getString(i)+"   ");
				}System.out.println();
			}
			
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (cstmt != null)
					cstmt.close();
				if (con != null)
					con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
