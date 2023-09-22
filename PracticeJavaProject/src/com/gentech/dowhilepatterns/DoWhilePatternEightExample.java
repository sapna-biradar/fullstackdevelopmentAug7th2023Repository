package com.gentech.dowhilepatterns;

public class DoWhilePatternEightExample {

	public static void main(String[] args) {
		int rows = 5;
		int num = 15;
		int i=0;
		do
		{
			int k=rows-i;
			do
			{
				System.out.print(num+" ");
				num--;
				k--;
			}while(k>0);
			System.out.println();
			i++;
		}while(i<rows);
	}
}
/*
15 14 13 12 11 
10 9 8 7 
6 5 4 
3 2 
1 
*/