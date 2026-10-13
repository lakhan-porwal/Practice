package in.co.rays.controle.statement;

public class Else_If {

	public static void main(String[] ags) {

		int marks = 80;

		if (marks == 70) {
			System.out.println("Marks is 70");
		} else if (marks >= 81) {
			System.out.println("Marks is 81");
		} else if (marks <= 75) {
			System.out.println("Marks is 75");
		} else if (marks <= 80) {
			System.out.println("Marks is 80");
		} else {
			System.out.println(marks);
		}

	}
}
