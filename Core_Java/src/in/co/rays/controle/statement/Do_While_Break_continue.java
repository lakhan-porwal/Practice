package in.co.rays.controle.statement;

public class Do_While_Break_continue {
//	public static void main(String[] args) {
//		
//		int i = 1;
//		do {
//			if (i == 6) {
//				break;
//			}
//			System.err.println(i);
//			i++;
//		}while(i <= 10);
//		
//	}

	public static void main(String[] args) {

		int i = 20;

		do {
			if (i == 30) {
				i++;
				continue;
			}
			System.out.println(i);
			i++;
			
		} while (i <= 50);
	}

}
