package com.javaprograms;

public class StaticExample {
	
	public static int a  =10;
	
	
	//normal method
	public void print()
	{
		System.out.println("Normal Method");
	}
	
	//Method with return type
	public boolean Results()
	{
		return true;
		
	}
	
	//Static method creation with static keyworkd
	public static void staticPrint()
	{
		System.out.println("Priting Static Method");
		
	}
	
	
	public static void main(String args[])
	{
		StaticExample obj1 = new StaticExample();
		
		obj1.print();
		System.out.println(obj1.Results());
		
		//Calling your static method, since it is in same class just we can give the method name
		staticPrint();
	
		
		System.out.println(a);
		
		
		
	}

}
