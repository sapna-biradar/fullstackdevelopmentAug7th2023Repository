package com.gentech.dowhileloops;

public class FactDoDemo {

	public static void main(String[] args) {
		int fact=1;
		int i=1;
		int num=Integer.parseInt(args[0]);
		do
		{
			fact=fact*i;
			i++;
		}while(i<=num);
		System.out.println(fact);
	}

}