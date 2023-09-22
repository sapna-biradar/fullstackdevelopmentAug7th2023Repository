package com.gentech.ParameterizedConstr;

class Em
{

	Em(int empno,String empfirstname,String emplastname,String empemail)
	{

		System.out.println("emp no:"+empno);
		System.out.println("emp first name:"+empfirstname);
		System.out.println("emp last name:"+emplastname);
		System.out.println("emp email id:"+empemail);
		System.out.println("+++++++++++++++++++++++++++++");
	}
}
class De
{

	De(String deptname,int deptno,String address)
	{
		deptname="marketing";
		deptno=3;
		address="Bengalore";
		System.out.println("department name:"+deptname);
		System.out.println("department name:"+deptno);
		System.out.println("adress:"+address);
		System.out.println("+++++++++++++++++++++++++++++");
	}
}
class Ins
{

	Ins(int insid,String instype)
	{

		System.out.println("insurence id:"+insid);
		System.out.println("instype:"+instype);
	}
}
public class EmpoDepatInrParamtrConstrExample {

	public static void main(String[] args) {
		Em preet=new Em(2,"ram","namagond","ram@gmail.com");

		De ece=new De("marketing",3,"mysore");

		Ins insure=new Ins(15,"healthinsurence");
	}

}

