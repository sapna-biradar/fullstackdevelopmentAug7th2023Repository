package com.gentech.whilepatterns;

public class WhilePatternEightExample {

	public static void main(String[] args) {
		int rows = 5;
		int num = 15;
		int i=0;
		while(i<rows)
		{
			int k=rows-i;
			while(k>0)
			{
				System.out.print(num+" ");
				num--;
				k--;
			}
			System.out.println();
			i++;
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