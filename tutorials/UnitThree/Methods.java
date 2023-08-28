package UnitThree;


class Person {
	// Data (Instance variables)
	String name;
	int age;
	/*
	 * Classes Contain
	 * 1. Data (Instance variables)
	 * 2. Subroutines (methods) 
	 */
	
	// Subroutines (Methods)
	void speak() {
		System.out.println("My name is: " + name + " and I am " + age + " years old!");
	}
	
	void sayHello() {
		System.out.println("Hello there!");
	}
}


public class Methods {

	public static void main(String[] args) {
		
		Person person1 = new Person();
		person1.name = "Cody Tester";
		person1.age = 24;
		
		person1.speak();
		person1.sayHello();
		
		Person person2 = new Person();
		person2.name = "Eden Aadsfas";
		person2.age = 25;
		
		System.out.println(person1.name);
		
		
	}

}
