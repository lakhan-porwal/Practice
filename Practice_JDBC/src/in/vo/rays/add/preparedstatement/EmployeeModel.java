package in.vo.rays.add.preparedstatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EmployeeModel {

	private int id;
	private int salary;
	private String company;
	private String employee_name;

	public void add(EmployeeBean bean) throws Exception {

		Connection conn = null;

		try {

			Class.forName("com.mysql.cj.jdbc.Driver");

			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/practice", "root", "root");

			conn.setAutoCommit(false);

			PreparedStatement pstmt = conn.prepareStatement("insert into employee values (?,?,?,?) ");

			pstmt.setInt(1, bean.getId());
			pstmt.setString(2, bean.getEmployee_name());
			pstmt.setString(3, bean.getCompany());
			pstmt.setInt(4, bean.getSalary());

			pstmt.executeUpdate();

			conn.commit();

		} catch (SQLException e) {
			e.printStackTrace();
			conn.rollback();

		} finally {
			conn.close();
		}

	}

}
