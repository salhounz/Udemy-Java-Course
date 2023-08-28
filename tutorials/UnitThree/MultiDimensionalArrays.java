package UnitThree;

public class MultiDimensionalArrays {

	public static void main(String[] args) {
		int[] values = { 3, 5, 2343 };

		System.out.println(values[2]);

		// Array of Arrays essentially
		int[][] grid = { { 3, 5, 2343 }, 
				{ 2, 4 }, 
				{ 1, 2, 3, 4 } };

		// Row first, column second when searching
		// Searching row index 1 and index 1
		System.out.println(grid[1][1]);

		// Searching row 0 (first row) and index 2
		System.out.println(grid[0][2]);

		// Array of an Array of References to Strings technically
		String[][] texts = new String[2][3];

		texts[0][1] = "Hello there";
		System.out.println(texts[0][1]);

		for (int row = 0; row < grid.length; row++) {
			for (int col = 0; col < grid[row].length; col++) {

				// \t creates a tab character
				System.out.print(grid[row][col] + "\t");

			}
			System.out.println();
		}
		
		String[][] words = new String[2][];
		System.out.println(words[0]);
		words[0] = new String[3];
		words[0][1] = "Hi there";
		System.out.println(words[0][1]);
				

	}

}
