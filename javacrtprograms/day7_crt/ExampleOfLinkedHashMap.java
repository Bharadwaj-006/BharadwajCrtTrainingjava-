package day7_crt;
import java.util.*;

/*
 * LinkedHashMap
 * 
 * -pre-defined class in java.util
 * jdk1.2
 * Insertion order is maintained
 * Underlined DS --> LinkedList and HashTable
 */







public class ExampleOfLinkedHashMap {

	public static void main(String[] args) {
		
		LinkedHashMap lhm = new LinkedHashMap();
		lhm.put("Name", "Pradhuman");
		lhm.put("Age", 67);
		
		System.out.println(lhm);
		
		System.out.println("-----------------------------------");
		
		System.out.println(lhm.get(0));
		
		System.out.println("-----------------------------------");
		
		for(Object i : lhm.keySet())
		{
			
			System.out.println(i);
		}
		
		System.out.println("-----------------------------------");
		
		for(Object i : lhm.values())
		{
			
			System.out.println(i);
		}
		
		System.out.println("-----------------------------------");
		
		for(Object i : lhm.entrySet())
		{
			System.out.println(i);
		}

	}

}
