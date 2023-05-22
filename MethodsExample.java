package com.javaprograms;

public class MethodsExample {
	
	
	int a = 10;
	
	//normal method
	
	/*1) access specifier
	2) Return type
	3) Name for the method*/
	
	public void NormalMethod()
	{
		System.out.println("Void Method is printed");
		
	}
	
	
	//Second method - Method with return type
	
	/*1) access specifier
	2) Return type (Data type - int, float)
	3) Name for the method*/
	
	public int addtwoNumbers()
	{
		int a = 10;
		int b = 20;
		
		int c = a+b;
	
		return c;

	}
	
	//Method with parameters
	
	public int addtwoValues(int a, int b)
	{
		int result = a+b;
		
		System.out.println(result);
		
		return result;
	}
	
	
	public int MaximumMarks()
	{
		return 100;
		
	}
	
	public static void main(String args[])
	{
		MethodsExample obj1 = new MethodsExample();

		
		obj1.NormalMethod();
		obj1.addtwoNumbers();
		
		obj1.addtwoValues(100, 200);

		
		System.out.println(obj1.a);
		
		System.out.println(obj1.MaximumMarks());
		
		System.out.println(obj1.addtwoNumbers());
		
		
	}
	

}
