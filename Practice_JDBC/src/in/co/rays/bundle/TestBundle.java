package in.co.rays.bundle;

import java.util.ResourceBundle;

public class TestBundle {

	public static void main(String[] ags) {

		ResourceBundle rb = ResourceBundle.getBundle("com.mysql.cj.jdbc.Driver");

		System.out.println("driver");
		System.out.println("url");
		System.out.println("username");
		System.out.println("password");
	}
}
