package day4.crt;


/*
 * inside the try block we can add another try catch
 * inside catch block we can add try catch block
 * inside finally we can use try catch block 
 * we called this as nested try
 */




import java.util.Scanner;

public class ExceptionHandling {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the numerator :");
		int a = s.nextInt();
		System.out.println("Enter the denominator :");
		int b = s.nextInt();
		 try {
			 int quotient= a/b;
			 System.out.println("qotient :"+quotient);
		 }
		 catch(ArithmeticException e)
		 {
			 //e.printstacktrace
			 System.out.println("getting error because of "+e.getMessage());
		 }
		 catch(NullPointerException e)
		 {
			 //e.printstacktrace
			 System.out.println();
		 }
		 finally
		 {
			 System.out.println("this is inside the finally block");
		 }

		
	}

}
