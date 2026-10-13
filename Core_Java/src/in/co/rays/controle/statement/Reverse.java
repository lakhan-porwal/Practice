package in.co.rays.controle.statement;

public class Reverse {
	public static void main(String[] args) {
		
		int n = 1234567;
		int reverse = 0;
		 while(n != 0) {
			 int digit = n %10;
			 
			 reverse = reverse  *  10 + digit;
			 
			 n = n / 10;
		 }
		 System.out.println(reverse);
		
	}

}
