package in.co.rays.controle.statement;

public class Automorphic_Number {
	public static void main(String[] args) {
		
	int n = 25;

	int square = n * n;

	int temp = n;
	boolean isAutomorphic = true;

	while (temp != 0) {

	    if (square % 10 != temp % 10) {
	        isAutomorphic = false;
	        break;
	    }

	    square = square / 10;
	    temp = temp / 10;
	}

	if (isAutomorphic) {
	    System.out.println("Automorphic Number");
	} else {
	    System.out.println("Not Automorphic Number");
	}

}
}
