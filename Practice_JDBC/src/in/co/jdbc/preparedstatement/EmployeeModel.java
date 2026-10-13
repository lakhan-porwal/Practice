package in.co.jdbc.preparedstatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class EmployeeModel {

	

	public void add(int id, String employee_name, String company_name, int salary) throws Exception {

		Connection conn = null;

		try {

			Class.forName("com.mysql.cj.jdbc.Driver");

			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/practice", "root", "root");

			conn.setAutoCommit(false);

			PreparedStatement pstmt = conn.prepareStatement("insert into employee values (?,?,?,?)");

			pstmt.setInt(1, id);
			pstmt.setString(2, employee_name);
			pstmt.setString(3, company_name);
			pstmt.setInt(4, salary);

			pstmt.executeUpdate();

			conn.commit();

			System.out.println("Record insert successfully");

		} catch (Exception e) {
			e.printStackTrace();
			conn.rollback();

		} finally {
			conn.close();

		}

	}

}
