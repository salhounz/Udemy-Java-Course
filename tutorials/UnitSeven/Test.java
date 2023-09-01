package UnitSeven;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;

/*
 * NOT AN INDEPENDENT SECTION FROM THE UDEMY COURSE
 * 
 * THIS IS USED IN: MultipleExceptions.java
 * 
 */

public class Test {
	// How to have multiple exceptions
	public void run() throws IOException, ParseException {
		// throw new IOException();

		throw new ParseException("Error here!!", 2);
	}

	public void input() throws IOException, FileNotFoundException {

	}
}
