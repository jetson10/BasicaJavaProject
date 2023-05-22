package com.javaprograms;


class Animal
{
	int numberofLegs = 4;
	
	public void Eat()
	{
		System.out.println("Animals Eat");
	}
	
	
}
//Single Inheritance
class Dog extends Animal
{
	public void DogMethod()
	{
		System.out.println("This is dog here and I eat Bones");
	}
	
}

//Multi level inheritance
class Puppy extends Dog
{
	
	public void PuppyMethod()
	{
		System.out.println("This is puppy here and I drink milk");
	}
	
}

//Heirachical Inheritance

class Cat extends Animal
{
	
	public void CatMethod()
	{
		System.out.println("This is cat here and I also drink milk");
	}
	
}


public class InheritanceExamples {
	
	public static void main(String args[])
	{
		//Animal a1 = new Animal();
		
	//	a1.Eat();
		
	/*	Dog d1 = new Dog();
		
		d1.DogMethod();
		
		d1.Eat();
		
		System.out.println(d1.numberofLegs);*/
		
		Puppy p1 = new Puppy();
		
		p1.PuppyMethod();
		p1.Eat();
		p1.DogMethod();
		
		Cat c1 = new Cat();
		
		c1.Eat();
		c1.CatMethod();
		
		System.out.println(c1.numberofLegs);
		
	}

}
