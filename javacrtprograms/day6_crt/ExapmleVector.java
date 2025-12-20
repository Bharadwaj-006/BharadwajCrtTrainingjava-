package day6_crt;

import java.util.Vector;

public class ExapmleVector {

	public static void main(String[] args) {
		
		
		Vector<String> v = new Vector<String>();
		
		v.add("JavaScript");
		v.add("PHP");
		v.add("Java");
		
		System.out.println(v);
		
		System.out.println("---------------------");
		
		System.out.println(v.get(2));
		
		System.out.println("---------------------");
		
		System.out.println(v.isEmpty());
		
		System.out.println("---------------------");
		
		System.out.println(v.contains(2));
		
		System.out.println("---------------------");
		
		System.out.println(v.size());
		
		
		System.out.println("---------------------");
		
		for(Object i : v)
		{
			System.out.println(i);
		}
		
		
	}

}
