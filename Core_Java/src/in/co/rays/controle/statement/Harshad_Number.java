package in.co.rays.controle.statement;

//           Aisa number jo apne digits ke sum se completely divisible ho,
//           use Harshad Number kehte hain.

public class Harshad_Number {
	public static void main(String[] args) {
		int n = 18;
		int original = n;
		int sum = 0;

		while (n != 0) {
			int digit = n % 10;

			sum = sum + digit;

			n = n / 10;

		}
		if (original % sum == 0) {
			System.out.println("Harshad Number");
		} else {
			System.out.println("Not Harshad Number");
		}
	}

}
