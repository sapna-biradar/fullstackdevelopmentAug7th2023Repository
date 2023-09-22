package com.gentech.dowhileloops;

public class SumEvenDoDemo {

	public static void main(String[] args) {
		int sum=0;
		int i=250;
		do
		{
			if(i%2==0)
			{
				sum=sum+i;
			}
		    i++;
		}while(i<=500);
		System.out.println(sum);
	}

}


