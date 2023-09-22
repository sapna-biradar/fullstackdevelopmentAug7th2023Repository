package com.gentech.constroverloading;

class Books
{
	Books(int Book_id)
	{
		System.out.println("bookid :"+Book_id);
	}
	Books(String booktitle)
	{
		System.out.println("Booktitle:"+booktitle);
	}
	Books(double bookprice)
	{
		System.out.println("BookPrice :"+bookprice);
	}	
}
public class BooksConstrOverloadExample {

	public static void main(String[] args) {
		Books o1=new Books(2);
		Books o2=new Books("java programming language");
		Books o3=new Books(500.00);
	}
}
/*
bookid :2
Booktitle:java programming language
BookPrice :500.0
 */
