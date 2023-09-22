package com.gentech.twodimensionalarray;

public class ThreeintoThreeSecondRowExample {

	public static void main(String[] args) {
		int x[][]= {
				{1,2,3},
				{4,5,6},
				{7,8,9}};
		System.out.print("Second row: ");
			for(int i=0;i<x[1].length;i++)
			{
				System.out.print(x[1][i]+" ");
			}
	}

}
/*
Second row: 4 5 6 
*/