package com.gentech.polymorphismdemo;

abstract class Animal 
{
	abstract void makeSound() ;	
}
class Dog extends Animal 
{
	void makeSound() 
	{
		String sound="Woof";
		System.out.println("Sound of Animal is :"+sound);
	}
}
class Owl extends Animal
{
	void makeSound() 
	{
		String sound="hohoooo";
		System.out.println("Sound of Animal is :"+sound);
	}
}
class Elephant extends Animal
{
	void makeSound() 
	{
		String sound="Eooooooa";
		System.out.println("Sound of Animal is :"+sound);
	}
}
class Cat extends Animal 
{
	void makeSound() 
	{
		String sound="Meow";
		System.out.println("Sound of Animal is :"+sound);
	}
}
public class ProgramAssignment1 {
	public static void main(String[] args) {
		Animal animal1 = new Dog();
		Animal animal2 = new Owl();
		Animal animal3 = new Elephant();
		Animal animal4 = new Cat();

		animal1.makeSound();
		animal2.makeSound();
		animal3.makeSound();
		animal4.makeSound();
	}
}

