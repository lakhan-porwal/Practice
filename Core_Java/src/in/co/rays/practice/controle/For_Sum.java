package in.co.rays.practice.controle;

public class For_Sum {
	
	public static void main(String[] args) {
		int n = 12345;
		int sum = 0;
		while (n != 0) {
			int digit = n % 10;
			
			sum = sum + digit;
			
		}
		System.out.println(sum);
		
	}

}
