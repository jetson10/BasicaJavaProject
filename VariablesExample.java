package com.javaprograms;


class AutomationBatch
{
	String Student1 = "Priya";
	String Student2 ="Azee";
	String Student3= "Sankalp";
	
	int a = 10;
	
	public void Marks()
	{
		
		int Student1Mark = 100;
		
		int a = 10;
		int b = 20;
		int c = a+b;
		
		System.out.println(c);
	}
	
	
}

public class VariablesExample {
	
	//Global Variable Declaration
	int a = 10;
	
	int globalvariable = 20;
	
	public void print()
	{
		//local variable declaration
		int a =20;
		
		System.out.println("***Print Method***");
		System.out.println("Print Method");
		
		System.out.println("Local variable:" +a);
		
		System.out.println("Global variable:" +globalvariable);
	}
	
	public void print1()
	{
		System.out.println("Print 2");
	}
	
	public static void main(String args[])
	{
		
		int a = 10;
	
		//Sytax - Class Name object name = new ClassName();
		
		VariablesExample obj1 = new VariablesExample();
		
		obj1.print();
		
		System.out.println(obj1.a);
		
		obj1.print1();
		
		System.out.println(obj1.globalvariable);
		
		
		AutomationBatch obj2 = new AutomationBatch();
		
		System.out.println("Priting the values in Automation class");
		
		System.out.println(obj2.Student1);
		
		//System.out.println(obj2.Student1Mark);
		
		obj2.Marks();
		
		
	}
	

}
