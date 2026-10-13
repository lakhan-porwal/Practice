package in.co.rays.controle.statement;

public class Print_Prime_Number {
//	public static void main(String[] args) {
//
//		for (int n = 2; n <= 100; n++) {
//			boolean isPrime = true;
//
//			for (int i = 2; i < n; i++) {
//
//				if (n % i == 0) {
//					isPrime = false;
//					break;
//				}
//			}
//			if(isPrime) {
//				System.out.println(n);
//			}
//		}
//
//	}
//---------------------------------------------------------------------
//	public static void main(String[] args) {
//
//		for (int n = 2; n <= 10; n++) {
//			boolean isPrime = true;
//
//			for (int i = 2; i < n; i++) {
//
//				if (n % i == 0) {
//					isPrime = false;
//					break;
//				}
//			}
//			if(isPrime) {
//				System.out.println(n);
//			}
//		}
//	}
	
	//-----------------------------------------------------------
	
	public static void main(String[] args) {
		
		for(int n = 2; n<= 20; n++) {
			boolean isPrime = true;
			
			for(int i = 2; i<n; i++) {
				
				if(n % i ==0) {
					isPrime = false;
					break;
				}
			}
			if(isPrime) {
				System.out.println(n);
			}
		}
	}
}
