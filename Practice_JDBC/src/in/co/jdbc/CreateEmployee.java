package in.co.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateEmployee {

	public static void main(String[] ags) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/practice", "root", "root");

		Statement stmt = conn.createStatement();

		int i = stmt.executeUpdate(
				"create table employee(id int primary key, employee_name varchar(45), company_name varchar(45), salary int) ");

	}

}
