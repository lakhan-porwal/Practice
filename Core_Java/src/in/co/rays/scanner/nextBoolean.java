package in.co.rays.scanner;

import java.util.Scanner;

public class nextBoolean {
	
	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Are you a student");
		boolean  student = sc.nextBoolean();
		
		System.out.println("Student => " + student);
		
	}

}
