package com.sgtesting.inheritance;

class Students
{
	Students(String firstname,String email,int rollno)
	{
		System.out.println("First Name:" +firstname);
		System.out.println("Roll No:" +rollno);
		System.out.println("Email:" +email);
	}
}
class Library1 extends Students
{
	String bookname;int bookid;
	Library1(String firstname,String email,int rollno,String bookname,int bookid)
	{
		super(firstname,email,rollno);
		this.bookname=bookname;
		this.bookid=bookid;
		System.out.println("Book Name:" +bookname);
		System.out.println("Book ID:"+ bookid);
	}
}
class Sports1 extends Library1
{
	String sptname;
	Sports1(String firstname,String email,int rollno,String bookname,int bookid,String sptname)
	{
		super(firstname,email,rollno,bookname,bookid);
		this.sptname=sptname;
		System.out.println("Sport Name:" +sptname);
	}
}
class Canteen1 extends Students
{
	String catname;int catid;
	Canteen1(String firstname,String email,int rollno,String catname,int catid)
	{
		super(firstname,email,rollno);
		this.catname=catname;
		this.catid=catid;
		System.out.println("Cateen Name:" +catname);
		System.out.println("Cateen ID:" +catid);
	}
}

public class MultilevelInheritance7 {

	public static void main(String[] args) {
		Sports1 obj2=new Sports1("sapna","sapna@gmail.com",500,"Java",900,"Foot ball");
		System.out.println("---------------------------------------------------------------");
		Canteen1 obj10=new Canteen1("preeti","preeti@gmail.com",506,"Cafetaria",601);

	}

}

