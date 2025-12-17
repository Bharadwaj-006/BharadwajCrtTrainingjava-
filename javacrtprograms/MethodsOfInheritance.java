package javacrtprograms;

class Plane //parent
{
	void takeoff()
	{
		System.out.println("plane is take off");
	}
	void fly(){
		System.out.println("plane is flyng");
	}
	void land(){
		System.out.println("plane is landing");
	}
}
class Cargo extends Plane
{
	void fly() //overwritten
	{
		System.out.println("cargo plane is flyng at low height");
	}
	void carryCargo()   //specialized method
	{
		System.out.println("cargo plane carries cargo");
	}
}


class PassengerPlane extends Plane
{
	void fly()
	{
		System.out.println("Passenger plane is flyng with passengers");
	}
	void carry()
	{
		System.out.println("passenger plane is carrying passengers");
	}
}


class FighterPlane extends Plane
{
	void fly()
	{
		System.out.println("Fighter plane is  flying with soliders");
	}
	void fight()
	{
		System.out.println("fighter plane is used for fighting");
	}
}

public class MethodsOfInheritance {

	public static void main(String[] args) {
		
		Cargo c=new Cargo();
		PassengerPlane p=new PassengerPlane();
		FighterPlane f=new FighterPlane();
		c.carryCargo();
		p.takeoff();
		p.fly();
		p.land();
		f.fight();

	}

}
