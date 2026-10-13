package in.co.rays.scanner;

import java.util.Scanner;

public class next {
	
	public static void main(String [] ags) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your name");
		String name = sc.next();
		
		System.out.println("Name =>" + name);
		
		sc.close();
		
	}
}
