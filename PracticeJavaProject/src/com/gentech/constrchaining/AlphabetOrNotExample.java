package com.gentech.constrchaining;

class Alphabet
{
	Alphabet(char ch)
	{
		if((ch>='a'&&ch<='z') || (ch>='A'&&ch<='z'))
		{
			System.out.println(ch+" is an alphabet");
		}
		else
		{
			System.out.println(ch+" is not an alphabet");
		}
	}
}

public class AlphabetOrNotExample {

	public static void main(String[] args) {
		Alphabet obj1=new Alphabet('A');
		Alphabet obj2=new Alphabet('1');
		Alphabet obj3=new Alphabet('C');
		Alphabet obj4=new Alphabet('d');
	}
}
/*
A is an alphabet
1 is not an alphabet
C is an alphabet
d is an alphabet
*/