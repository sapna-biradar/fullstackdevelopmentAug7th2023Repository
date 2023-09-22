package com.gentech.ParameterizedConstr;

class Emp
{

	Emp(int empno,String empfirstname,String emplastname,String empemail)
	{

		System.out.println("emp no:"+empno);
		System.out.println("emp first name:"+empfirstname);
		System.out.println("emp last name:"+emplastname);
		System.out.println("emp email id:"+empemail);
	}
}
class Dept
{

	Dept(String deptname,int deptno,String address)
	{
		deptname="marketing";
		deptno=3;
		address="Bengalore";
		System.out.println("department name:"+deptname);
		System.out.println("department name:"+deptno);
		System.out.println("adress:"+address);
	}
}
class insurence
{

	insurence(int insid,String instype)
	{

		System.out.println("insurence id:"+insid);
		System.out.println("instype:"+instype);
	}
}
public class DesktopLapMobParamConstrExample {

	public static void main(String[] args) {
		Emp preet=new Emp(2,"ram","namagond","ram@gmail.com");

		Dept ece=new Dept("marketing",3,"mysore");

		insurence insure=new insurence(15,"healthinsurence");
	}

}



