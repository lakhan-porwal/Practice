package in.co.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertEmployee {

	public static void main(String[] args) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/practice", "root", "root");

		Statement stmt = conn.createStatement();
		
		int i = stmt.executeUpdate("insert into employee values (1, 'Lakhan','TCS',80000)");
		
		System.out.println("Record Insert Successfully");
		
	}

}
