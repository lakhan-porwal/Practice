package in.co.rays.scanner;

import java.util.Scanner;

public class TestInputScanner {
	
	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.err.println("Enter your age =>");
		int age = sc.nextInt();
		
		
		System.out.println("Your age is : " + age);
		
	}

}
