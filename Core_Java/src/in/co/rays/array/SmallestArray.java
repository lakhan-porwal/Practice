package in.co.rays.array;

public class SmallestArray {
	
	public static void main(String[] args) {
		
		int[] marks = { 80, 90, 70, 69, 98 };

		int smallest = marks[0];

		for (int i = 1; i < marks.length; i++) {
			if (marks[i] < smallest) {
				smallest = marks[i];
			}
		}

		System.out.println(smallest);
	}
		
	}

