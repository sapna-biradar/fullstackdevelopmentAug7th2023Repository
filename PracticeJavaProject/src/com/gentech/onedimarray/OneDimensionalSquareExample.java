package com.gentech.onedimarray;

public class OneDimensionalSquareExample {

	public static void main(String[] args) {
		int k=0;
		int square;
		int x[]=new int[10];
		for(int i=1;i<=10;i++)
		{
			x[k]=i;
			k++;
		}
		for(int z=(x.length-1)/2;z>=0;z--)
		{
			square=x[z]*x[z];
			System.out.println(square);
		}
	}

}
/*
25
16
9
4
1
*/