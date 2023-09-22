package com.gentech.onedimarray;

public class OneDimensionDivisionFourExample {

	public static void main(String[] args) {
		int count=0;
		for(int i=100;i>=50;i--)
		{
			if(i%4==0)
			{
				count=count+1;
			}
		}
		System.out.println("no of elements:"+count);
		int x[]=new int[count];
		int k=0;
		for(int j=100;j>=50;j--)
		{
			if(j%4==0)
			{
				x[k]=j;
				k++;
			}
		}
		for(int z=x.length-1;z>=0;z--)
		{
			System.out.println(x[z]);
		}
	}
}
/*
no of elements:13
52
56
60
64
68
72
76
80
84
88
92
96
100
*/