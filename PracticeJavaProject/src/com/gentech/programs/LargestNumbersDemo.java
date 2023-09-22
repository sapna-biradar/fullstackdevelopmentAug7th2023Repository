package com.gentech.programs;

public class LargestNumbersDemo {

	public static void main(String[] args) {
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		if (a>b)
		{
			System.out.println(a+" is a greater");
		}
		else if (a<b)
		{
			System.out.println(b+" is a greater");
		}
		else
		{
			System.out.println("both are equal");
		}

	}

}
