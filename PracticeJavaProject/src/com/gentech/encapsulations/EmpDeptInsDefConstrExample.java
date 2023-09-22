package com.gentech.encapsulations;

class Emp
{
	int empno;
	String empfirstname;
	String emplastname;
	String empemail;
}
class Dept
{
	String deptname;
	int deptno;
	String address; 
}
class insurence
{
	int insid;
	String instype;
}
public class EmpDeptInsDefConstrExample {

	public static void main(String[] args) {
		Emp hari=new Emp();
		hari.empfirstname="harivandana";
		hari.emplastname="jampani";
		hari.empno=1;
		hari.empemail="harivandana.jampani@gmail.com";
		System.out.println(hari.empfirstname);
		System.out.println(hari.emplastname);
		System.out.println(hari.empemail);
		System.out.println(hari.empno);
		System.out.println("+++++++");
		Dept ece=new Dept();
		ece.deptname="software";
		ece.deptno=10;
		ece.address="banglore";
		System.out.println(ece.deptname);
		System.out.println(ece.deptno);
		System.out.println(ece.address);
		System.out.println("+++++++++++");
		insurence insure=new insurence();
		insure.insid=20;
		insure.instype="normal";
		System.out.println(insure.insid);
		System.out.println(insure.instype);
	}
}

