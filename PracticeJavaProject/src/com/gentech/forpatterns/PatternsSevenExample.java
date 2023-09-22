package com.gentech.forpatterns;

public class PatternsSevenExample {

	public static void main(String[] args) {
		int rows = 4;
		int num = 1;
		for (int i=0;i<rows;i++)
		{
			for(int k=0;k<=i;k++)
			{
				System.out.print(num * num+" ");
				num++;
			}
			System.out.println();
		}
	}
}
/*
1 
4 9 
16 25 36 
49 64 81 100 
*/