package test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import in.co.rays.util.JDBCDataSource;

public class EmployeeModel {

	public void add(EmployeeBean bean) throws Exception{

		Connection conn = null;

		try {
			conn = JDBCDataSource.getConnection();

			conn.setAutoCommit(false);

			PreparedStatement pstmt = conn.prepareStatement("insert into employee values (?,?,?,?)");

			pstmt.setInt(1, bean.getId());
			pstmt.setString(2, bean.getEmployee_name());
			pstmt.setString(3, bean.getCompany_name());
			pstmt.setInt(4, bean.getSalary());

			int i = pstmt.executeUpdate();

			conn.commit();

			System.out.println("Record Insert Successfully" + i);

		} catch (SQLException e) {
			e.printStackTrace();
			conn.rollback();
			
		}finally {
			conn.close();
		}
	}

}
