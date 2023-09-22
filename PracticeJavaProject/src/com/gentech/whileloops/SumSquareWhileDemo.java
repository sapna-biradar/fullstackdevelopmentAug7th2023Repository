package com.gentech.whileloops;

public class SumSquareWhileDemo {

	public static void main(String[] args) {
		int square;
		int sum=0;
		int i=20;
		while(i>=1)
		{
			square=i*i;
			sum=sum+square;
			i--;
		}
		System.out.println(sum);
	}
}

