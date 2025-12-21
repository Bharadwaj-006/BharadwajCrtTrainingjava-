package day7_crt;

import java.util.HashMap;

/*Map
 * Pre-Defined interface in java
 * jdk 1.2
 * 
 * Map is a part of collection framework which does not extends the collection from 
 * Map is used to organize the data in terms of keys and value pair.
 * 1. keys cannot be duplicated.
 * 2. values can be duplicated.
 * 
 * one key and value together we call it as entry
 * 
 * Implementation classes:
 * 
 * 1.HashMap
 * 2.LinkedHasMap
 * 3.TreeMap
 * 4.Hash Table
 * 
 * Importance methods used wrt maps:
 * 1.put()
 * 2.get()
 * 3.clear()
 * 4.keyset()
 * 
 * HashMap -->
 * 
 * Pre-Defined class in java.util package
 * jdk 1.2
 * Insertion Order is not not maintained
 * UnderLined Data Structure is Hash Table 
 * 
 * 
 * 
 */


public class ExampleOfMap {

	public static void main(String[] args) {
		
		//Map m = new HashMap();
		HashMap<String , String> hm = new HashMap<String , String>();
		hm.put("Name", "Pavan");
		hm.put("Place","Bangalore");
		
		System.out.println(hm);
		
		System.out.println("-----------------------------------");
		
		System.out.println(hm.get("Name"));
		
		System.out.println("-----------------------------------");
		
		for(Object i : hm.values())
		{
			System.out.println(i);
		}
		
		System.out.println("-----------------------------------");
		
		for(Object i : hm.entrySet())
		{
			System.out.println(i);
		}

	}

}
