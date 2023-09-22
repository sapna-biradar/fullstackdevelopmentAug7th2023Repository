package com.gentech.matrix;

public class MatrixAdditionDemo {

	public static void main(String[] args) {
		int x[][]= {{5,6},{8,7}};
		int y[][]= {{1,2},{4,5}};
		
		if((x.length==y.length)&&(x[0].length==y[0].length))
			for(int i=0;i<x.length;i++)
			{
				for(int j=0;j<x[i].length;j++)
				{
					int res=x[i][j]+y[i][j];
					System.out.print(res+" ");
				}
				System.out.println();
			}
	}
}
