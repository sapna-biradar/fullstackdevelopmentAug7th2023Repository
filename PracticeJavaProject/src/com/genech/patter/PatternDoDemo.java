package com.genech.patter;

public class PatternDoDemo {

	public static void main(String[] args) {
		int i=1;
		do
		{
			int k=1;
			do
			{
				System.out.print("# ");
				k++;
			}while(k<=6);
			System.out.println();
			i++;
		}while(i<=3);
	}
}