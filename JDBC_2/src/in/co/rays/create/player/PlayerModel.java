package in.co.rays.create.player;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import in.co.rays.util.JDBCDataSource;

public class PlayerModel {

	public void add(PlayerBean bean) throws Exception {

		Connection conn = null;

		try {
			conn = JDBCDataSource.getConnection();

			conn.setAutoCommit(false);

			PreparedStatement pstmt = conn.prepareStatement("insert into player values(?,?,?,?)");

			pstmt.setInt(1, bean.getPlayer_id());
			pstmt.setString(2, bean.getPlayer_name());
			pstmt.setString(3, bean.getProffesion());
			pstmt.setInt(4, bean.getPlayer_age());

			int i = pstmt.executeUpdate();

			conn.commit();

			System.out.println("Record Insert Successfully" + i);

		} catch (Exception e) {
			e.printStackTrace();
			conn.rollback();

		} finally {
			conn.close();
		}

	}

	public void update(PlayerBean bean) throws Throwable {

		Connection conn = null;

		try {
			conn = JDBCDataSource.getConnection();

			conn.setAutoCommit(false);

			PreparedStatement pstmt = conn.prepareStatement(
					"update player set player_name = ?, proffesion = ?, player_age = ? where player_id = ?");

			pstmt.setString(1, bean.getPlayer_name());
			pstmt.setString(2, bean.getProffesion());
			pstmt.setInt(3, bean.getPlayer_age());
			pstmt.setInt(4, bean.getPlayer_id());

			int i = pstmt.executeUpdate();

			conn.commit();

			System.out.println("Recorde data successfully" + i);

		} catch (Exception e) {

			e.printStackTrace();
			conn.rollback();

			// TODO: handle exception
		
	}

}
	
	public void delete(int player_id) throws Throwable {
		
		Connection conn = null;
		
		try {
			conn = JDBCDataSource.getConnection();
			
			conn.setAutoCommit(false);
			
			PreparedStatement pstmt = conn.prepareStatement("delete from player where player_id = ?");
			
			pstmt.setInt(1, player_id);
			
			int i = pstmt.executeUpdate();
			
			conn.commit();
			
			System.out.println("Record Delete successfully " + i);
		}catch(Exception e) {
			e.printStackTrace();
			conn.rollback();
			
		}
	}
	
	public PlayerBean findByPk(int player_id) throws Throwable{
		
		Connection conn = null;
		PlayerBean bean = new PlayerBean();
		
		try {
			
		conn = JDBCDataSource.getConnection();
		
		conn.setAutoCommit(false);
		
		PreparedStatement pstmt = conn.prepareStatement("select * from player where player_id = ?");
		
		pstmt.setInt(1, player_id);
		
		ResultSet rs = pstmt.executeQuery();
		
         while(rs.next()) {
        	 
        	 bean.setPlayer_id(rs.getInt("player_id"));
        	 bean.setPlayer_name(rs.getString("player_name"));
        	 bean.setProffesion(rs.getString("proffesion"));
        	 bean.setPlayer_age(rs.getInt("player_age"));
         }
		
			
		} catch (Exception e) {
			e.printStackTrace();
			
		}finally {
			conn.close();
		}
		return bean;
		
	}
	
	 
}
