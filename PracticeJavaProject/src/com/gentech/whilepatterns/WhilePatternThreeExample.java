package com.gentech.whilepatterns;

public class WhilePatternThreeExample {

	public static void main(String[] args) {
		int i=5;
		while(i>=1)
		{
			int k=1;
			while(k<=i)
			{
				System.out.print(k+" ");
				k++;
			}
			System.out.println();
			i--;
		}
	}
}
/*
1 2 3 4 5 
1 2 3 4 
1 2 3 
1 2 
1 
*/
