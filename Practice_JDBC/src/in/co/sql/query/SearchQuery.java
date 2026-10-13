package in.co.sql.query;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SearchQuery {

	public static void main(String[] args) throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/practice", "root", "root");
		
		Statement stmt = conn.createStatement();
		
		ResultSet rs = stmt.executeQuery("select * from employee");
		
		while (rs.next()) {
			
			System.out.println(rs.getInt("id"));
			System.out.println(rs.getString("employee_name"));
			System.out.println(rs.getString("company_name"));
			System.out.println(rs.getInt("salary"));
			
			System.out.println("--------------");
		}
	}

}
