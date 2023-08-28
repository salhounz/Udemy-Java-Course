package UnitSeven;

import java.util.ArrayList;

// Inheritantly extends Object as 
// everything is an Object in java
class Machine {

	@Override
	public String toString() {
		return "I am a machine!";
	}
	
	public void start() {
		System.out.println("Machine starting...");
	}

}

class Camera extends Machine {
	@Override
	public String toString() {
		return "I am a camera!";
	}
}

public class WildcardsAndGenerics {

	public static void main(String[] args) {

		ArrayList<Machine> list1 = new ArrayList<>();
		list1.add(new Machine());
		list1.add(new Machine());

		ArrayList<Camera> list2 = new ArrayList<>();
		list2.add(new Camera());
		list2.add(new Camera());

		
		// Does not work as ArrayList<Machine> is not the same w Camera
		//showList(list2);
		// works with wildcards
		// ? is a wildcard for unknown type
		
		showList(list1);
		showList(list2);
	}

	public static void showList(ArrayList<? extends Machine> list) {
		// TO use machine or camera methods you would
		// need to upcast or downcast
		// extends Machine allows for Machine and 
		// all subclass method access
		// can also use 'super Camera'
		// to act as a sort of lower bound
		for (Machine value : list) {
			System.out.println(value);
			value.start();
		}
	}

}
