package com.gentech.constrchaining;

class ReverseDigits
{
	ReverseDigits(int num,int reversed)
	{
		
		while(num!=0)
		{
			int digit=num%10;
			reversed=reversed*10+digit;
			num/=10;
		}
		System.out.println("Reversed number is "+reversed);
	}
}

public class ReverseOfDigitsExample {

	public static void main(String[] args) {
		ReverseDigits obj1=new ReverseDigits(123,0);
		ReverseDigits obj2=new ReverseDigits(4567,0);
		ReverseDigits obj3=new ReverseDigits(7653,0);
		ReverseDigits obj4=new ReverseDigits(4321,0);
		ReverseDigits obj5=new ReverseDigits(6543,0);
	}

}
/*
Reversed number is 321
Reversed number is 7654
Reversed number is 3567
Reversed number is 1234
Reversed number is 3456
*/
