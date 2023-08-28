package UnitFive;

class Frog {
	private int id;
	private String name;
	
	public Frog(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public String toString() {
		// most efficient way
		return String.format("%-4d: %s", id, name);
		/*
		// efficient compared to returning id + ": " + name
		StringBuilder sb = new StringBuilder();
		sb.append(id).append(": ").append(name);
		return sb.toString();
		*/
	}
}



public class ToStringMethod {

	public static void main(String[] args) {
		//methods all Java objects have
		Frog frog1 = new Frog(7, "Freddy");
		
		Frog frog2 = new Frog(5, "Roger");
		
		System.out.println(frog1);
		System.out.println(frog2);
		// tutorials.unitFive.Frog@15db9742 is the HashCode

	}

}
