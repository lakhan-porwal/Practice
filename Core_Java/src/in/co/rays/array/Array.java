package in.co.rays.array;

public class Array {

//An array is a collection of elements of the same data type
//stored under a single variable name.	

	/*
	 * public static void main(String[] ags) {
	 * 
	 * int[] marks = { 80, 90, 78, 87, 67 };
	 * 
	 * marks[0] = 80; marks[1] = 90; marks[2] = 78; marks[3] = 87; marks[4] = 67;
	 * 
	 * System.out.println(marks[2]);
	 * 
	 * }
	 */
	
	public static void main(String [] ags) {
		
		int [] marks = new int [5];
		
		marks[0] = 10;
		marks[1] = 20;
		marks[2] = 30;
		marks[3] = 40;
		marks[4] = 50;
		
		
		System.out.println(marks[1]);
		
		for(int i = 0; i < marks.length; i++) {
			System.out.println(i);
		}
		
	}

}
