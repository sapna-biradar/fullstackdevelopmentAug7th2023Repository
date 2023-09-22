package com.gentech.twodimensionalarray;

public class ThreeintoThreeSecondColumnExample {

	public static void main(String[] args) {
		int x[][]= {
				{1,2,3},
				{4,5,6},
				{7,8,9}};
		System.out.println("Second column: ");
			for(int i=0;i<x[1].length;i++)
			{
				System.out.println(x[i][1]+" ");
			}
	}

}
/*
Second column: 
2 
5 
8 
*/