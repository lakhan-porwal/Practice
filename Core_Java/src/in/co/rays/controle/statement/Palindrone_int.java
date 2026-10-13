package in.co.rays.controle.statement;

public class Palindrone_int {
	public static void main(String[] args) {
		
//		int n = 1221;
//		
//		int original = n ;
//		int reverse = 0;
//		
//		while (n != 0) {
//			int digit = n % 10 ;
//			reverse = reverse * 10 + digit;
//			n = n/10;
//		}
//		if (original == reverse) {
//			System.out.println("Palindrone");
//		}else {
//			System.out.println("This is not palindrone ");
//		}
//		
		
		int n = 1010;
		
		int original = n;
		int reverse = 0;
		
		while( n != 0) {
			int digit = n % 10;
			
			reverse = reverse * 10 + digit;
			
			n = n /10;
		}
		if (original == reverse) {
			System.out.println("This is palindrone");
			
		}else {
			System.out.println("This is not palindrone");
		}
		
	}

}
