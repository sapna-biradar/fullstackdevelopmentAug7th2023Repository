package com.gentech.returndemoexamples;

class LogicalAndDemo
{
//returns the result of logical operator AND
	boolean AndOperator(boolean x,boolean y)
	{
		return x&&y;
	}
//returns no. of elements in a given 1D array
	int numofelements(int x[])
	{
		return x.length;
	}
//returns average of 2 no.s
	int average(int x,int y)
	{
		return (x+y)/2;
	}
//returns sum of 1st 10 no.s
	int sumnumbers()
	{
		int s=0;
		for(int i=1;i<=10;i++)
		{
			s=s+i;
		}
		return s;
	}
//returns factorial of given no.
	int factorial(int z)
	{
		int f=1;
		for(int i=1;i<=z;i++)
		{
			f=f*i;
		}
		return f;
	}
//returns count of no.s in between 100 to 1 divisible by 10
	int divisibleby10(int start,int end)
	{
		int count = 0;
		if (start > end) {
			int temp = start;
			start = end;
			end = temp;
		}
		for (int i = start; i <= end; i++) {
			if (i % 10 == 0) {
				count++;
			}
		}

		return count;
	}
//returns first half of element from 1D byte array
	byte[] firsthalfofelements(byte x[])
	{
		for(int i=0;i<x.length/2;i++)
		{
			System.out.print(x[i]+" ");
		}
		System.out.println();
		return x;
	}
//returns sum of all elements from 1D short array
	short sumofallelements1D(short x[])
	{
		short sum = 0;
		for (short ele:x) {
			sum += ele;
		}
		return sum;
	}
//returns largest no. from given 2 no.s
	int largestnumbers(int x, int y)
	{
		if(x>y)
			return x;
		else
			return y;
	}
//returns smallest no. from given 3 no.s
	int smallestnumbers(int x,int y, int z)
	{
		if((x>y)&&(x>z))
		{
			return x;
		}
		else if((y>x)&&(y>z))
		{
			return y;
		}
		else
		{
			return z;
		}
	}
//returns the given input is alphabet or not
	boolean isAlphabetornot(char c)
	{
		return (c>='a' && c<='z') || (c>='A' && c<='Z');
	}
//returns transpose of a given 2D 3x3 string array
	String[][] transposeofarray(String x[][])
	{
		
		for (int i = 0; i <x.length; i++) 
		{
			for (int j = 0; j <x[i].length; j++)
			{
				System.out.print(x[j][i]+" ");
			}
			System.out.println();
		}
		return x;
	}
//returns square of each elements from 1D integer array
	int squareelements(int x[])
	{
		int result=0;
		for (int i = 0; i <x.length; i++) 
		{
			result = x[i]*x[i];
			
		}
		return result;
	}
//returns no. between 1 to 100 divisible by 6
	int Divisibleby6()
	{
		int i;
		for(i=1;i<=100;i++)
		{
			if(i%6==0)
			{
				System.out.print(i+" ");
			}
		}
		return i;
	}
	
}
public class ReturnMethodExamples {

	public static void main(String[] args) {
		LogicalAndDemo d=new LogicalAndDemo();
		System.out.println("Logical AND operator result: ");
		System.out.println(d.AndOperator(false, true));
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++");
		
		int a[]= {1,2,3,4,5,6};
		System.out.println("No. of elements in given array: ");
		System.out.println(d.numofelements(a));
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++");
		
		System.out.println("Average of 2 no.s: ");
		System.out.println(d.average(10, 15));
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++");
		
		System.out.println("sum of first 10 no.s: ");
		System.out.println(d.sumnumbers());
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++");
		
		System.out.println("factorial of a given no. :");
		System.out.println(d.factorial(5));
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++");
		
		System.out.println("count: ");
		System.out.println(d.divisibleby10(1, 100));
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++");
		
		System.out.println("first half of the elements are: ");
		byte b[]= {1,2,3,4};
		d.firsthalfofelements(b);
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++");
		
		short c[]= {10,20,30,40};
		System.out.println("sum of all elements: ");
		System.out.println(d.sumofallelements1D(c));
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++");
		
		System.out.println("largest no. is: ");
		System.out.println(d.largestnumbers(100, 144));
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++");
		
		System.out.println("smallest no. is: ");
		System.out.println(d.smallestnumbers(10, 5, 25));
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++");
		
		System.out.println("given inputs are aplhabets are not: ");
		System.out.println(d.isAlphabetornot('d'));
		System.out.println(d.isAlphabetornot('1'));
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++");
		
		String e[][]= {{"a","b","c"},
				{"d","e","f"},
				{"g","h","i"}};
		System.out.println("transpose: ");
		d.transposeofarray(e);
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++");
		
		int f[]= {1,2,3,4,5,6};
		System.out.println("square of all values: ");
		d.squareelements(f);
		System.out.print(f+" ");
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++");
		
		System.out.println("numbers divisible by 6 are: ");
		d.Divisibleby6();

	}
}
/*
 Demo1 o=new Demo1();
 
*/
