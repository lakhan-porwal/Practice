package in.co.rays.scanner;

import java.util.Scanner;

public class nextInt_NextLine_Solution {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter you name");
		String name = sc.nextLine();
		
		System.out.println("Enter your age");
		int age = sc.nextInt();
		
		sc.nextLine();
		
		System.out.println("Name => " + name);
		System.out.println("Age =>" + age);
		
		
	}

}
