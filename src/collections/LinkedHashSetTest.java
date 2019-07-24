package collections;

import java.util.LinkedHashSet;
import java.util.Iterator;

public class LinkedHashSetTest {

	/**
	 * @LinkedHashSet class cannot accept duplicate elements
	 * @LinkedHashSet allows null values
	 * @LinkedHashSet allows storing values by a mechanism called hashing
	 * @LinkedHashSet is not synchronized
	 * @In LinkedHashSet maintains insertion order
	 * @author NareshBabu
	 */
	public void LinkedHashSetExample()
	{
		//Create LinkedHashSet
		LinkedHashSet<String> list = new LinkedHashSet<String>(); 

		// Add objects to the LinkedHashSet
		list.add("Pratima");
		list.add("Ajay");
		list.add("Nithya");
		list.add("Bindu");
		list.add("Swapna");
		list.add("Hari");
		list.add("Naresh");
		list.add("Kiran");
		list.add("Pratima");
		
		System.out.println(list.size()); // return the size of the collection
	
		
		Iterator<String> itr = list.iterator();
		while (itr.hasNext()) {
			String string = (String) itr.next();
			System.out.println("Element value found as : " + string);
		}

		System.out.println(list); //print all LinkedHashSet objects
		System.out.println(list.remove(2)); // Removed the element found at index 2
		System.out.println(list); //print all LinkedHashSet objects
		System.out.println(list.contains("Kiran")); // returns boolean value true/false based on availability of object in the LinkedHashSet
		System.out.println(list.isEmpty()); // Returns boolean value
		list.clear(); // clearing the list
		System.out.println(list.isEmpty()); // Returns boolean value
		System.out.println(list);
	}

	public static void main(String[] args) {

		LinkedHashSetTest list = new LinkedHashSetTest();
		list.LinkedHashSetExample();
	}

}
