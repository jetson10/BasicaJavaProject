package com.javaprograms;

public class SampleClass {
	
	public static void main(String args[])
	{
		
		MethodsExample obj1 = new MethodsExample();
		obj1.addtwoValues(500, 600);
		
		obj1.NormalMethod();
		
		StaticExample obj2 = new StaticExample();
		
		obj2.print();
		
		
		StaticExample.staticPrint();
	}

}
