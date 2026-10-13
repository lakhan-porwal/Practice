package in.co.rays.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ResourceBundle;

public class JDBCDataSource {

	public static Connection getConnection() throws Exception {

		ResourceBundle rb = ResourceBundle.getBundle("in.co.rays.bundle.system");

		Connection conn = null;

		try {

			Class.forName("com.mysql.cj.jdbc.Driver");

			conn = DriverManager.getConnection(rb.getString("url"), rb.getString("username"), rb.getString("password"));

			System.out.println(conn.getCatalog());

		} catch (Exception e) {

			e.printStackTrace();

			if (conn != null) {
				conn.rollback();
			}
		}

		return conn;
	}
}