package com.gentech.matrix;

public class OneDToTwoDIntegerArray {

	public static void main(String[] args) {
		 int x[]= {1,2,3,4,5,6};
		  int y[][]=new int [2][3];
		  int k=0;
		  for(int i=0;i<y.length;i++)
		  {
		   for(int j=0;j<y[i].length;j++)
		   {
		    y[i][j]=x[k];
		    k++;
		   }
		  }
		  for(int m=0;m<y.length;m++)
		  {
		   for(int n=0;n<y[m].length;n++)
		   {
		    System.out.print(y[m][n]+" ");
		   }
		   System.out.println(" ");
		  }
	    }
	}

