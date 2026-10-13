package in.co.rays.controle.statement;

/*Agar kisi number ke har digit ka factorial
nikalkar un sabko add karein, aur result original
number ke equal aaye, to wo Strong Number hota hai.*/

public class Strong_Number {
	public static void main(String[] args) {

		int n = 135;
		int original = n;
		int sum = 0;

		while (n != 0) {

			int digit = n % 10;
			int fact = 1;

			for (int i = 1; i <= digit; i++) {
				fact = fact * i;
			}
			sum = sum + fact;

			n = n / 10;

		}
		if (sum == original) {
			System.out.println("Strong Number");
		} else {
			System.out.println("Not Strong Number");
		}

	}

}
