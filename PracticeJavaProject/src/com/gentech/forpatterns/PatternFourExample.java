package com.gentech.forpatterns;

public class PatternFourExample {

	public static void main(String[] args) {
		for (int i=1;i<=5;i++)
		{
			for(int k=1;k<=i;k++)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}

	}

}
/*
1 
2 2 
3 3 3 
4 4 4 4 
5 5 5 5 5 
*/