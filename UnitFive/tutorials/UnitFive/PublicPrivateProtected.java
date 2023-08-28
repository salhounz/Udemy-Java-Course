package tutorials.UnitFive;

public class PublicPrivateProtected {

	public static void main(String[] args) {
		
		Plant plant = new Plant();
		System.out.println(plant.name);
		System.out.println(plant.ID);
		
		// Wont work if type is private
		//System.out.println(plant.type);
		
		System.out.println(plant.height);
	}

}
