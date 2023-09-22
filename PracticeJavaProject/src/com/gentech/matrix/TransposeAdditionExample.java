package com.gentech.matrix;

public class TransposeAdditionExample {
	public static void main(String[] args) {
		int x[][]= {{5,6},{8,7}};
		int y[][]= {{1,2},{4,5}};
		
		if((x.length==y.length)&&(x[0].length==y[0].length))
		{
			int a[][]=new int[x[0].length][y[0].length];
			int i,k;
			for(i=0;i<x.length;i++)
			{
				for(k=0;k<x[i].length;k++)
				{
				   a[i][k]=x[i][k]+y[i][k];
				}
			}
			for(i=0;i<x.length;i++)
			{
				for(k=0;k<x[i].length;k++)
				{
					System.out.print(a[k][i]+" ");
				}
				System.out.println();
			}
		}
	}
}
/*
6 12 
8 12
*/