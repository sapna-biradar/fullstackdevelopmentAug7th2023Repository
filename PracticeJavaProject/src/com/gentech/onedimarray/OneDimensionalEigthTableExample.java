package com.gentech.onedimarray;

public class OneDimensionalEigthTableExample {

	public static void main(String[] args) {
		int count=0;
		for(int i=8;i<=80;i++)
		{
			if(i%8==0)
			{
				count=count+1;
			}
		}
		System.out.println("no of elements:"+count);
		int x[]=new int[count];
		int k=0;
		for(int j=8;j<=80;j++)
		{
			if(j%8==0)
			{
				x[k]=j;
				k++;
			}
		}
		for(int z=0;z<=x.length/2;z++)
		{
			System.out.println(x[z]);
		}

	}

}
/*
no of elements:10
8
16
24
32
40
48
*/