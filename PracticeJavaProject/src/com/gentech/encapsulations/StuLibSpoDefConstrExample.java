package com.gentech.encapsulations;

class Student
{
	int studid;
	String studfirstname;
	String studlastname;
	String studemail;
	long studmobileno; 
}
class Library
{
	int libid;
	String libname;
	int noofbooks;
	String clgname;
}
class Sports
{
	int sportid;
	String sportname;
	int noofplayers;
	String coachname; 
}
public class StuLibSpoDefConstrExample {
	public static void main(String[] args) {
		Student sapna=new Student();
		sapna.studfirstname="sapna";
		sapna.studlastname="biradar";
		sapna.studemail="sapnabiradar@gmail.com";
		sapna.studid=20;
		sapna.studmobileno=863906200;
		System.out.println(sapna.studfirstname);
		System.out.println(sapna.studlastname);
		System.out.println(sapna.studemail);
		System.out.println(sapna.studid);
		System.out.println(sapna.studmobileno);
		System.out.println("+++++++");
		Library lib=new Library();
		lib.libid=203;
		lib.libname="digital library";
		lib.noofbooks=1000;
		lib.clgname="rise";
		System.out.println(lib.libid);
		System.out.println(lib.libname);
		System.out.println(lib.noofbooks);
		System.out.println(lib.clgname);
		System.out.println("+++++++++++");
		Sports sport=new Sports();
		sport.sportid=100;
		sport.sportname="cricket";
		sport.noofplayers=11;
		sport.coachname="virat";
		System.out.println(sport.sportid);
		System.out.println(sport.sportname);
		System.out.println(sport.noofplayers);
		System.out.println(sport.coachname);
	}
}