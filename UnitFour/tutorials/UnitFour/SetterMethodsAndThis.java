package tutorials.UnitFour;


class Frog {
	private String name;
	private int age;
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	
	public void setName(String name) {
		// Use of this keyword referring to object and 
		// normal use of name referring to local variable 
		// that is passed
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setInfo(String name, int age) {
		setName(name);
		setAge(age);
	}
	
}




public class SetterMethodsAndThis {

	public static void main(String[] args) {
		
		Frog frog1 = new Frog();
		//frog1.name = "Bertie";
		// frog1.age = 1;
		
		// This represents Encapsulation
		frog1.setName("Bertie");
		frog1.setAge(1);
		
		System.out.println(frog1.getName());

	}

}
