package tutorials.UnitSeven;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class HandlingExceptions {

	
	public static void main(String[] args) throws FileNotFoundException {
		
		File file = new File("tesert.txt");
		
		/*    Shows how to handle with try catch
		try {
			FileReader fr = new FileReader(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
		
		// Shows how to handle Exception with other method
		FileReader fr = new FileReader(file);
		

	}

}
