package collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {

	/**
	 * @HashSet class cannot accept duplicate elements
	 * @HashSet allows null values
	 * @HashSet allows storing values by a mechanism called hashing
	 * @HashSet is not synchronized
	 * @In Hashset is more recommended for search operations
	 * @author NareshBabu
	 */
	public void HashSetExample()
	{
		//Create HashSet
		HashSet<String> list = new HashSet<String>(); 

		// Add objects to the hashset
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

		System.out.println(list); //print all hashset objects
		System.out.println(list.remove(2)); // Removed the element found at index 2
		System.out.println(list); //print all hashset objects
		System.out.println(list.contains("Kiran")); // returns boolean value true/false based on availability of object in the hashset
		System.out.println(list.isEmpty()); // Returns boolean value
		list.clear(); // clearing the list
		System.out.println(list.isEmpty()); // Returns boolean value
		System.out.println(list);
	}

	public static void main(String[] args) {

		HashSetTest list = new HashSetTest();
		list.HashSetExample();
	}

}
