package day6_crt;

import java.util.*;

/*Collection framework :
 *  -Data structure is a way of storing or organizing the data.
 *  -collection is a container used to store a group of objects.
 *  - pre-defined interface --> java.util
 *  
 *  
 *  
 *  List -->
 *  
 *  pre-defined interface  --> java.util -->jdk 1.2
 *  
 *  Has 4 Implemented classes   -->  Arraylist,Vector,Stack,Linkedlist
 *  
 *  Specification
 *  1. Always it maintains insertion order.
 *  2. Duplicates are allowed.
 *  3. Index based
 *  4. Null can be inserted.
 *  
 *  ArrayList -->
 *  
 *  Pre-Defined class --> java.util--> jdk 1.2
 *  Specifications -->
 *  1. Initial Capacity --> 10
 *  2. Incremental Capacity --> ((CurrentCapacity*3)/2)+1
 *  3. UnderLined  data structure --> Resizable Array
 *  
 *  
 *  for-each loop / Enhanced for loop  --> Traversing --> Efficiency is more.
 *  
 *  
 *  Syntax :
 *  		for(datatype 
 * 
 */






public class ExampleForCollection {

	public static void main(String[] args) {
		
		/*
		 * List l4 = new LinkedList();
		List l2 = new Vector();
		List l3 = new Stack();
		*/
		List l = new ArrayList();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(50);
		System.out.println("List : "+ l);
		
		for(int i=1;i<=4;i++)
		{
			System.out.println(l.get(i));	
		}
		System.out.println("------------------------------");
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(30);
		al.add(50);
		al.add(70);
		System.out.println("ArrayList : "+ al);
		for(Object i : al)
		{
			System.out.println(i);
		}

	}

}
