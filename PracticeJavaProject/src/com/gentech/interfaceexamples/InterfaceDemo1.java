package com.gentech.interfaceexamples;
interface Company
{
	void showcompanyname(String name);
}
interface Employee extends Company
{
	void displayemployeename(String name);
}
interface Comploc extends Employee
{
	void showlocation(String location);
}
interface Department extends Comploc
{
	void displayEmployedept(String Department);
}
class Companyemployee implements Department
{
	public void showcompanyname(String name)
	{
		System.out.println("Company Name : "+name);
	}
	public void displayemployeename(String name)
	{
		System.out.println("Employee Name : "+name);
	}
	public void showlocation(String location)
	{
		System.out.println("Location is : "+location);
	}
	public void displayEmployedept(String Department)
	{
		System.out.println("Department Name : "+Department);
	}
}
public class InterfaceDemo1 {
	public static void main(String[] args) {
		Companyemployee o=new Companyemployee();
		o.showcompanyname("tcs");
		o.displayemployeename("sapna");
		o.showlocation("hyderabad");
		o.displayEmployedept("full stack development");
	}
}
