
package in.co.rays.controle.statement;

public class Palindrone_String {
	
	public static void main(String[] args) {
		
//		String str = "kanak";
//		
//		String reverse = "";
//		
//		for (int i = str.length() - 1; i >= 0; i--) {
//			reverse = reverse + str.charAt(i);
//			
//		}
//	if(str.equals(reverse)) {
//		System.out.println("Palindrone");
//	}else {
//		System.out.println("Not palindrone");
//	}

	String str = "nayaN";
	String reverse = "";
	
	for (int i = str.length() - 1; i >=0; i--) {
		reverse = reverse + str.charAt(i);
	}
	if (str.equals(reverse)) {
		System.out.println("Palindrone");
	}else {
		System.out.println("Not Palindrone");
	}
	
		
	}
}
