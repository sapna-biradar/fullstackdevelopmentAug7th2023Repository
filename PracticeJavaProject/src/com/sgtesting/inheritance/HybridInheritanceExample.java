package com.sgtesting.inheritance;

class HybridOperation1
{
	void Rectangleperimeter(int x,int y)
	{
		System.out.println("Rectangle Perimeter Result is :"+2/(x+y));
	}
}

class HybridOperation2 extends HybridOperation1
{
	void CubeArea(int l)
	{
		System.out.println("Surface Area of Cube is :"+(6*l*l));
	}
}

class HybridOperation3 extends HybridOperation2
{
	void Additions(int w,int x,int y,int z)
	{
		System.out.println("Addition Result is :"+(w+x+y+z));
	}
}

class HybridOperation4 extends HybridOperation1
{
	void Multiplication(int w,int x,int y,int z)
	{
		System.out.println("Multiplication Result is :"+(w*x*y*z));
	}
}
public class HybridInheritanceExample {

	public static void main(String[] args) {
		HybridOperation3 o1=new HybridOperation3();
		o1.Additions(2, 4, 6, 8);
		o1.CubeArea(6);
		
		System.out.println();
		
		HybridOperation4 o2=new HybridOperation4();
		o2.Multiplication(2, 4, 6, 8);
		o2.Rectangleperimeter(12, 20);
		

	}

}
