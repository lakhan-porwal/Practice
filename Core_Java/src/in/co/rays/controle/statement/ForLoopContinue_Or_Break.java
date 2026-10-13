package in.co.rays.controle.statement;

public class ForLoopContinue_Or_Break {

	public static void main(String[] args) {

		for (int i = 1; i <= 10; i++) {

			if (i == 5) {
//				 continue;
				break;

			}
			System.out.println(i);
		}

	}
}
