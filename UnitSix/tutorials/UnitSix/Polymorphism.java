package tutorials.UnitSix;

// OOP Concept meaning many shapes

public class Polymorphism {

	public static void main(String[] args) {

		Plant plant1 = new Plant();
		Tree tree = new Tree();
		/*
		 * Plant plant2 = plant1;
		 * 
		 * - Have two references to the same object
		 * 
		 * OR Plant plant2 = tree;
		 * 
		 * - Because Tree is a subclass of Plant it - it can also be used here due to
		 * polymorphism
		 */

		Plant plant2 = tree;
		// Is it Tree growing or Plant growing?
		// Answer - Tree growing due to the Plant referencing
		// the tree
		plant2.grow();

		tree.shedLeaves();

		doGrow(tree);

		/*
		 * This does not work due to plant2 being a Plant so it does not have the
		 * shedLeaves() method available as that is only available to Tree's
		 */
		// plant2.shedLeaves();
	}

	// Example of how you could use Polymorphism
	/*
	 * method expects a type Plant so due to Tree being a subclass of Plant it is
	 * also allowed to be passed
	 */
	public static void doGrow(Plant plant) {
		plant.grow();
	}

}
