package com.gentech.whileloops;

public class DivisibleTenWhileDemo {

	public static void main(String[] args) {
		int count=0;
		int i=250;
		while(i<=500)
		{
			if(i%10==0)
			{
				count=count+1;
			}
			i++;
		}
		System.out.println(count);

	}

}
