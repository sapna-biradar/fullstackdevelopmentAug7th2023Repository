package com.gentech.forpatterns;

public class PatternEightExample {

	public static void main(String[] args) {
		int rows = 5;
		int num = 15;
		for (int i=0;i<rows;i++)
		{
			for(int k=rows-i;k>0;k--)
			{
				System.out.print(num+" ");
				num--;
			}
			System.out.println();
		}
	}
}
/*
15 14 13 12 11 
10 9 8 7 
6 5 4 
3 2 
1 
*/