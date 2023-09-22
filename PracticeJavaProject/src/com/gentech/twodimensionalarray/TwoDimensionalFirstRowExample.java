package com.gentech.twodimensionalarray;

public class TwoDimensionalFirstRowExample {

	public static void main(String[] args) {
		char x[][]= {
				{'a','b','c'},
				{'d','e','f'},
				{'g','h','i'}};
		System.out.print("First row: ");
			for(int i=0;i<x[0].length;i++)
			{
				System.out.print(x[0][i]+" ");
			}
	}
}
/*
First row: a b c 
*/