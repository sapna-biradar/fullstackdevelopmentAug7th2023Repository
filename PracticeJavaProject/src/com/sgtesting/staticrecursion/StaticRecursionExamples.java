package com.sgtesting.staticrecursion;

class assignment1 {
	static int n = 20;

	static void oddno() {
		if (n <= 40) {
			if (n % 2 != 0) {
				System.out.print(n + " ");
			}
			n++;
			oddno();
		}
	}

	static int n1 = 20;

	static void evenno() {

		if (n1 > 1) {
			if (n1 % 2 == 0) {
				System.out.print(n1 + " ");
			}
			n1--;
			evenno();
		}
	}

	static int n2 = 1;

	static void divisible8() {

		if (n2 <= 100) {
			if (n2 % 8 == 0) {
				System.out.print(n2 + " ");
			}
			n2++;
			divisible8();
		}
	}

	static int n3 = 100;
	static int count = 0;

	static int divisible10() {

		if (n3 <= 200) {
			if (n3 % 10 == 0) {
				count++;
			}
			n3++;
			divisible10();
		}
		return count -1;
	}

	static int n4 = 1;
	static int sum = 0;

	static int sum20() {

		if (n4 <= 20) {
			sum = sum + n4;
			n4++;
			sum20();
		}
		// System.out.println(n4+" "+sum);
		return sum;
	}

	static int n5 = 1;

	static void table10() {

		if (n5 <= 10) {
			System.out.println("10 * " + n5 + " = " + n5 * 10);
			n5++;
			table10();
		}
	}

	static int n6 = 10;

	static void table5() {

		if (n6 >= 1) {
			System.out.println("5 * " + n6 + " = " + n6 * 5);
			n6--;
			table5();
		}
	}
}

public class StaticRecursionExamples {

	public static void main(String[] args) {
		System.out.println("Assignment 1");
		assignment1.oddno();
		System.out.println();

		System.out.println("Assignment 2");
		assignment1.evenno();
		System.out.println();

		System.out.println("Assignment 3");
		assignment1.divisible8();
		System.out.println();

		System.out.println("Assignment 4");
		int n = assignment1.divisible10();
		System.out.println(n);

		System.out.println("Assignment 5");
		int n1 = assignment1.sum20();
		System.out.println(n1);

		System.out.println("Assignment 6");
		assignment1.table10();
		System.out.println();

		System.out.println("Assignment 7");
		assignment1.table5();
		System.out.println();
	}

}



