package com.gentech.dowhilepatterns;

public class DoWhilePatternSevenExample {

	public static void main(String[] args) {
		int rows = 4;
		int num = 1;
		int i=0;
		do
		{
			int k=0;
			do
			{
				System.out.print(num*num+" ");
				num++;
				k++;
			}while(k<=i);
			System.out.println();
			i++;
		}while(i<rows);
	}
}
/*
1 
4 9 
16 25 36 
49 64 81 100 
*/