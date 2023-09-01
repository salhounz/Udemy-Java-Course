package UnitThree;

public class ArraysOfStrings {

	public static void main(String[] args) {
		// Create String[] with room for 3 Strings
		String[] words = new String[3];

		// Assigning the memory allocated to actual data
		words[0] = "Hello";
		words[1] = "to";
		words[2] = "you";

		System.out.println(words[2]);

		String[] fruits = { "apple", "banana", "pear", "kiwi" };

		for (String fruit : fruits) {
			System.out.println(fruit);
		}

		int value = 123;

		String text = null;

		System.out.println(text);

		// Only allocating enough memory for 2 references to Strings
		String[] texts = new String[2];

		System.out.println(texts[0]);

		texts[0] = "one";

	}

}
