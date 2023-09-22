package com.gentech.constrchaining;

class Pallindrome
{
	Pallindrome(int number)
	{
		int temp=number;
		int reverseofnumber=0;
		
		while(number>0)
		{
			int digit=number%10;
			reverseofnumber=(reverseofnumber*10)+digit;
			number=number/10;
		}
		if(temp==reverseofnumber)
		{
			System.out.println(reverseofnumber+" : The number is Pallindrome");
		}
		else
		{
			System.out.println(reverseofnumber+" : The number is not Pallindrome");
		}
	}
}

public class PallindromeOrNotExample {

	public static void main(String[] args) {
		Pallindrome obj1=new Pallindrome(616);
		Pallindrome obj2=new Pallindrome(514);
		Pallindrome obj3=new Pallindrome(212);
		Pallindrome obj4=new Pallindrome(123);
		Pallindrome obj5=new Pallindrome(818);
	}
}
/*
616 : The number is Pallindrome
415 : The number is not Pallindrome
212 : The number is Pallindrome
321 : The number is not Pallindrome
818 : The number is Pallindrome
*/