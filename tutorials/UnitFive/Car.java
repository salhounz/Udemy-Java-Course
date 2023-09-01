package UnitFive;

/*
 * NOT AN INDEPENDENT SECTION FROM THE UDEMY COURSE
 * 
 * THIS IS USED IN: Inheritance.java
 * 
 */

public class Car extends Machine {

	// Will check if there is a method to be overridden
	// which could cause errors if misspelled
	// and method start is generated on accident
	@Override
	public void start() {
		System.out.println("Car starting...");
	}

	@Override
	public void stop() {
		System.out.println("Car stopping...");
	}

	public void showInfo() {
		System.out.println("Car name: " + name);
	}

	public void wipeWindshield() {
		System.out.println("Wiping windshield...");
	}
}
