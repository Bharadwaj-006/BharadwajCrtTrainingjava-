package day4.crt;

import java.util.Scanner;


class InvalidUserException extends Exception
{
	public String getMessage()
	{
		return "Invalid user details,try again!";
		
	}
}




class User
{
	int User_Name=567825;
	int Password=987979;
	int UN,PWD;
	
	void acceptInput()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the User Name");
		UN =s.nextInt();
		System.out.println("Enter the password");
		PWD =s.nextInt();
	}
	void verify() throws InvalidUserException
	{
		if(User_Name == UN && Password == PWD)
		{
			System.out.println("Collect your Money");
		}
		else
		{
			//System.out.println("Invalid card details.Try Again!");
			InvalidUserException  i= new InvalidUserException();
			System.out.println(i.getMessage());
			throw i;
		}
	}
}

class Account
{
	void intiate()
	{
		User user = new User();
		try
		{
			user.acceptInput();//firstattempt
			user.verify();
		}
		catch(Exception e)
		{
			try
			{
				user.acceptInput();//secondattempt
				user.verify();
			}
			catch(Exception a) {
				try
				{
					user.acceptInput();//thirdattempt
					user.verify();
				}
				catch(Exception b)
				{
					System.out.println("Card is blocked");
				}
	
		}
		
	}
}


public class Login1{

	public static void main(String[] args) {
		
		Account acc = new Account();
		acc.intiate();

	}

}
