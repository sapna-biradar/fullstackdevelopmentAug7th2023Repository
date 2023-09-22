package com.sgtesting.staticrecursion;

class sample1 {
	// 2D 3*3 char array in reverse order
	static char[][] reverse(char x[][]) {
		char y[][] = new char[x.length][x[0].length];
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[0].length; j++) {
				y[i][j] = x[x.length - i - 1][x[0].length - j - 1];
			}
		}
		return y;
	}

	static char[][] concat(char x[][], char y[][]) // return concatenation result of 2D 3*3 char array
	{
		char result[][] = new char[3][6];

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				result[i][j] = x[i][j];
				result[i][j + 3] = y[i][j];
			}
		}
		return result;
	}

	static char[] FirstRow(char x[][]) // return the 1st row of elements from 2D 3*3 char array
	{
		char y[] = new char[x[0].length];
		for (int i = 0; i < x[0].length; i++) {
			y[i] = x[0][i];
		}
		return y;
	}

	static String Alphabets() // return 26 upper case alphabets
	{
		char[] alphabet = new char[26];
		char k=0;
		for (char i = 'A'; i <='Z'; i++) {
			alphabet[k] = i;
			k++;
		}
		return new String(alphabet);
	}

	static String FirstHalfUppercaseAlphabets()// return 1st half of the upper case alphabets
	{
		char[] result = new char[13];
		int k=0;
		for (char i = 'A'; i <='M'; i++) {
			result[k] = i;
			k++;
		}
		return new String(result);
	}

	static String SecondHalfUppercaseAlphabets() {
		char[] a = new char[13];
		int k=0;
		for (char i = 'N'; i <='Z'; i++) {
			a[k] = i;
			k++;
		}
		return new String(a);
	}

	
	static String LowerCaseAlphabetsReverse() 
	 { 
		 char res[]=new char [26];
		 int k=0;
		 for(char i='z';i>='a';i--)
		 {
			 res[k]=i;
			 k++;
		 }
		 return new String(res);
	}
	
	static boolean isPrime(int num) {
		if (num < 2) {
			return false;
		}
		for (int i = 2; i <= num; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

	// Prime numbers between 1 to 50
	//static int isprime1(int num) {
		//int flag = 0;
		//for (int i = 2; i < num; i++) {
			//if (num % i == 0) {
				//flag += 1;
				//break;
			//}
		//}
	//}

	/*static int getprimenumbersum10(int start, int end) {
		int sum = 0;
		for (int i = start; i <= end; i++) {
			if (isprime1(i) == true) {
				sum = sum + i;
			}
		}
		return sum;
	}
*/
	static int sumofprimes() {// return sum of prime no.s in between 1 to 100
		int sum = 0;
		for (int i = 2; i <= 100; i++) {
			boolean Prime = true;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					Prime = false;
					break;
				}
			}
			if (Prime) {
				sum += i;
			}
		}
		return sum;
	}

	static char[] ThirdRow(char x[][]) // return the 3rd row of elements from 2D 3*3 char array
	{
		char y[] = new char[x[0].length];
		for (int i = 0; i < x[0].length; i++) {
			y[i] = x[2][i];
		}
		return y;
	}
	// Secondhalf elements from 1D
	static String[] getsecondhalfelements(String[] str) {
		String s[] = new String[str.length];
		int k = 0;
		for (int i = str.length / 2; i < str.length; i++) {
			s[k] = str[i];
			k = k + 1;
		}
		return s;
	}

}

public class ReturnStaticExamples {

	public static void main(String[] args) {
		char[][] a = { { 'a', 'b', 'c' }, { 'd', 'e', 'f' }, { 'g', 'h', 'i' } };
		char[][] b = { { 'j', 'k', 'l' }, { 'm', 'n', 'o' }, { 'p', 'q', 'r' } };
		char[][] c = sample1.concat(a, b);
		System.out.println("concatenation: ");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 6; j++) {
				System.out.print(c[i][j]);
			}
			System.out.println();
		}
		System.out.println("-----------------------------------------------");
		char[][] d = { { 'a', 'b', 'c' }, { 'd', 'e', 'f' }, { 'g', 'h', 'i' } };
		System.out.println("1st row of elements: ");
		char[] fr = sample1.FirstRow(d);
		for (char e : fr) {
			System.out.print(e + " ");
		}
		System.out.println();
		System.out.println("-----------------------------------------------");
		String alphabets = sample1.Alphabets();
		System.out.println("26 upper case alphabets: ");
		System.out.println(alphabets + " ");
		System.out.println("-----------------------------------------------");
		
		String firstHalf = sample1.FirstHalfUppercaseAlphabets();
		System.out.println("1st half of the uppercase alphabets: ");
		System.out.println(firstHalf);
		System.out.println("-----------------------------------------------");
		
		String secondHalf = sample1.SecondHalfUppercaseAlphabets();
		System.out.println("2nd half of the upper case alphabets: ");
		System.out.println(secondHalf);
		System.out.println("-----------------------------------------------");
		
		System.out.println("lower case alphabets in reverse order: ");
		String lowercase=sample1.LowerCaseAlphabetsReverse();
		System.out.println(lowercase+" ");
		
		System.out.println();
		System.out.println("-----------------------------------------------");
		System.out.println("print prime no.s from 1 to 50: ");
		int num=49;
		int flag = 0;
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				flag += 1;
				break;
			}
		}
		if (flag == 0)
			System.out.println(true);
		else
			System.out.println(false);
			
		

		System.out.println("-----------------------------------------------");
		System.out.println("sum of prime no.s from 1 to 100: ");
		int gg = sample1.sumofprimes();
		System.out.println(gg + " ");
		System.out.println("-----------------------------------------------");
		System.out.println("3st row of elements: ");
		char[][] y = { { 'a', 'b', 'c' }, { 'd', 'e', 'f' }, { 'g', 'h', 'i' } };
		char[] h = sample1.ThirdRow(y);
		for (char e : h) {
			System.out.print(e + " ");
		}
		
		/*
		 * String o[]= {"HelloWorld"}; String t[]=sample1.getsecondhalfelements(o);
		 * for(String tt:o) { System.out.println(t); }
		 */
	}

}




