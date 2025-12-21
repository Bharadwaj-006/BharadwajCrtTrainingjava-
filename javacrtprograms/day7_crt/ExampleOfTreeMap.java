package day7_crt;
import java.util.*;

/*
 * TreeMap
 * pre-defined class in java.util package
 * jdk 1.2
 * Maintains the sorted order (i.e., sorting based on key in ascending order)
 * Underlined DS is  -->Binary Tree
 * 
 */



public class ExampleOfTreeMap {

	public static void main(String[] args) {
		
		TreeMap tm = new TreeMap();
		tm.put("Name", "Pavan");
		tm.put("Place", "Bengaluru");
		tm.put("Email", "Pavan@gmail.com");
		
		System.out.println(tm);
		
		System.out.println("-----------------------------------");
		
		for(Object i : tm.keySet())
		{
			System.out.println(i);
		}
		
		System.out.println("-----------------------------------");
		
		for(Object i : tm.entrySet())
		{
			System.out.println(i);
		}
		
		
		
		

	}

}
