package in.co.rays.controle.statement;

public class Neon_Number {
	public static void main(String[] args) {

		int n = 9;

		int square = n * n;
		int sum = 0;

		while (square != 0) {

			int digit = square % 10;

			sum = sum + digit;

			square = square / 10;
		}

		if (sum == n) {
			System.out.println("Neon Number");
		} else {
			System.out.println("Not Neon Number");
		}

	}

}
