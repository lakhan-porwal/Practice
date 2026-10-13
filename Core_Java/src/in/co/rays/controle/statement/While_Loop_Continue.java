package in.co.rays.controle.statement;

public class While_Loop_Continue {
	public static void main(String[] args) {
		
		int i =1;
		
		while(i <= 10) {
			if(i == 5) {
				i++;
				continue;
			}
			System.out.println(i);
			i++;
		}
		
	}

}
