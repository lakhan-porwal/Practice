package in.co.rays.controle.statement;

public class Spy_Number {
	public static void main(String[] args) {
		int n = 123;

		int sum = 0;
		int product = 1;

		while (n != 0) {

		    int digit = n % 10;

		    sum = sum + digit;

		    product = product * digit;

		    n = n / 10;
		}

		if (sum == product) {
		    System.out.println("Spy Number");
		} else {
		    System.out.println("Not Spy Number");
		}
	}

}
