package com.sgtesting.methodoveriding;
class Library
{
	String name;
	void showBookname(String bookname)
	{
		System.out.println("the book name in parent class:"+bookname);
	}
}
class Library2 extends Library
{
	Library2(String name)
	{
		super.name=name;
		super.showBookname(name);
	}
	void showBookname(String bookname)
	{
		System.out.println("the book name in child class:"+bookname);
	}
}
class Library3 extends Library2
{
	Library3(String facultyname)
	{
		super(facultyname);
		super.showBookname(facultyname); 

	}
	String name;
	void showBookname(String bookname)
	{
		System.out.println("the book name in child class:"+bookname);
	}
}
public class MethodOveridingDemo3 {
	public static void main(String[] args) {
		Library3 obj=new Library3("python");
		obj.showBookname("java");
		obj.showBookname("dbms");
		
	}
}



