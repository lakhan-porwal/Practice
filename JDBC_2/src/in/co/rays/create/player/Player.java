package in.co.rays.create.player;

import java.sql.Connection;
import java.sql.PreparedStatement;

import in.co.rays.util.JDBCDataSource;

public class Player {

	public static void main(String[] ags) throws Exception {

		Connection conn = null;

		try {

			conn = JDBCDataSource.getConnection();

			conn.setAutoCommit(false);

			PreparedStatement pstmt = conn.prepareStatement(
					"create table player (player_id int primary key, player_name varchar(40), proffesion varchar(40), player_age int )");

			pstmt.execute();

			conn.commit();

			System.out.println("Create Table Successfully");

		} catch (Exception e) {
			e.printStackTrace();
			conn.rollback();

		} finally {
			conn.close();

		}

	}

}
