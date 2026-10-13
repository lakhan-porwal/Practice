package in.co.rays.controle.statement;

public class PerectSquare {

	public static void main(String[] ags) {

		int n = 25;

		boolean isPerfectSquare = false;

		for (int i = 1; i * i <= n; i++) {
			
			if (i * i == n) {
				isPerfectSquare = true;
				break;
			}
			
		}if (isPerfectSquare) {
			System.out.println("perfect");
		} else {
			System.out.println("not perfect");
		}

	}
}