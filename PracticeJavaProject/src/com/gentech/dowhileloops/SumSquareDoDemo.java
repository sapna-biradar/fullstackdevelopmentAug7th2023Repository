package com.gentech.dowhileloops;

public class SumSquareDoDemo {

	public static void main(String[] args) {
		int square;
		int sum=0;
		int i=20;
		do
		{
			square=i*i;
			sum=sum+square;
			i--;
		}while(i>=1);
		
		System.out.println(sum);

	}

}

