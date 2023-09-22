package com.gentech.noargs;
class Student
{
	int studid;
	String studfirstname;
	String studlastname;
	String studemail;
	long studmobileno;
	Student()
	{
		studfirstname="Sapna";
		studlastname="Biradar";
		studemail="sapna@gmail.com";
		studid=10;
		studmobileno=3906244;
		System.out.println("first namestud:"+studfirstname);
		System.out.println("std last name:"+studlastname);
		System.out.println("std mail id :"+studemail);
		System.out.println("std id:"+studid);
		System.out.println("std mobile number:"+studmobileno);
	}
}
class Library
{
	int libid;
	String libname;
	int noofbooks;
	String clgname;
	Library()
	{
		libid=3;
		libname="Janata library";
		noofbooks=50;
		clgname="Pda";
		System.out.println("library id:"+libid);
		System.out.println("library name:"+libname);
		System.out.println("noof books:"+noofbooks);
		System.out.println("college name:"+clgname);
	}
}
class Sports
{
	int sportid;
	String sportname;
	int noofplayers;
	String coachname;
	Sports()
	{
		sportid=10;
		sportname="tt";
		noofplayers=12;
		coachname="Ashish";
		System.out.println("sports id:"+sportid);
		System.out.println("sports name:"+sportname);
		System.out.println(("no of players:"+noofplayers));
		System.out.println("coach name:"+coachname);
	}
}
public class StuLibSpoExample {

	public static void main(String[] args) {
		Student preeti=new Student();

		System.out.println("+++++++");
		Library lib=new Library();

		System.out.println("+++++++++++");
		Sports sport=new Sports();

	}

}




