package day6_crt;



class Car
{
	private String Name;
	
	private String Model;
	private String Colour;
	private String Milege;
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	
	public String getModel() {
		return Model;
	}
	public void setModel(String model) {
		Model = model;
	}
	public String getColour() {
		return Colour;
	}
	public void setColour(String colour) {
		Colour = colour;
	}
	public String getMilege() {
		return Milege;
	}
	public void setMilege(String milege) {
		Milege = milege;
	}
	public Car(String name, String model, String colour, String milege) {
		super();
		Name = name;
		Model = model;
		Colour = colour;
		Milege = milege;
	}
	
}




public class ExampleCar {

	public static void main(String[] args) {


		Car c = new Car("Mustang","Classic'85","Black","fullTank");
		System.out.println(c);
		
		System.out.println("---------------------");
		
		System.out.println(c.get(2));
		
		System.out.println("---------------------");
		
		System.out.println(c.isEmpty());
		
		System.out.println("---------------------");
		
		System.out.println(c.contains(2));
		
		System.out.println("---------------------");
		
		System.out.println(c.size());
		
		
		System.out.println("---------------------");
		
		for(Object i : c)
		{
			System.out.println(i);
		}
		
		
		
		
		
		
		
		
		

	}

}
