package javacrtprograms;

/*class Student{
	private String name;
	private String rollno;
	private String email;
	private int age;
	
	public void setData(String x, String y , String z, int a) {
		name = x;
		rollno = y;
		email = z;
		age = a ;
		
	}
	public String getName() {
		return name;
	}
	
	public String getRollno() {
		return rollno;
	}
	
	public String getEmail() {
		return email;
	}
	
	public int getAge() {
		return age;
	}
	
	
	
}

public class Encapsulation {

	public static void main(String[] args) {
		
		
		Student s=new Student();
		s.setData("bhuvan","3303", "bhuvanbham@gmai.com", 26);
		
		System.out.println("the student name :  "+s.getName());
		System.out.println("the student rollno :  "+s.getRollno());
		System.out.println("the student emailid :  "+s.getEmail());
		System.out.println("the student age :  "+s.getAge());
		
		

	}

}*/
//car example

class Car{
	public String name;
	public String model;
	public String colour;
	public float milage;
	
	
	public void setData(String x, String y , String z, float a) {
		name = x;
		model = y;
		colour = z;
		milage = a ;
		
	}
	
	public String getName() {
		return name;
	}
	
	public String getModel() {
		return model;
	}
	
	public String getColour() {
		return colour;
	}
	
	public float getMilage() {
		return milage;
	}
	
	
	
}

public class Encapsulation {

	public static void main(String[] args) {
		
		
		Car s=new Car();
		s.setData("Bugatti","veyron", "Blood Red", 12.5f);
		
		System.out.println("the student name :  "+s.getName());
		System.out.println("the student rollno :  "+s.getModel());
		System.out.println("the student emailid :  "+s.getColour());
		System.out.println("the student age :  "+s.getMilage());
		
		

	}

}



