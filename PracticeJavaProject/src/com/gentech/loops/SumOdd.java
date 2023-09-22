package com.gentech.loops;

public class SumOdd {

	public static void main(String[] args) {
		int sum=0;
		for(int i=50;i<=100;i++)
		{
			if(i%2==1)
			{
				sum=sum+i;
			}
		}
		System.out.println(sum);

	}

}
