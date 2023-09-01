package UnitSix;

/*
 * NOT AN INDEPENDENT SECTION FROM THE UDEMY COURSE
 * 
 * THIS IS USED IN: Polymorphism.java
 * 
 */
public class Tree extends Plant {

	@Override
	public void grow() {
		System.out.println("Tree growing...");
	}

	public void shedLeaves() {
		System.out.println("Leaves shedding...");
	}

}
