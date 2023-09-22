package com.gentech.forpatterns;

public class PatternSixExample {

	public static void main(String[] args) {
		int rows = 5;
		int num = 5;
		for (int i=0;i<rows;i++)
		{
			for(int k=0;k<=i;k++)
			{
				System.out.print(num+" ");
				num+=5;
			}
			System.out.println();
		}
	}
}
/*
5 
10 15 
20 25 30 
35 40 45 50 
55 60 65 70 75 
*/
