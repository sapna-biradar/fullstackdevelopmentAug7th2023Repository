package com.gentech.dowhilepatterns;

public class DoWhilePatternFiveExample {

	public static void main(String[] args) {
		int count = 1;
		int i=1;
		do
		{
			int k=1;
			do
			{
				System.out.print(count+" ");
				count++;
				k++;
			}while(k<=i);
			System.out.println();
			i++;
		}while(i<=5);
	}
}
/*
1 
2 3 
4 5 6 
7 8 9 10 
11 12 13 14 15 
*/