package tutorials.UnitSix;

class Machine {
	public void start() {
		System.out.println("Machine starting...");
	}
}

class Camera extends Machine {
	public void start() {
		System.out.println("Camera starting...");
	}

	public void snap() {
		System.out.println("Photo taken.");
	}
}

public class UpcastingAndDowncasting {

	public static void main(String[] args) {

		Machine machine1 = new Machine();
		Camera camera1 = new Camera();

		machine1.start();
		camera1.start();
		camera1.snap();

		// Upcasting
		Machine machine2 = camera1;
		// What start method is invoked?
		// Answer : Camera starting...
		// The actual object referred to by machine2 is a camera
		// However the variable Machine type decides what can
		// be called so it only allows for methods in Machine
		// so machine2.snap() does not work
		machine2.start();

		// Downcasting
		Machine machine3 = new Camera();
		Camera camera2 = (Camera) machine3;
		camera2.start();
		camera2.snap();
		// Inheritently unsafe
		// Does not work and leads to runtime error
		// as the Machine cannot have camera methods
		// even though it is technically correct and does
		// not generate errors prior to runtime
		Machine machine4 = new Machine();
		// Camera camera3 = (Camera) machine4;
		// camera3.start();
		// camera3.snap();

	}

}
