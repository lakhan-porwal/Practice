package in.co.rays.model;

import java.sql.Connection;
import java.sql.PreparedStatement;

import in.co.rays.bean.HospitalBean;
import in.co.rays.util.JDBCDataSource;

public class HospitalModel {

	public void add(HospitalBean bean) {

		Connection conn = null;

		try {

			conn = JDBCDataSource.getConnection();

			if (conn == null) {
				System.out.println("Connection is null");
				return;
			}

			conn.setAutoCommit(false);

			PreparedStatement pstmt = conn.prepareStatement("insert into st_hospital values (?,?,?,?,?)");

			pstmt.setInt(1, bean.getPatientId());
			pstmt.setString(2, bean.getName());
			pstmt.setInt(3, bean.getAge());
			pstmt.setString(4, bean.getBloodGroup());
			pstmt.setString(5, bean.getDisease());

			int i = pstmt.executeUpdate();

			conn.commit();

			System.out.println("Record inserted successfully " + i + " row affected");

		} catch (Exception e) {

			e.printStackTrace();

			try {
				if (conn != null) {
					conn.rollback();
				}
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		}
	}
}
