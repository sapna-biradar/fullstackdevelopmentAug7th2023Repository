package com.gentech.polymorphismdemo;
abstract class food
{
	abstract void tastes();
}
class Food1 extends food
{
	void tastes()
	{
		String tasteoffood="gulabjammun";
		System.out.println("taste of food name :"+tasteoffood);
	}

}
class Food2 extends food
{
	void tastes()
	{
		String tasteofitem ="chips";
		System.out.println("taste of food:"+tasteofitem);
	}
}
class Food3 extends food
{
	void tastes()
	{
		String Flavouroffood="mango";
		System.out.println("flavour of food:"+Flavouroffood);
	}


}
public class ProgramAssignment3 {
	public static void main(String[] args) {
		food foods=null;
		Food1 food1=new Food1();
		Food2 food2=new Food2();
		Food3 food3=new Food3();

		foods=food1;
		foods.tastes();
		foods=food2;
		foods.tastes();
		foods=food3;
		foods.tastes();


	}

}
