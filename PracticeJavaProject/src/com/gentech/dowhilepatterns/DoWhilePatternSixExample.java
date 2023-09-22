package com.gentech.dowhilepatterns;

public class DoWhilePatternSixExample {

	public static void main(String[] args) {
		int rows = 5;
		int num = 5;
		int i=0;
		do
		{
			int k=0;
		    do
			{
				System.out.print(num+" ");
				num+=5;
				k++;
			}while(k<=i);
			System.out.println();
			i++;
		}while(i<rows);
	}
}
/*
5 
10 15 
20 25 30 
35 40 45 50 
55 60 65 70 75 
*/