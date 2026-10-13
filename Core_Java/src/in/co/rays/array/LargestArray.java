package in.co.rays.array;

public class LargestArray {

	public static void main(String[] ags) {

		
		  int[] marks = {80,90,70,69,98};
		  
		  int largest = marks[0];
		  
		  for (int i = 1; i < marks.length; i++) { if(marks[i] > largest) { largest =
		  marks[i]; } }
		  
		  System.out.println(largest); }
		 
}
