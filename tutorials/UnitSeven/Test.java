package UnitSeven;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;

/*
 * NOT AN ACTUAL MODULE 
 * only used for MultipleExcpetions module
 */

public class Test {
	// How to have multiple exceptions 
	public void run() throws IOException, ParseException {
		//throw new IOException();
		
		
		throw new ParseException("Error here!!", 2);
	}
	
	public void input() throws IOException, FileNotFoundException {
		
	}
}
