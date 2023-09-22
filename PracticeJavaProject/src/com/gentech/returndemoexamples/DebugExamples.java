package com.gentech.returndemoexamples;

class Maths3
{
	static Maths3 obj=null;
	private Maths3()
	{
		//it is a private constructor
	}
	void addition(int x,int y)
	{
		int res=(x+y);
		System.out.println("the addition of number is: "+res);
	}
	void multiplication(int x,int y)
	{
		int res=(x*y);
		System.out.println("the multiplication result is: "+res);
	}
	public static Maths3 getInstance()
	{
		if(obj==null)
		{
			obj=new Maths3();
		}
		return obj;
	}
}

public class DebugExamples {

	public static void main(String[] args) {
		Maths3 o1=Maths3.getInstance();
		o1.addition(10, 20);
		o1.multiplication(2, 3);
		
		Maths3 o2=Maths3.getInstance();
		o2.addition(20, 40);
		o2.multiplication(34, 45);
		
		Maths3 o3=Maths3.getInstance();
		o2.addition(25, 30);
		o2.multiplication(30, 10);
		
		if (o1==o2 && o2==o3)
		{
			System.out.println("Achieved singleton design pattern");
		}
		else
			System.out.println("not achieved singleton design pattern");

	}

}
