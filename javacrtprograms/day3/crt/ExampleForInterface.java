package day3.crt;

import java.util.Scanner;

interface FirstCalculator
{
	void add();
	void sub();
}

class MyCalculator1 implements FirstCalculator
{
	public void add()
	{
		int num1=20;
		int num2=60;
		int sum =num1+num2;
		System.out.println("the sum is :"+sum);
	}
	public void sub()
	{
		int num1=20;
		int num2=60;
		int diff =num1-num2;
		System.out.println("the difference is :"+diff);
	}
}

class MyCalculator2 implements FirstCalculator
{
	public void add()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enetr the first number :");
		int num1=s.nextInt();
		System.out.println("Enter the second number :");
		int num2=s.nextInt();
		int sum = num1+num2;
		System.out.println("the Sum is : "+sum);
	}
	public void sub()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enetr the first number :");
		int num1=s.nextInt();
		System.out.println("Enter the second number :");
		int num2=s.nextInt();
		int diff = num1-num2;
		System.out.println("the Difference is : "+diff);
	}
}

public class ExampleForInterface {

	public static void main(String[] args) {
		
		MyCalculator1 m1=new MyCalculator1();
		MyCalculator2 m2=new MyCalculator2();
		
		m1.add();
		m1.sub();
		m2.add();
		m2.sub();

	}

}
