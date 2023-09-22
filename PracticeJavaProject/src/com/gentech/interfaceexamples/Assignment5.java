package com.gentech.interfaceexamples;

interface Sport
{
	void showsportdetails(String name);
}
interface Item extends Sport
{
	abstract void showitemdetails(String name);
}
interface Coach extends Item
{
	abstract void showcoachdetails(String name);
}
class Students implements Item
{
	public void showitemdetails(String name)
	{
		System.out.println("the item name is:"+name);
	}
	public void showsportdetails(String name)
	{
		System.out.println("the sport name is:"+name);
	}
	public void showcoachdetails(String name)
	{
		System.out.println("the coach name is :"+name);
	}
	void showstudentdetails(String name)
	{
		System.out.println("the student name is:"+name);
	}
}
class ClgDetails implements Coach
{
	public void showcoachdetails(String name)
	{
		System.out.println("the coacher name is:"+name);
	}
	public void showsportdetails(String name)
	{
		System.out.println("the sport name is:"+name);
	}
	public void showitemdetails(String name)
	{
		System.out.println("the item name is:"+name);
	}
	void showcollegedetails(String name)
	{
		System.out.println("the college name is:"+name);
	}
}
public class Assignment5 {
	public static void main(String[] args) {
		Students obj=new Students();
		obj.showitemdetails("ball");
		obj.showsportdetails("volleyball ");
		obj.showcoachdetails("abc");
		obj.showstudentdetails("renuka");
		System.out.println("+++++++++++++++++++++++++");
		ClgDetails obj1=new ClgDetails();
		obj1.showcoachdetails("sharan patil");
		obj1.showsportdetails("table tennis");
		obj1.showcollegedetails("PDA College gulbarga");
	}

}


