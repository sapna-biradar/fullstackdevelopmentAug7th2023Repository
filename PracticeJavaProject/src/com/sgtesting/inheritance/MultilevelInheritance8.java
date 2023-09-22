package com.sgtesting.inheritance;

class a8 {
	String names;
	int rollno;
	int pincode;

	a8(String name, int r, int cc) {
		names = name;
		rollno = r;
		pincode = cc;
		System.out.println("Super Class name : " + names);
		System.out.println("Roll no : " + rollno);
		System.out.println("College Code : " + pincode);
	}
}

class a82 extends a8 {
	String names;
	int rollno;
	int pincode;

	a82(String name, int r, int cc) {
		super(name, r, cc);
		names = name;
		rollno = r;
		pincode = cc;
		System.out.println("Child Class 1 name : " + names);
		System.out.println("Roll no : " + rollno);
		System.out.println("College Code : " + pincode);
	}
}

class a83 extends a82 {
	String names = "";
	int rollno;
	int pincode;

	a83(String name, int r, int cc) {
		super(name, r, cc);
		names = name;
		rollno = r;
		pincode = cc;
		System.out.println("Child Class 2 name : " + names);
		System.out.println("Roll no : " + rollno);
		System.out.println("College Code : " + pincode);
	}
}

class a84 extends a8 {
	String names = "";
	int rollno;   
	int pincode;

	a84(String name,int r,int cc)
	{
		super(name,r,cc);
		names = name;
		rollno = r;
		pincode = cc;
		System.out.println("Child Class 3(simple) name : "+names);
		System.out.println("Roll no : "+rollno);
		System.out.println("College Code : " + pincode);
	}
}

public class MultilevelInheritance8 {

	public static void main(String[] args) {
		a83 obj = new a83("Bhimanagouda ", 84, 560072);
		a84 obj2 = new a84("Adarsha", 44, 560017);
	}
}


