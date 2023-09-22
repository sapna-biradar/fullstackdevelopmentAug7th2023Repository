package com.gentech.constrchaining;
class SumDigits
{
	SumDigits(int num,int sum)
	{
		
		while(num!=0)
		{
			int digit=num%10;
			sum=sum+digit;
			num/=10;
		}
		System.out.println("Reversed number is "+sum);
	}
}

public class SumOfDigitsExample {

	public static void main(String[] args) {
		SumDigits obj1=new SumDigits(123,0);
		SumDigits obj2=new SumDigits(4567,0);
		SumDigits obj3=new SumDigits(7653,0);
		SumDigits obj4=new SumDigits(4321,0);
		SumDigits obj5=new SumDigits(6543,0);
	}
}
/*
 Reversed number is 6
Reversed number is 22
Reversed number is 21
Reversed number is 10
Reversed number is 18
 */

