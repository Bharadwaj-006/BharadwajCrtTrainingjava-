package day3.crt;

import java.util.Scanner;

abstract class Calculator
{
	abstract void add();
	abstract void sub();
	abstract void mul();
	abstract void div();
}

class MyCalculator extends Calculator
{
	void add()
	{
		int num1=20;
		int num2=60;
		int sum =num1+num2;
		System.out.println("the sum is :"+sum);
	}
	void sub()
	{
		int num1=20;
		int num2=60;
		int diff =num1-num2;
		System.out.println("the difference is :"+diff);
	}
	void mul()
	{
		int num1=20;
		int num2=60;
		int mul =num1*num2;
		System.out.println("the multiplication is :"+mul);
	}
	void div()
	{
		int num1=20;
		int num2=60;
		int div =num1/num2;
		System.out.println("the quotient is :"+div);
	}
}

class MyCalculator2 extends Calculator
{
	void add()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enetr the first number :");
		int num1=s.nextInt();
		System.out.println("Enter the second number :");
		int num2=s.nextInt();
		int sum = num1+num2;
		System.out.println("the Sum is : "+sum);
	}
	void sub()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enetr the first number :");
		int num1=s.nextInt();
		System.out.println("Enter the second number :");
		int num2=s.nextInt();
		int diff = num1-num2;
		System.out.println("the Difference is : "+diff);
	}
	void mul()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enetr the first number :");
		int num1=s.nextInt();
		System.out.println("Enter the second number :");
		int num2=s.nextInt();
		int mul = num1*num2;
		System.out.println("the mul is : "+mul);
	}
	void div()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enetr the first number :");
		int num1=s.nextInt();
		System.out.println("Enter the second number :");
		int num2=s.nextInt();
		int div = num1/num2;
		System.out.println("the quotient is : "+div);
	}
}

class Math
{
	void arthimetic(Calculator c)
	{
		c.add();
		c.sub();
		c.mul();
		c.div();
	}
}



public class Abstraction {

	public static void main(String[] args) {
		
		MyCalculator mc1=new MyCalculator();
		MyCalculator2 mc2=new MyCalculator2();
		
		Math m=new Math();
		m.arthimetic (mc1);
		System.out.println("--------------------------------------");
		m.arthimetic(mc2);

	}

}
