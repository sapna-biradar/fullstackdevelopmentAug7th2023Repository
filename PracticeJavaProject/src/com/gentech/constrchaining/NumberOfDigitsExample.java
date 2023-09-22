package com.gentech.constrchaining;

class NumDigits
{
	NumDigits(int num)
	{
		if((num<10)&&(num>=1))
		{
			System.out.println(num+" is a single digit number");
		}
		else if((num<100)&&(num>=10))
		{
			System.out.println(num+" is a two digits number");
		}
		else if((num<1000)&&(num>=100))
		{
			System.out.println(num+" is a three digits number");
		}
		else if((num<10000)&&(num>=1000))
		{
			System.out.println(num+" is a four digits number");
		}
		else if((num<100000)&&(num>=10000))
		{
			System.out.println(num+" is a five digits number");
		}
		else
		{
			System.out.println(num+" more than five digits");
		}
	}
}

public class NumberOfDigitsExample {

	public static void main(String[] args) {
		NumDigits obj1=new NumDigits(10);
		NumDigits obj2=new NumDigits(100);
		NumDigits obj3=new NumDigits(1000);
		NumDigits obj4=new NumDigits(10000);
		NumDigits obj5=new NumDigits(10000000);
	}
}
/*
10 is a two digits number
100 is a three digits number
1000 is a four digits number
10000 is a five digits number
10000000 more than five digits
*/