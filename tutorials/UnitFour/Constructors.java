package UnitFour;

class Machine {
	
	private String name;
	private int code;
	
	public Machine() {
		this("Arnie", 0);
		System.out.println("Constructor running!");
	}
	
	public Machine(String name) {
		this(name, 0);
		System.out.println("Naming constructor running!");
		
	}
	
	public Machine(String name, int code) {
		System.out.println("Constructor overloaded with name and code running!");
		this.name = name;
		this.code = code;
	}
}



public class Constructors {

	public static void main(String[] args) {
		
		Machine machine1 = new Machine();
		
		Machine machine2 = new Machine("Cody");
		
		Machine machine3 = new Machine("Chalky", 7);

	}

}
