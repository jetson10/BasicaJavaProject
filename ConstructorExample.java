package com.javaprograms;

public class ConstructorExample {
	
	//normal method
	public void print()
	{
		
		System.out.println("Normal Method");
	}
	
	//Default method for your class

	ConstructorExample()
	{
		System.out.println("This is a constructor");
		
	}
	
	//Parametrized Consturcotor
	ConstructorExample(int a, int b)
	{
		int c = a+b;
		System.out.println(c);
		System.out.println("Parameterized Constructor");
	}
	
	ConstructorExample(int a, int b,int c)
	{
		c = a+b;
		System.out.println(c);
		System.out.println("Parameterized Constructor");
	}
	
	//Constructor overloading
	
	ConstructorExample(int a, String b)
	{
		
		System.out.println("Construcotr overlaoding ");
		System.out.println("The roll number "+a);
		System.out.println("The Name of student:" +b);
	}
	
	ConstructorExample(int a, int b,String c)
	{
		
		System.out.println(c);
		System.out.println("Parameterized Constructor");
	}
	
	
	public static void main(String args[])
	{
		ConstructorExample c1 = new ConstructorExample();
		ConstructorExample c2 = new ConstructorExample(5,5);
		ConstructorExample c3 = new ConstructorExample(5,"Payal");
		
		
	}

}
