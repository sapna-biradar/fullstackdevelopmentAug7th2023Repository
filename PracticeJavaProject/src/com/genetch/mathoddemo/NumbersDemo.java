package com.genetch.mathoddemo;

class Numbers
{
	void dem(int i)
	{
		for(i=50;i>=40;i--)
		{
			System.out.println(i);
		}
		System.out.println("++++++++++++++++++++++++++");
	}
	void dem1(int j)
	{
		j=50;
		while(j>=40)
		{
			System.out.println(j);
			j--;
		}
		System.out.println("+++++++++++++++++++++++");
	}
	
	void dem2(int i)
	{
		i=50;
		do
		{
			System.out.println(i);
			i--;
		}while(i>=40);
	}
}

public class NumbersDemo {

	public static void main(String[] args) {
		Numbers o1=new Numbers();
		o1.dem(50);
		o1.dem1(50);
		o1.dem2(50);
		
	}

}
