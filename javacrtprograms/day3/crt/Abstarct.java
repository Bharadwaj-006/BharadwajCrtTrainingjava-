package day3.crt;

/*
 * it is th process of hiding the implementation details from the user 
 * only the functionality will be providinf to the user
 * 
 * abstraction can be achieve with either abstract class or interfaces 
 * 
 * abstract class :  Is a restricted class that can't be used to create a objects
 * (to access it,it must inherited to the another class
 * 
 * abstract method can only be use in an abstract class,and it doesn't have body.the body its provided by the sub class (inherited) 
 * 
 * an abstract class can have both abstract and regular methods
 */


abstract class Food
{
	abstract void name();
	abstract void taste();
	abstract void smell();
	abstract void colour();
}
// if you are using partial methods the we need to use abstract for child class also 
// partial methods using only two methiods outoff 3
class Samosa extends Food
{
	void name() 
	{
		System.out.println("Samosa");
	}
	void taste() {
		System.out.println("crispy because of overheating");
	}
	void smell() {
		System.out.println("good smell because of vegetables");
	}
	void colour() {
		System.out.println("Brewnish");
	}
	
}

class Pakoda extends Food
{
	void name()
	{
		System.out.println("pakoda");
	}
	void taste() {
		System.out.println("crispy because of onions");
	}
	void smell() {
		System.out.println("good smell because of onions");
	}
	void colour() {
		System.out.println("Brewnish");
	}
}

class Jilebi extends Food
{
	void name()
	{
		System.out.println("Jilebi");
	}
	void taste() {
		System.out.println("sweet because of jeera");
	}
	void smell() {
		System.out.println("good smell because of sugar syrup");
	}
	void colour() {
		System.out.println("yellowish ");
	}
}

class Shop
{
	void selling(Food ref)
	{
		ref.name();
		ref.taste();
		ref.smell();
		ref.colour();
	}
}

public class Abstarct {

	public static void main(String[] args) {
		
		Samosa sa=new Samosa();
		Pakoda p=new Pakoda();
		Jilebi j=new Jilebi();
		
		Shop s=new Shop();
		s.selling(sa);
		s.selling(p);
		s.selling(j);

	}

}
