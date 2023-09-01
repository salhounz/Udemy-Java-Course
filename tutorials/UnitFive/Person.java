package UnitFive;

/*
 * NOT AN INDEPENDENT SECTION FROM THE UDEMY COURSE
 * 
 * THIS IS USED IN: Interfaces.java
 * 
 */
public class Person implements Info {
	private String name;

	public void start() {
		System.out.println("Starting Person!");
	}

	public void greet() {
		System.out.println("Hello there");
	}

	public Person(String name) {
		super();
		this.name = name;
	}

	@Override
	public void showInfo() {
		System.out.println("Person's name is: " + name);

	}
}
