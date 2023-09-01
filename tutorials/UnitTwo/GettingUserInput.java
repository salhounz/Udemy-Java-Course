package UnitTwo;

import java.util.Scanner;

public class GettingUserInput {

	public static void main(String[] args) {
		// Create Scanner object
		Scanner input = new Scanner(System.in);

		// Output prompt
		System.out.println("Enter an integer: ");

		// Wait for user to enter a line and retrieve that line
		int value = input.nextInt();

		// Output what the user entered
		System.out.println("You entered: " + value);

	}

}
