package in.co.rays.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class JDBCDataSource {
	public static Connection getConnection() throws Exception {

		ResourceBundle rb = ResourceBundle.getBundle("in.co.jdbc.system");

		Connection conn = null;

		try {

			Class.forName("com.mysql.cj.jdbc.Driver");

			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/practice", "root", "root");

			System.out.println("DataBase =>" + conn.getCatalog());

		} catch (Exception e) {

			e.printStackTrace();
			conn.rollback();
		} finally {
			conn.close();
		}
		return conn;

	}

}
