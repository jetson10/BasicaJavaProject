package com.javaprograms;

import java.lang.reflect.Array;

public class ArrayExample {
	
	public static void main(String args[])
	{
		//Normal variable declarition

		int a = 10;
		
		//Array creation
		int ArrayONE[];
		
		ArrayONE = new int[5];
		
		//Syntax 2
		
		int ArrayTWO[] = new int[5];
	
		//Syntax 3
		
		int []ArrayThree;
		
		ArrayThree = new int [10];
		

		
		//Syntax 4
		
		int ArrayFour[] = {10,20,30,40,50};
		
		System.out.println("The size of Array 4 is ->" +ArrayFour.length);
		
		System.out.println("The first element of Array 4 is ->" +ArrayFour[0]);
		
		
		System.out.println("The first element of Array 4 is ->" +ArrayFour[4]);
		//The negatvie scenario
		//System.out.println("The first element of Array 4 is ->" +array4[5]);
		
		
		System.out.println("The size of Array 2 is->" +ArrayTWO.length);
		
		String TeamIndia[] = {"Dhoni", "Kohli","Yuvraj","Kaif"};
		
		System.out.println("The size of Team India Array is" +TeamIndia.length);
		
		System.out.println("Kaif is in the location of" +TeamIndia[3]);
		
		
		for(int i=0;i<TeamIndia.length;i++)
		{
			System.out.println(TeamIndia[i]);
			
			Array.getInt(TeamIndia, 2);
			
		
		}
		
	
		
	}

}
