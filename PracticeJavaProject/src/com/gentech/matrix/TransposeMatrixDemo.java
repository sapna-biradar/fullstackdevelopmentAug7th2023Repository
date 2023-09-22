package com.gentech.matrix;

public class TransposeMatrixDemo {

	public static void main(String[] args) {
		int x[][]= {{5,6,7},{1,2,3},{8,9,4}};
	
		for(int i=0;i<x.length;i++)
			{
				for(int j=0;j<x[i].length;j++)
				{
					
					System.out.print(x[j][i]+" ");
				}
				System.out.println();
			}
	}
}
		        
		        