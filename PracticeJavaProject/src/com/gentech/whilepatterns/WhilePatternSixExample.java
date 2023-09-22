package com.gentech.whilepatterns;

public class WhilePatternSixExample {

	public static void main(String[] args) {
		int rows = 5;
		int num = 5;
		int i=0;
		while(i<rows)
		{
			int k=0;
			while(k<=i)
			{
				System.out.print(num+" ");
				num+=5;
				k++;
			}
			System.out.println();
			i++;
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
