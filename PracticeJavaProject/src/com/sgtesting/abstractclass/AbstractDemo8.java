package com.sgtesting.abstractclass;

abstract class student08
{
	String name;
	int id;
	student08(String fname,int id)
	{
		this.name=fname;
		this.id=id;
		System.out.println("superclass constructor1: name="+fname);
		System.out.println("superclass constructor1: id="+id);

	}
	student08(int id)
	{
		this.id=id;
		System.out.println("superclass constructor2: id="+id);
	}
	student08(String fname)
	{
		this.name=fname;
		System.out.println("superclass constructor3: name="+fname);
	}
}
class college08 extends student08
{
	college08(String name,int id)
	{
		super(name,id);
		System.out.println("subclass1 constructor1 name=" +name);
		System.out.println("subclass1 constructor1 id=" +id);

	}
	college08(int id)
	{
		super(id);
		System.out.println("subclass1 constructor2: id="+id);
	}
	college08(String name)
	{
		super(name);
		System.out.println("subclass1 constructor3: name="+name);
	}
}
class Branch8 extends college08
{
	Branch8(String name,int id)
	{
		super(name,id);
		System.out.println("subclass2 constructor1 name=" +name);
		System.out.println("subclass2 constructor1 id=" +id);

	}
	Branch8(int id)
	{
		super(id);
		System.out.println("subclass2 constructor2: id="+id);
	}
	Branch8(String name)
	{
		super(name);
		System.out.println("subclass2 constructor3: name="+name);
	}
}
public class AbstractDemo8 {

	public static void main(String[] args) {
		Branch8 o1=new Branch8("Sapna",2001);
		System.out.println("++++++++++++++++++++++++++");
		Branch8 o2=new Branch8("ketana");
		System.out.println("+++++++++++++++++++++++++++++");
		Branch8 o3=new Branch8(2002);


	}

}



