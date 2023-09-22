package com.gentech.whilepatterns;

public class WhilePatternSevenExample {

	public static void main(String[] args) {
		int rows = 4;
		int num = 1;
		int i=0;
		while(i<rows)
		{
			int k=0;
			while(k<=i)
			{
				System.out.print(num*num+" ");
				num++;
				k++;
			}
			System.out.println();
			i++;
		}
	}
}
/*
1 
4 9 
16 25 36 
49 64 81 100 
*/