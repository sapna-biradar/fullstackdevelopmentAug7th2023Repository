package com.gentech.constrchaining;

class Vowel
{
	Vowel(char ch)
	{
		switch(ch)
		{
		case 'a':case 'A':
			System.out.println(ch+" is a vowel");
			break;
		case 'e':case 'E':
			System.out.println(ch+" is a vowel");
			break;
		case 'i':case 'I':
			System.out.println(ch+" is a vowel");
			break;
		case 'o':case 'O':
			System.out.println(ch+" is a vowel");
			break;
		case 'u':case 'U':
			System.out.println(ch+" is a vowel");
			break;
		default:
			System.out.println(ch+" is a consonant");
		}
	}
}

public class OvelOrNotExample {

	public static void main(String[] args) {
		 Vowel obj1=new Vowel('C');
		 Vowel obj2=new Vowel('A');
		 Vowel obj3=new Vowel('D');
		 Vowel obj4=new Vowel('I');
		 Vowel obj5=new Vowel('O');
	}
}
/*
C is a consonant
A is a vowel
D is a consonant
I is a vowel
O is a vowel
*/