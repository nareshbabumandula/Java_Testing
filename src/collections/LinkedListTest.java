package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListTest {

	/**
	 * @LinkedList class accepts/contains duplicate elements
	 * @LinkedList class maintains insertion order
	 * @LinkedList allows random access since array works on index basis
	 * @LinkedList is not synchronized
	 * @In LinkedList manipulation is fast because no shifting occurs
	 * @author NareshBabu
	 */
	public void LinkedListExample()
	{
		//Create LinkedList
		LinkedList<String> list = new LinkedList<String>(); 

		// Add objects to the linkedlist
		list.add("Pratima");
		list.add("Ajay");
		list.add("Nithya");
		list.add("Bindu");
		list.add("Swapna");
		list.add("Hari");
		list.add("Naresh");
		list.add("Kiran");
		list.add("Pratima");
		
		Iterator<String> itr = list.iterator();
		while (itr.hasNext()) {
			String string = (String) itr.next();
			System.out.println("Element value found as : " + string);
		}
		System.out.println(list.size()); // return the size of the collection
		list.addFirst("Poornima"); // add value and place in the first position in the list
		list.addLast("Sruthi"); // add value and place in the last position in the list
		System.out.println(list); //print all linkedlist objects
		System.out.println(list.indexOf("Kiran")); //returns the index of the element
		System.out.println(list.get(0)); //returns the first object
		System.out.println(list.remove(2)); // Removed the element found at index 2
		System.out.println(list); //print all linkedlist objects
		System.out.println(list.contains("Kiran")); // returns boolean value true/false based on availability of object in the linkedlist
		System.out.println(list.isEmpty()); // Returns boolean value
		list.clear(); // clearing the list
		System.out.println(list.isEmpty()); // Returns boolean value
		System.out.println(list);
		System.out.println(list.get(4)); //returns the object associated with the index
		

	}

	public static void main(String[] args) {

		LinkedListTest list = new LinkedListTest();
		list.LinkedListExample();
	}

}
