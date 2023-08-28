package tutorials.UnitFour;

class Thing {
	public static final int LUCKY_NUMBER = 21;

	public String name;
	
	//Sometimes known as class variables
	public static String description;
	
	
	
	public static int count = 0;
	
	public int id;
	
	
	public Thing() {
		id = count;
		count++;
	}
	
	public void showName() {
		System.out.println("ObjectID: " + id + " Description: " + description + " Name: " + name);
	}
	
	
	public static void showInfo() {
		System.out.println(description);
		//Cannot access instance variables 
		// Generates an error below 
		//System.out.println(name);
	}
	
}



public class StaticAndFinal {

	public static void main(String[] args) {
		
		Thing.description = "I am a thing";
		
		//System.out.println(Thing.description);
		
		Thing.showInfo();
		
		System.out.println("Before Count Is: " + Thing.count);
		
		Thing thing1 = new Thing();
		
		Thing thing2 = new Thing();
		
		System.out.println("After Count Is: " + Thing.count);

		
		thing1.name = "Bob";
		thing2.name = "Sue";
		
		thing1.showName();
		thing2.showName();
		
		System.out.println(Math.PI);
		
		//Math.PI = 3;
		
		System.out.println(Thing.LUCKY_NUMBER);

	}

}
