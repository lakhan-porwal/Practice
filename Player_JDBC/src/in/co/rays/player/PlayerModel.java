package in.co.rays.player;

import java.sql.Connection;
import java.sql.PreparedStatement;

import in.co.rays.util.JDBCDataSource;

public class PlayerModel {

	public void add(PlayerBean bean) throws Exception {

		Connection conn = null;

		try {

			conn = JDBCDataSource.getConnection();

			conn.setAutoCommit(false);

			PreparedStatement pstmt = conn.prepareStatement("insert into player values (?,?,?,?)");

			pstmt.setInt(1, bean.getPlayer_id());
			pstmt.setString(2, bean.getPlayer_name());
			pstmt.setString(3, bean.getProffesion());
			pstmt.setInt(4, bean.getPlayer_age());

			int i = pstmt.executeUpdate();

			conn.commit();

			System.out.println("Record insert successfully" + i);

		} catch (Exception e) {
			e.printStackTrace();
			conn.rollback();

		} 

	}

}
