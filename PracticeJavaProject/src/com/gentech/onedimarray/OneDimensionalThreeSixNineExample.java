package com.gentech.onedimarray;

public class OneDimensionalThreeSixNineExample {

	public static void main(String[] args) {
		int count=0;
		for(int i=1;i<=200;i++)
		{
			if((i%3==0)&&(i%6==0)&&(i%9==0))
			{
				count=count+1;
			}
		}
		System.out.println("no of elements:"+count);
		int x[]=new int[count];
		int k=0;
		for(int j=1;j<=200;j++)
		{
			if((j%3==0)&&(j%6==0)&&(j%9==0))
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
no of elements:11
198
180
162
144
126
108
90
72
54
36
18
*/