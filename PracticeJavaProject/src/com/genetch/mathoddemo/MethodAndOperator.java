package com.genetch.mathoddemo;

class AndOperator
{
	void demo(int x,int y)
	{
		boolean res=((x<y)&&(y<x));
		System.out.println(res);
	}
	void demo1(int a,int b)
	{
		boolean result=((a<b)||(b<a));
		System.out.println(result);
	}
	void demo2(int m,int n)
	{
		boolean Z=!((m<n)||(n<m));
		System.out.println(Z);
	}
}

public class MethodAndOperator {

	public static void main(String[] args) {
		AndOperator o1=new AndOperator();
		o1.demo(2, 4);
		o1.demo1(4,5);
		o1.demo2(6,7);
		

	}

}
