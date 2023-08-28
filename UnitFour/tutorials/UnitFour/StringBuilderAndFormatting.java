package tutorials.UnitFour;

// Also includes String Buffer and is safe to access from
// multiple threads
public class StringBuilderAndFormatting {

	public static void main(String[] args) {
		/*
		 * Very Inefficient Way of Doing Things
		 * 
		 * String info = "";
		 * 
		 * info += "My name is Bob";
		 * 
		 * info += " "; info += "I am a builder";
		 * 
		 * System.out.println(info);
		 */

		// More efficient way of doing things
		StringBuilder sb = new StringBuilder("");

		sb.append("My name is sue");
		sb.append(" ");
		sb.append("I am a lion trainer");

		System.out.println(sb.toString());

		// More efficient ?

		StringBuilder s = new StringBuilder();
		s.append("My name is Roger").append(" ").append(" I am a skydiver");

		System.out.println(s.toString());

		// Formatting Strings
		System.out.println("Here is some text.\tThat was a tab.\nThat was a newline.");
		System.out.println("More text.");

		// %d is formatting for Integers
		// Aligns output in field that is 10 char wide with -10 aligning to the left
		System.out.printf("Total cost %10d: Quantity Is: %d\n", 5, 120);

		// Aligns the characters fine with 2 characters
		// Generally used to align things when formatting print
		for (int i = 0; i < 20; i++) {
			System.out.printf("%2d: %s some text here\n", i, "replace text");

		}
		// For Decimals essentially
		// Will automatically round
		System.out.printf("Total value: %.2f\n", 5.61834);
		System.out.printf("Total value: %-6.1f\n", 343.3434);

	}

}
