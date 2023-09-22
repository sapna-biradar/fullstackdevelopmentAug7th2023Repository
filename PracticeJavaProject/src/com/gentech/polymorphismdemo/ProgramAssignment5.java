package com.gentech.polymorphismdemo;

abstract class Student
{
	abstract void marks();
}
class English extends Student
{
	void marks()
	{
		int Marks=80;
		System.out.println("marks in english:"+Marks);
	}
}
class Telugu extends Student
{
	void marks()
	{
		int Marks=90;
		System.out.println("marks in telugu:"+Marks);
	}
}
class Hindi extends Student
{
	void marks()
	{
		int Marks=95;
		System.out.println("marks in hindhi:"+Marks);
	}
}

public class ProgramAssignment5 {
	public static void main(String[] args) {
		Student stud=null;
		English eng= new English();
		Telugu tel=new Telugu();
		Hindi hind =new Hindi();
		stud=tel;
		stud.marks();
		stud=hind;
		stud.marks();
		stud=eng;
		stud.marks();

	}

}

