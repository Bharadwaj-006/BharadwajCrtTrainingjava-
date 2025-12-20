package day6_crt;


import java.awt.List;
import java.util.*;

public class ExampleForLinkedList {

	public static void main(String[] args) {
		
		List<Integer> l = new LinkedList<Integer>();
		l.add("java");
		l.add(10);
		l.add(35.5);
		l.add(23);
		l.add(null);
		
		System.out.println("The List : " + l);
		
		for(Object i : l)
		{
			System.out.println(i);
		}
		System.out.println(l.getX(0));
		System.out.println(l.isEmpty());
		
		
		System.out.println("----------------------------");
		
		LinkedList l1 = new LinkedList();
		l1.add(20);
		l1.add(10);
		l1.add("Python");
		l1.add("Red");
		
		System.out.println("")
		
		
		

	}

}
