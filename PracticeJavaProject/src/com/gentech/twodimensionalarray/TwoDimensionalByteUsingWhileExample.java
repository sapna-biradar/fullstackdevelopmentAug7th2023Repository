package com.gentech.twodimensionalarray;

public class TwoDimensionalByteUsingWhileExample {

	public static void main(String[] args) {
		byte x[][]= {{1,2,3},
				{4,5,6},
				{7,8,9}};
		int i=0;
		while(i<x.length)
		{
			int j=0;
			while(j<x[i].length)
			{
				System.out.print(x[i][j]+" ");
				j++;
			}	
			System.out.println();
			i++;
		}
		
	}
}
/*
1 2 3 
4 5 6 
7 8 9 
*/