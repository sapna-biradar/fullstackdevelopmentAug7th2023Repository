package com.gentech.constroverloading;

class Orders
{
	Orders(int order_id)
	{
		System.out.println("order_id :"+order_id);
	}

	Orders(String customer_name)
	{
		System.out.println("customer_name :"+customer_name);
	}
	Orders(double totalamount)
	{
		System.out.println("totalamount :"+totalamount);
	}
}


public class OrderConstrOverloadExample {

	public static void main(String[] args) {
		Orders p1=new Orders(10);
		Orders p2=new Orders("Aishwarya");
		Orders o3=new Orders(450.00);

	}
}
/*
order_id :10
customer_name :Aishwarya
totalamount :450.0
 */