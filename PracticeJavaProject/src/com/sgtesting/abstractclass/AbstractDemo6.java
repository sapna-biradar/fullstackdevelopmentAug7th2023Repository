package com.sgtesting.abstractclass;

abstract class Country
{
	abstract void showname(String countryname);

	abstract void displayname(String statename);
}
class State extends Country
{
	void showname(String countryname) 
	{
		System.out.println("country name in parent class is:"+countryname);
	}
	void displayname(String statename)
	{
		System.out.println("state name in first child class is:"+statename);
	}
}
class District extends State
{
	void displayname(String statename)
	{
		System.out.println("State name in second child class is:"+statename);
	}
}

class Person extends Country
{
	void showname(String pname)
	{
		System.out.println("person name is:"+pname);
	}
	void displayname(String personloc)
	{
		System.out.println("Person Location is :"+personloc);
	}
}

public class AbstractDemo6 {
	public static void main(String[] args) {
		Person o=new Person();
		o.showname("Sapna");
		o.displayname("bidar");
		
		District o1=new District();
		o1.displayname("karnataka");
		
		State o2=new State();
		o2.showname("india");
		o2.displayname("tamilnadu");
		
	}

}

