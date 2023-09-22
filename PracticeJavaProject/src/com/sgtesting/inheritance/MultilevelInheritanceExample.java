package com.sgtesting.inheritance;
class MultilevelInheritance1
{
	void Trapezoidarea(int a,int b,int c)
	{
		System.out.println("Area Of the Trapezoid is :"+((a+b)*c)/2);
	}
}

class MultilevelInheritance2 extends MultilevelInheritance1
{
	void Pythagoroustheorem(int a,int b)
	{
		System.out.println("Pythagorous Theorem Result is :"+(a*a)+(b*b));
	}
}

class MultilevelInheritance3 extends MultilevelInheritance2
{
	void Multiplication(int x,int y,int z)
	{
		System.out.println("Multiplication Result is :"+(x*y*z));
	}
}
public class MultilevelInheritanceExample {

	public static void main(String[] args) {
		MultilevelInheritance3 o1=new MultilevelInheritance3();
		o1.Multiplication(4, 6, 8);
		o1.Pythagoroustheorem(4, 6);
		o1.Trapezoidarea(2, 4, 6);
	
	}

}
