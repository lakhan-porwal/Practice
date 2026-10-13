package in.co.rays.controle.statement;

public class Prime_Number {

	public static void main(String[] ags) {

		int n = 6;
		boolean isPrime = true;

		for (int i = 2; i < n; i++) {

			if (n % i == 0) {
				isPrime = false;
				break;
			}
		}
		if (isPrime) {
			System.out.println("Prime number");

		} else {
			System.out.println("This is not prime number ");
		}
	}
}
