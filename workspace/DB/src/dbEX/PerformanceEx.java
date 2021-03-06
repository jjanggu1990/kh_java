package dbEX;

import java.sql.*;

public class PerformanceEx {
	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException cnfe) {
			cnfe.printStackTrace();
		}
	}

	public static void main(String[] args) {

		long start;
		long end;
		Connection con = null;
		PreparedStatement pstmt = null;
		Statement stmt = null;
		Statement stmt2 = null;
		try {
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "scott", "tiger");
			stmt = con.createStatement();
			String sql = "create table performance(id varchar(10)," + "password varchar(10))";
			stmt.executeUpdate(sql);
			stmt2= con.createStatement();
			start = System.currentTimeMillis();
			for (int i = 0; i < 10000; i++) {
				stmt.executeUpdate("insert into performance values" + "('" + i + "','" + i + "')");
				stmt2.executeUpdate("delete from performance where id = "+i);
			
				
			}

			end = System.currentTimeMillis();
			System.out.println("Statement process time = " + (end - start));

			sql = "insert into performance values(?,?)";
			String sql2 = "delete from performance where id = ?";
			pstmt = con.prepareStatement(sql);
			PreparedStatement pstmt2 = con.prepareStatement(sql2);

			start = System.currentTimeMillis();
			for (int j = 0; j < 10000; j++) {
				pstmt.setString(1, "" + j);
				pstmt.setString(2, "" + j);
				pstmt.executeUpdate();
				pstmt2.setString(1, j+"");
				pstmt2.executeUpdate();
			}
			end = System.currentTimeMillis();

			System.out.println("PreparedStatement process time = " + (end - start));
			stmt.executeUpdate("drop table performance");
		} catch (SQLException ee) {
			ee.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
				if (stmt != null)
					stmt.close();
				if (con != null)
					con.close();
			} catch (SQLException se) {
			}
		}
	}
}
