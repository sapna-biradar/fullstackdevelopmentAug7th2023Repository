package com.gentech.encapsulations;

class Fruits
{
	String fruitname;
	int quantity;
	String shopname;
	int price;
}
class Flowers
{
	String flowername;
	int quantity;
	int price;
	String shopname;
}
class Vegtables
{
	String vegtablename;
	int quantity;
	int price;
	String shopname;
}

public class FruitsFlowersVegetablesDefConstrExample {

	public static void main(String[] args) {
		Fruits fruit=new Fruits();
		fruit.fruitname="mango";
		fruit.price=100;
		fruit.shopname="xyz";
		fruit.quantity=2;
		System.out.println(fruit.fruitname);
		System.out.println(fruit.shopname);
		System.out.println(fruit.quantity);
		System.out.println(fruit.price);
		System.out.println("+++++++++++");
		Flowers flower=new Flowers();
		flower.flowername="rose";
		flower.price=100;
		flower.shopname="xyz";
		flower.quantity=2;
		System.out.println(flower.flowername);
		System.out.println(flower.shopname);
		System.out.println(flower.quantity);
		System.out.println(flower.price);
		System.out.println("+++++++++++");
		Vegtables veg=new Vegtables();
		veg.vegtablename="potato";
		veg.price=100;
		veg.shopname="xyz";
		veg.quantity=2;
		System.out.println(veg.vegtablename);
		System.out.println(veg.shopname);
		System.out.println(veg.quantity);
		System.out.println(veg.price);
	}

}
