package UnitFive;
/*
 * NOT AN INDEPENDENT SECTION FROM THE UDEMY COURSE
 * 
 * THIS IS USED IN: Inheritance.java
 * 
 */
public class Machine implements Info {
	// Only accessed within Machine class
	// private String name = "Machine Type 1";

	// Accessible to what is within the same package (ToStringMethod, Car, etc)
	// String name = "Machine Type 1";

	// Within package and child class
	private int id = 7;
	protected String name = "Machine Type 1";

	public void start() {
		System.out.println("Machine starting...");
	}

	public void stop() {
		System.out.println("Machine stopping...");
	}

	@Override
	public void showInfo() {
		System.out.println("Machine ID: " + id);
	}

}
