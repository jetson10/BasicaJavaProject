package com.javaprograms;

public class ForLoopExample {
	
	public static void main(String args[])
	{
		
		//Normal For loop
		// Start the intial value
		// condition untill it has be iterated
		// give increment operator
		
		for(int i=1;i<=5;i++)
		{
			//System.out.println(i);
			//System.out.println("Sanlakp");
		}
		
		
		System.out.println("Comes out of for loop");
		
		for(int i=8;i<=10;i++)
		{
			for(int j=0;j<=5;j++)
			{
				System.out.println("Child Nested For Loop"+j);
				
			}
			
			System.out.println("The Parent For loop - "+i);
		}
		
		//Nested For loop pyramid program
		
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("@");
			}
			
			System.out.println();
		}
		
		
		//Enhanced For loop
		
		String TeamIndia[] = {"Dhoni", "Kohli","Yuvraj","Kaif"};
		
		for(String Payal:TeamIndia)
		{
			System.out.println(Payal);
			
			
		}
	}

}
