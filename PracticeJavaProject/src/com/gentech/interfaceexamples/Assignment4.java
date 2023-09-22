package com.gentech.interfaceexamples;

interface Student
{
	void showstudentdetails(String sname);
}
interface Branch extends Student
{
	abstract void showbranchdetails(String bname);
}
interface Collegee extends Branch
{
	abstract void showcollegedetails(String cname);
} 
interface canteen extends Student
{
	abstract void showcanteendetails(String name);
}
class ClgLibrary implements Collegee
{
	public void showstudentdetails(String sname)
	{
		System.out.println("the student name is:"+sname);
	}
	public void showcollegedetails(String cname)
	{
		System.out.println("the college name is:"+cname);
	}
	public void showbranchdetails(String bname)
	{
		System.out.println("the branch name is:"+bname);
	}
	public void showlibrarydetails(int libid)
	{
		System.out.println("the library id is:"+libid);
	}
}
class Library1 implements canteen
{
	public void showcanteendetails(String name)
	{
		System.out.println("the canteen name is:"+name);
	}
	public void showstudentdetails(String sname)
	{
		System.out.println("the student name is:"+sname);
	}
	public void showlibrarydetails(String bookname)
	{
		System.out.println("the book name in library name is:"+bookname);
	}
}

public class Assignment4 {
	public static void main(String[] args) {
		Library1 obj1=new Library1();
		obj1.showstudentdetails("Charan");
		obj1.showcanteendetails("YSR catering");
		obj1.showlibrarydetails("DSA");
		System.out.println("+++++++++++++++++++");
		ClgLibrary obj2=new ClgLibrary();
		obj2.showstudentdetails("Priya");
		obj2.showbranchdetails("CSE");
		obj2.showcollegedetails("GECH");
		obj2.showlibrarydetails(9101);
	}

}
