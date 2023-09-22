package com.gentech.returndemoexamples;

// 1D byte array read second half of the array elements
class AllInOneClass
{
	void ReadByteArray(byte m[])
	{
		for(int i=(m.length)/2;i<=m.length-1;i++)
		{
			System.out.print(m[i]+",");
		}
		System.out.println();
		System.out.println("=======================================");
	}

	// 1D short array read first half of the array elements
	void Read1stHalfShortArray(short n[])
	{
		for(int i=0;i<=(n.length)/2;i++)
		{
			System.out.print(n[i]+",");
		}
		System.out.println();
		System.out.println("=======================================");
	}

	//1D integer array read first half of the elements in reverse order
	void ReadIntArray(int o[])
	{
		for(int i=o.length-1;i>=(o.length)/2;i--)
		{
			System.out.print(","+o[i]);
		}
		System.out.println();
		System.out.println("=======================================");

	}
	//  1D character array concatenate all the characters
	void ConcatinateChar(char c[])
	{
		String s=" ";

		for(int i=0;i<=c.length-1;i++)
		{
			s=s+c[i];
		}
		System.out.println(s);
		System.out.println();
		System.out.println("=======================================");

	}
	// in 1D string array read the array elements in reverse order
	void ReverseStringArray(String t[])
	{
		for(int i=t.length-1;i>=0;i--)
		{
			System.out.println(t[i]);
		}
		System.out.println();
		System.out.println("=======================================");

	}

	// For the 1D int array find the sum of all the elements in an array
	void SumOfArray(int s[])
	{
		int sum=0;
		for(int i=0;i<=s.length-1;i++)
		{
			sum=sum+s[i];
			System.out.println(s[i]);
		}
		System.out.println("sum of array:"+sum); 
		System.out.println();
		System.out.println("=======================================");

	}
	//in 1D character array find the vowels separately 
	void FindVowel(char c[])
	{
		System.out.println(" Vowels : ");
		for(int i=0;i<=c.length-1;i++)
		{
			switch(c[i])
			{
			case 'A':case 'a': System.out.println(c[i]);
			break;
			case 'E':case 'e': System.out.println(c[i]);
			break;
			case 'I':case 'i': System.out.println(c[i]);
			break;
			case 'O':case 'o': System.out.println(c[i]);
			break;
			case 'U':case 'u': System.out.println(c[i]);
			break;
			default : continue;
			}

		}System.out.println("=======================================");
	}

	//in 2D 3*3 integer array read the last row of elements
	void ReadTwoDArray(int a[][])
	{
		System.out.println("last row of array");
		for(int i=0;i<a[2].length;i++)
		{
			System.err.print(a[2][i]+" ");
		}
		System.out.println();
		System.out.println("=======================================");

	}
	//in 2D 3*3 integer array find the sum of only first row
	void SumOf1stRow(int a[][])
	{
		int sum=0;
		for(int i=0;i<=a[0].length-1;i++)
		{
			sum=sum+a[0][i];
		}
		System.out.println("sum of first row :"+sum);
		System.out.println("=======================================");
	}
	//   Subtract 2 matrixes and print the result in reverse order
	void SubMatrix(int x[][],int y[][])
	{  
		System.out.println("substraction array in revers order");
		if((x.length==y.length)&&(x[0].length==y[0].length))
		{
			int z[][]=new int [x.length][x[0].length];
			for(int i=0;i<x.length;i++)
			{
				for(int j=0;j<x[i].length;j++)
				{
					z[i][j]=x[i][j]-y[i][j]; 
				}
			}
			for(int k=z.length-1;k>=0;k--)
			{
				for(int l=z[k].length-1;l>=0;l--)
				{
					System.out.print(" "+z[k][l]);
				}
				System.out.println();
			}

		}
		System.out.println("=======================================");
	}
	// in 1D int array square the each elements and find the sum

	void SquareSum(int a[])
	{
		int sum=0,square=0;
		for(int i=0;i<a.length;i++)
		{
			square=a[i]*a[i];
			sum=sum+square;
			System.out.println(" square of  "+a[i]+ " " +square);
		}
		System.out.println("sum of squares :"+sum);
		System.out.println("=======================================");

	}


	// in 1D String  array concatenate the elements 
	void ConcatString(String s[][])
	{

		System.out.println("concatination of String array :");
		String str=" ";

		for(int i=0;i<s.length;i++)
		{
			for(int j=0;j<s[i].length;j++)
			{

				str=str+s[i][j];
			}

		}
		System.out.print(str);
	}
}


public class MethodReturnExamples {

	public static void main(String[] args) {

		AllInOneClass obj1=new AllInOneClass();
		System.out.println("second half of the byte array Elements");
		byte x[]= {1,2,3,4,5,6,7,8};
		obj1.ReadByteArray(x);
		System.out.println();

		System.out.println("First half of the short array Elements");
		short y[]= {20,40,60,80,100};
		obj1.Read1stHalfShortArray(y);
		System.out.println();

		System.out.println("First half of the int array Elements in reverse Order");
		int z[]= {25,351,639,456,1478,321,142};
		obj1.ReadIntArray(z);
		System.out.println();

		System.out.println("First half of the int array Elements in reverse Order");
		char c[]= {'p','a','v','i','t','h','r','a'};
		obj1.ConcatinateChar(c);
		System.out.println();

		System.out.println("String elements in reverse order");
		String s[]= {"Sindhu","Loshni","Madhu","Swapna","Nisha","Kavya"};
		obj1.ReverseStringArray(s);

		int p[]= {20,30,10,25,25};
		obj1.SumOfArray(p);
		System.err.println();

		char q[]={'s','i','n','d','h','u','l','a','r'};
		obj1.FindVowel(q);

		System.out.println();
		int m[][]= {{2,5,8},{4,7,2},{6,2,7}};
		obj1.ReadTwoDArray(m);

		int n[][]= {{1,9,2},{4,7,2},{6,2,7}};
		obj1.SumOf1stRow(n);

		int k[][]= {{5,8,9},{6,7,4},{6,3,1}};
		int l[][]= {{2,5,7},{4,6,2},{2,1,1}};
		obj1.SubMatrix(k,l);

		int r[]= {1,2,3,4,5,6};
		obj1.SquareSum(r);

		String j[][]= {{"madhu","Loshni","Madhu"},{"Swapna","Nisha","Kavya"}};
		obj1.ConcatString(j);
	}
}