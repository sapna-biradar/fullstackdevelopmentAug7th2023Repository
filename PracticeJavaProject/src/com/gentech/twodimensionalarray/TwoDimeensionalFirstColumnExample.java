package com.gentech.twodimensionalarray;

public class TwoDimeensionalFirstColumnExample {

	public static void main(String[] args) {
		char x[][]= {
				{'a','b','c'},
				{'d','e','f'},
				{'g','h','i'}};
		System.out.println("First column: ");
			for(int i=0;i<x.length;i++)
			{
				System.out.println(x[i][0]);
			}
	}
}
/*
First column: 
a
d
g
*/