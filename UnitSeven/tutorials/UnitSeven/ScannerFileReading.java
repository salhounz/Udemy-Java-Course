package tutorials.UnitSeven;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerFileReading {

	
	
	public static void main(String[] args) throws FileNotFoundException {
		
		String filename = "/Users/salhounz/Desktop/eclipse-workspace/UdemyJavaCourseForBeginners/src/tutorials/UnitSeven/test.txt";
		
		File textFile = new File(filename);
		
		Scanner in = new Scanner(textFile);
		
		int value = in.nextInt();
		System.out.println("Read Value: " + value);
		
		// Used to read the carriage return and newline
		// character that is read by .nextLine()
		// but not read by .nextInt()
		in.nextLine();
		
		int count = 2;
		while(in.hasNextLine()) {
			
			String line = in.nextLine();
			System.out.println(count + ": " + line);
			count++;
		}
		
		
		
		in.close();

	}

}
