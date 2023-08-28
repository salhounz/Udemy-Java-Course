package UnitSix;

import java.util.ArrayList;
import java.util.HashMap;

public class UsingGenerics {

	public static void main(String[] args) {
		/*     Before Java 5
		 * 
		 * ArrayList list = new ArrayList();
		 * list.add("apple");
		 * list.add("banana");
		 * String fruit = (String) list.get(1);
		 * System.out.println(fruit);
		 * 
		 */
		
		
		// Older but okay style
		
		ArrayList<String> strings = new ArrayList<String>();
		strings.add("cat");
		strings.add("dog");
		strings.add("alligator");
		
		String animal = strings.get(1);
		System.out.println(animal);
		
		// There can also be more than one type argument
		
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		
		// Java 7 style
		// Not needed to put type in ending constructor call
		ArrayList<Integer> someList = new ArrayList<>();
		
		
		
		
		
	}

}
