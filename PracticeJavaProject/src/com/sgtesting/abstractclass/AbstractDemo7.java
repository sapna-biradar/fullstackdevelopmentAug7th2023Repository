package com.sgtesting.abstractclass;

abstract class bank2
{
	bank2(String name)
	{
		System.out.println("bank name is:"+name);

	}
}
class branch2 extends bank2
{
	String branch;
	branch2(String n,String b)
	{
		super(n);
		this.branch=b;
		System.out.println("Branch name is:"+b);

	}
}
class accounts2 extends branch2
{
	int total;
	accounts2(String name,String branch,int totalaccounts)
	{
		super(name,branch);
		this.total=totalaccounts;
		System.out.println("total no of accounts:"+totalaccounts);

	}
}
public class AbstractDemo7 {
	public static void main(String[] args) {
		
		accounts2 oo=new accounts2("pyt","gokul",500);



	}

}
