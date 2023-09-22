package com.gentech.constroverloading;
class Products
{
	Products(int product_id)
	{
		System.out.println("product_id :"+product_id);
	}
	Products(double price)
	{
		System.out.println("price :"+price);
	}
	Products(String product_name)
	{
		System.out.println("Product Name :"+product_name);
	}
}
public class ProductsConstrOverload {

	public static void main(String[] args) {
		Products p1=new Products(2);
		Products p2=new Products(45000.00);
		Products p3=new Products("Laptop");

	}

}
/*
product_id :2
price :45000.0
Product Name :Laptop
 */