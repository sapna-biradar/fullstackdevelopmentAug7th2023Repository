package com.gentech.constrchaining;

class find
{
	int c = 0;
	int temp = 0;
	find(int n)
	{
		temp = n;
		c = n%10;
		while(c>0)
		{
			if((temp%10) == c)
			{
				temp = temp/10;
				c--;
			}
			else
			{
				System.out.print("Missing Number is: "+c);
				System.out.println();
				break;
			}
			
		}
	}
}
public class MissingNumberExample {

	public static void main(String[] args) {
		find obj = new find(12345679);
		find obj1 = new find(12356789);	
	}
}
/*
Missing Number is: 8
Missing Number is: 4
*/