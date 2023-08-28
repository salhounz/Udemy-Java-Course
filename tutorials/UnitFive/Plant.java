package UnitFive;

public class Plant {
	// Anywhere a Plant is a name can be accessed
	// which is bad practice
	public String name;
	
	// Acceptable way for constants (final)
	public static final int ID = 8;
	
	private String type;
	
	protected String size;
	
	int height;
	
	public Plant() {
		this.name = "Fredd";
		this.type = "plant";
		this.size = "Medium";
		this.height = 123;
	}
}
