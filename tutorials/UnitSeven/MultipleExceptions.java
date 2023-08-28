package UnitSeven;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;

public class MultipleExceptions {

	
	
	public static void main(String[] args) {
		Test test = new Test();
		
		
		try {
			test.run();
		} catch (IOException | ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/*
		 * Could also utilize to have an all/general 
		 * Exception handler as all IOExceptions,ParseExceptions
		 * etc. have the parent of Exception
		 * 
		 * try {
		 *     test.run();
		 * }   catch (Exception e) {
		 *     
		 *     e.printStackTrace();
		 * }
		 */
		
		// Works from subclass to parent
		// as FileNotFoundException is subclass
		// of IOException, if backwards it would
		// not compile
		
		// Ex. Child exception first parent exception last
		try {
			test.input();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
