package day4.crt;

class Demo
{
	void login() throws InvalidNameException
	{
		System.out.println("Invalid username");
	}
}

class Login extends Demo
{
	
}


public class ExampleThrow {

	public static void main(String[] args) {
		Demo d= new Demo();
		try {
			d.div();
		}
		catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}


	}

}
