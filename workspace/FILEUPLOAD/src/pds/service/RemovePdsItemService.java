package pds.service;

import java.sql.Connection;
import java.sql.SQLException;

import jdbc.JdbcUtil;
import jdbc.connection.ConnectionProvider;
import pds.dao.PdsItemDao;
import pds.model.PdsItem;

public class RemovePdsItemService {
	private static RemovePdsItemService instance = new RemovePdsItemService();
	public static RemovePdsItemService getInstance() {
		return instance;
	}
	
	private RemovePdsItemService() {
	}
	public boolean remove(PdsItem pdsItem) {
		Connection conn = null;
		try {
			conn = ConnectionProvider.getConnection();
			conn.setAutoCommit(false);
			
			int id = PdsItemDao.getInstance().remove(conn, pdsItem);
			if (id == -1) {
				JdbcUtil.rollback(conn);
				throw new RuntimeException("DB ���� �� ��");
			}
			conn.commit();
			return true;
		}catch(Exception e){
			throw new RuntimeException(e);
		}finally{
			if (conn != null) {
				try {
					conn.setAutoCommit(true);
				} catch (SQLException e) {
				}
			}
			JdbcUtil.close(conn);
		}
	}
}
