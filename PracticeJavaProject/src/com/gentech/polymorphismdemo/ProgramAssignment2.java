package com.gentech.polymorphismdemo;

abstract class Geometricfigure
{
	abstract void perimeter();
}
class Triangle extends Geometricfigure
{
	void perimeter()
	{
		int length,breadth,height;
		length=10;
		breadth=20;
		height=25;
		System.out.println("perimeter of triangle:"+(length+breadth+height));
	}

}
class Square extends Geometricfigure
{
	void perimeter()
	{
		int side;
		side=10;
		System.out.println("perimeter square:"+(4*side));
	}
}
class Rectangle extends Geometricfigure
{
	void perimeter()
	{
		int length,breadth;
		length=10;
		breadth=20;
		System.out.println("perimeter rectangle:"+(2*(length+breadth)));
	}
}

public class ProgramAssignment2 {
	public static void main(String[] args) {
		Geometricfigure figure=null;
		Triangle tri=new Triangle();
		Square squa=new Square();
		Rectangle rect=new Rectangle();
		
		figure=tri;
		figure.perimeter();
		figure=squa;
		figure.perimeter();
		figure=rect;
		figure.perimeter();

	}

}
