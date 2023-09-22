package com.sgtesting.methodoveriding;
class Company
{
	void showname(String companyname)
	{
		System.out.println("company name:"+companyname);
	}
}
class Recruiter extends Company
{
	Recruiter(String recruitingcomp)
	{
		super.showname(recruitingcomp);
	}

	void showname(String recruitingcompany)
	{
		System.out.println("company name in sub class:"+recruitingcompany);
	}
}
class Employee extends Recruiter
{
	Employee(String name)
	{
		super(name);
		super.showname(name); 

	}
	void showname(String employeename)
	{
		System.out.println("Employee name is :"+employeename);
	}
}
public class MethodOveridingDemo1 {
	public static void main(String[] args) {
		Employee obj=new Employee("wipro");
		obj.showname("sapna");

	}

}
