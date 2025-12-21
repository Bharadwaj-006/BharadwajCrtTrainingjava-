package day7_crt;



/*
 * COmparator -->
 *  
 *  pre-defined interface i java.util.package
 */







import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class NameComparator implements Comparator<Student>
{
	
	@Override
	public int compare(Student o1,Student o2)
	{
		return o1.getName().compareTo(o2.getName());
	}
}
class RollNumberComparator implements Comparator<Student>
{
	
	@Override
	public int compare(Student o1,Student o2)
	{
		return o1.getRollno().compareTo(o2.getRollno());
	}
}


class Student
{
	private String name;
	private String rollno;
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", rollno=" + rollno + "]";
	}
	public String getName() {
		return name;
	}
	public String getRollno() {
		return rollno;
	}
	public Student(String name, String rollno) {
		super();
		this.name = name;
		this.rollno = rollno;
	}
	
	
}

public class ExampleOfComparator {

	public static void main(String[] args) {
		
		Student s1 = new Student("Kamala Hassan","s22");
		Student s2 = new Student("Rajinikanth","s20");
		Student s3 = new Student("Mohanlal","s11");
		
		ArrayList al = new ArrayList();
		
		al.add(s1);
		al.add(s2);
		al.add(s3);
		Collections.sort(al, new RollNumberComparator());
		
		for(Object obj : al)
		{
			System.out.println(obj);
		}
		

	}

}
