

import java.util.Scanner;

public class SwitchStatement {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Please enter a command: ");
		String text = input.nextLine();
		
		// Most commonly switched on Integer & String
		// Cases must be constant values
		switch (text) {
		case "start":
			System.out.println("Machine started");
			break;

		case "stop":
			System.out.println("Machine stopped");
			break;

		default:
			System.out.println("Command not recognized");
		}

	}

}
