package com.sgtesting.inheritance;

class Maths1
{
	void squrearea(int a,int b)
	{
		System.out.println("Multiplication Result is :"+(a*b));
	}
}
class Maths2 extends Maths1
{
	void cubearea(int a,int b,int c)
	{
		System.out.println("Substraction Result is :"+(a*b*c));
	}
}
public class SimpleInheritanceExample {

	public static void main(String[] args) {
		Maths2 o=new Maths2();
		o.squrearea(2, 4);		
		o.cubearea(2, 4, 6);
	}
}
