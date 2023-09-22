package com.gentech.dowhileloops;

public class SumOddDoDemo {

	public static void main(String[] args) {
		int i=50;
		int sum=0;
		do
		{
			if(i%2==1)
			{
				sum=sum+i;
				
			}
			i++;
		}while(i<=100);
		System.out.println(sum);
	}

}