package com.gentech.noargs;

class Emp
{
	int empno;
	String empfirstname;
	String emplastname;
	String empemail;
	Emp()
	{
		empno=2;
		empfirstname="Ketana";
		emplastname="Biradar";
		System.out.println("emp no:"+empno);
		System.out.println("emp first name:"+empfirstname);
		System.out.println("emp last name:"+emplastname);
		System.out.println("++++++++++++++++++++++++++++++++++");
	}
}
class Dept
{
	String deptname;
	int deptno;
	String address;
	Dept()
	{
		deptname="Software Engineer";
		deptno=3;
		address="Bengalore";
		System.out.println("department name:"+deptname);
		System.out.println("department name:"+deptno);
		System.out.println("adress:"+address);
		System.out.println("++++++++++++++++++++++++++++++++++");
	}
}
class insurence
{
	int insid;
	String instype;
	insurence()
	{
		insid=15;
		instype="healthinsurence";
		System.out.println("insurence id:"+insid);
		System.out.println("instype:"+instype);
	}
}
public class EmpDeptInsExample {

	public static void main(String[] args) {
		Emp preet=new Emp();

		Dept ece=new Dept();

		insurence insure=new insurence();

	}

}



