package in.co.rays.controle.statement;

//Agar kisi 3-digit number ke har digit ka cube (³) karke 
//sum original number ke equal aaye,
//to wo Armstrong number hota hai.

public class ArmStrong_Number {

	public static void main(String[] args) {
		int n = 153;
		int original = n;
		int sum = 0;

		while (n != 0) {
			int digit = n % 10;
			sum = sum + digit * digit * digit;
			n = n / 10;

		}
		if (original == sum) {
			System.out.println("ArmStrong");

		}else {
			System.out.println("NOt ArmStrong");
		}
	}

}
