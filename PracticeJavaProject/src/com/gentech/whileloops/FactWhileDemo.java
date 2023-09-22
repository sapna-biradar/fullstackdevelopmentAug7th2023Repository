package com.gentech.whileloops;

public class FactWhileDemo {

	public static void main(String[] args) {
		int fact=1;
		int i=1;
		int num=Integer.parseInt(args[0]);
		while(i<=num)
		{
			fact=fact*i;
			i++;
		}
		System.out.println(fact);
	}

}