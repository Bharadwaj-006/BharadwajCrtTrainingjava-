package day6_crt;

//Linked List
/*
 *  Pre-Defined class --> java.util--> jdk 1.2
 *  data stores in the fprm of nodes --> AddressOfPreviousNode --> Object -->NextNodeAddress
 *  UnderLined DS --> Doubly linked list
 *  
 *  Generics :
 *    Used to specify the element type
 *    jdk 1.5 
 *    <ElementType> 
 *    
 *    
 *    
 *    
 *    Wrapper class
 *     
 *    All the wrapper classes are predefined classes in java.lang package
 *    All the wrapper classes overridden toString().
 *    collection does not support primitive datatypes.
 *    Non-primitive version of primitive datatypes --> Wrapper class
 *    
 *    
 *    byte --> Byte
 *    short --> Short
 *    int --> Integer
 *    long --> Long
 *    char --> Character
 *    boolean --> Boolean
 *    double --> Double
 *    float --> Float
 *    
 *    Auto-Boxing
 *    converting primitive datatype into Non-primitive datatype. 
 *    Auto-UnBoxing
 *    converting Non-primitive datatype into primitive datatype. 
 *    
 */





import java.util.LinkedList;

class Employee
{
	private String empName;
	private String empDesignation;
	private String empEmail;
	
	public Employee(String empName, String empDesignation, String empEmail) {
		super();
		this.empName = empName;
		this.empDesignation = empDesignation;
		this.empEmail = empEmail;
	}
	public String getEmpName() {
		return empName;
	}
	public String getEmpDesignation() {
		return empDesignation;
	}
	public String getEmpEmail() {
		return empEmail;
	}
	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", empDesignation=" + empDesignation + ", empEmail=" + empEmail + "]";
	}
}

public class Example2LinkedList {

	public static void main(String[] args) {
		Employee e1 = new Employee("Bharadwaj","Student","bharadwaj@gmail.com");
		Employee e2 = new Employee("Arohi","Rebel","arohi@gmail.com");
		
		LinkedList<Employee> l1 =  new LinkedList<Employee>();
		l1.add(e1);
		l1.add(e2);
		
		for(Object obj : l1)
		{
			System.out.println(obj);
		}
		
		//Autoboxing
		int a= 10;
		Integer i =new Integer(a);
		
		//Auto-Unboxing
		Integer in =new Integer(a);
		int b= in;

	}

}
