package com.gentech.matrix;

public class ThreeIntoThreeIntegerTwoDimensionalArray {

	public static void main(String[] args) {
		  int x[][] = {
		            {1, 2, 3},
		            {4, 5, 6},
		            {7, 8, 9}
		        };
		        int a[]=new int[3*3];
		        int k=0;
		        for(int i=0;i<x.length;i++)
		        {
		        	for(int j=0;j<x[i].length;j++)
		        	{
		        		a[k]=x[i][j];
		        		k++;
		        	}
		        }
		        for(int m=0;m<a.length;m++)
		        {
		        	System.out.print(a[m]+" ");
		        }
   }
}

