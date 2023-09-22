package com.sgtesting.abstractclass;
abstract class Customer
{
	String customername;
	Customer()
	{
		customername="Preeti Talle";
		System.out.println("Customer name is :"+ customername);
	}
}
class Items extends Customer
{

}
public class AbstractDemo3 {

	public static void main(String[] args) {
		Items o=new Items();

	}

}

