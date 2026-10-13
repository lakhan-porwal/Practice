package in.co.rays.scanner;
import java.util.Scanner;

   /*
   nextInt() does not consume the line separator after the integer.
   Therefore, when nextLine() is called immediately afterward, 
   it may consume the leftover newline and return an empty string.*/

public class nextInt_NextLine {
	public static void main(String[ ] ags) {
		
	Scanner sc = new Scanner(System.in);

	System.out.println("Enter your age:");
	int age = sc.nextInt();

	System.out.println("Enter your name:");
	String name = sc.nextLine();

	System.out.println(age);
	System.out.println(name);

}
}