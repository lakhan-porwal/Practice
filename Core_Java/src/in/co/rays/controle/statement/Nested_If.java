package in.co.rays.controle.statement;

public class Nested_If {

	public static void main(String[] args) {

		int age = 18;
		boolean hasLicense = true;

		if (age >= 18) {

			if (age >=20) {
				System.out.println("you can drive");

			} else {
				System.out.println("Get a License first");
			}

		} else {
			System.out.println("you are underage");
		}

	}
}
