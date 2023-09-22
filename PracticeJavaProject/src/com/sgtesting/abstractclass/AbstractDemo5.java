package com.sgtesting.abstractclass;

abstract class School
{
	abstract void showschoolname(String schoolname);

	abstract void displayadress(String schooladress);
}
class Principal extends School
{
	void showschoolname(String schoolname) 
	{
		System.out.println("School name parent class is:"+schoolname);
	}
	void displayadress(String schooladress)
	{
		System.out.println("School Adress in first child class is:"+schooladress);
	}
}
class Students extends Principal
{
	void displayadress(String schooladress)
	{
		System.out.println("School Adress in second child class is:"+schooladress);
	}
}
public class AbstractDemo5 {

	public static void main(String[] args) {
		Students o=new Students();
		o.displayadress("Santapur taluka aurad di. bidar");
		
		Principal o1=new Principal();
		o1.showschoolname("Anubhava mantapa gurukul santpur");
		o1.displayadress("Bidar");
		

	}

}

