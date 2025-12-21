package day7_crt;

/*
 * Comparable is a Pre-Defined interface in java.lag package
 * Comparable was introduced from jdk 1.2
 * comparable interface as the abstract called as compareTo()
 * Comparable is used to compare objects and sort them
 * DEfault Sorting
 * 
 * Syntax :public intcompareTo()
 * {
 * }
 * 
 * compareTo() return : +1 if it is greater than 
 * 						-1 if it is lesser than
 * 						 0 if the object is same
 * 
 * Rules to make the objects as comparable/Rules in order to work with comparable interface.
 * 
 * 1.class has to implement comparable interface.
 * 2.specify the generics type of which objects we are going to compare.
 * 3.override the compareTo() by specifyingthe business logic of comparing
 * 
 */




import java.util.TreeSet;

class Car implements Comparable<Car>
{
	int cost;
	
	Car(int cost)
	{
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "Car [cost=" + cost + "]";
	}
	
	@Override
	public int compareTo(Car c)
	{
		return this.cost - c.cost;
	}
	
	
}

public class ExampleofComparable {

	public static void main(String[] args) {
		
		Car c1 = new Car(300);
		Car c2 = new Car(100);
		Car c3 = new Car(500);
		
		TreeSet<Car> ts = new TreeSet();
		ts.add(c1);
		ts.add(c2);
		ts.add(c3);
		
		for(Car i : ts)
		{
			System.out.println(i);
		}
		

	}

}
