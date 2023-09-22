package com.sgtesting.inheritance;
class MathsHeirarchical1
{
	void Simpleinterest(int m,int n,int o)
	{
		System.out.println("Simpleinterest Result is :"+(m*n*o)/100);
	}
}

class MathsHeirarchical2 extends MathsHeirarchical1
{
	void Squareperimeter(int m)
	{
		System.out.println("Square Perimeter Result is :" +(4*m));
	}
}
class MathsHeirarchical3 extends MathsHeirarchical1
{
	void Triangle(int m,int n)
	{
		System.out.println("Triangle Result is :"+((m*n)/2));
	}
}
public class HeirarchicalInheritanceExample {

	public static void main(String[] args) {
		MathsHeirarchical2 o1=new MathsHeirarchical2();
		o1.Simpleinterest(20, 30, 40);
		o1.Squareperimeter(8);
		
		System.out.println();
		
		MathsHeirarchical3 o2=new MathsHeirarchical3();
		o2.Triangle(6,7);
		o2.Simpleinterest(9, 6, 3);
	}

}
