package com.sgtesting.methodoveriding;

class School1
{
	String name;
	void show(String name)
	{
		System.out.println("school name in super class:"+name);
	}
}
class Subject extends School1
{
	Subject(String name)
	{
		super.name=name;
	}
	String name;

	void display1(String name)
	{
		System.out.println("Subject name in sub class:"+name);
	}
}
class Students1 extends Subject
{
	Students1(String name)
	{
		super(name);
		super.name=name;
	}
	String name;
	void display2(String name)
	{
		System.out.println("Student name in subclass:"+name);
	}
}
public class MethodOveridingDemo2 {

	public static void main(String[] args) {
		Students1 obj=new Students1("nagraj");
		obj.display1("Kannada");
		obj.show("anubhava mantapa gurukul");
		obj.display2("Sapna");

	}

}
