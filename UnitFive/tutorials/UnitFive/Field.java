package tutorials.UnitFive;

public class Field {
	private Plant plant = new Plant();
	
	public Field() {
		// Protected works in same class, subclass
		// and package
		System.out.println(plant.size);
	}
}
