package collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeMap;

public class TreeMapTest {

	/**
	 * @Treemap class contains keys and values
	 * @Treemap class contains only unique keys
	 * @Treemap class is not synchronized
	 * @Treemap class maintains an ascending order
	 * @Treemap class can have null key and multiple null values
	 */
	public void TreeMapExample()
	{
		HashMap<Integer, String> map = new HashMap<Integer,String>();
		System.out.println("Elements in hashmap before insertion are : " + map);
		
		map.put(1, "Selenium");
		map.put(2, "UFT");
		map.put(3, "TestComplete");
		map.put(4, "Ranorex");
		map.put(5, "CodedUI");
		map.put(6, "Sahi");
		map.put(7, "Oats");
		map.put(8, "Katalon Studio");
		map.put(8, "AutoIT");
		map.put(9, "Oats");
		
		System.out.println("Elements in hashmap after insertion are : " + map);
		System.out.println(map.get(5)); //prints the value associated with the key
		System.out.println(map.size()); //prints the no of elements store in the hashmap collection
		System.out.println(map.containsKey(3)); //returns boolean based on key availability
		System.out.println(map.containsValue("Sahi")); //returns boolean based on value availability
		System.out.println(map.isEmpty()); //returns boolean
		Collection<String> tool = map.values();
		map.remove(6); //removes the element with key from the map collection
		map.put(6, "Sikuli"); //add element to the collection
		
		for (Iterator iterator = tool.iterator(); iterator.hasNext();) {
			String string = (String) iterator.next();
			System.out.println(string);
		}
	}
	
	
	public static void main(String[] args) {
		TreeMapTest hm = new TreeMapTest();
		hm.TreeMapExample();

	}

}
