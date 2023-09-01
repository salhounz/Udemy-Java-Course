package UnitSeven;

class Mmachine {
	public void start() {
		System.out.println("Machine starting...");
	}
}

interface Plant {
	public void grow();
}

public class AnonymousClassesExample {

	public static void main(String[] args) {
		// This is a child class of machine
		// that has no name which is why
		// it is known as anonymous classes
		Mmachine machine1 = new Mmachine() {
			@Override
			public void start() {
				System.out.println("Camera snapping...");
			}
		};

		machine1.start();

		// Cannot instantiate interfaces
		Plant plant1 = new Plant() {

			public void grow() {
				System.out.println("Plant growing...");

			}

		};

		plant1.grow();

	}

}
