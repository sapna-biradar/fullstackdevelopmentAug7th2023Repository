package com.gentech.whilepatterns;

public class WhilePatternTwoExample {

	public static void main(String[] args) {
		int i=5;
		while(i>=1)
		{
			int k=1;
			while (k<=i)
			{
				System.out.print(5+" ");
				k++;
			}
			System.out.println();
			i--;
		
		}
	}

}
/*
5 5 5 5 5 
5 5 5 5 
5 5 5 
5 5 
5 
*/