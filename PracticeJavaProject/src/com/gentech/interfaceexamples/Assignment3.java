package com.gentech.interfaceexamples;
interface Hospital
{
	void showhospitaltdetails(String name);
}
interface Patient extends Hospital
{
	abstract void showpateintdetails(String pname);
}
interface HospitalLoc extends Patient
{
	abstract void showadress(String adress);
} 
class Disease implements  HospitalLoc
{
	public void showhospitaltdetails(String name)
	{
		System.out.println("The Hospital name is:"+name);
	}
	public void showpateintdetails(String pname)
	{
		System.out.println("The Pateint name is:"+pname);
	}
	public void showadress(String adress)
	{
		System.out.println("The hospital adress is:"+adress);
	}
	void showdiseasedetails(String name)
	{
		System.out.println("The disease name is:"+name);
	}
}
public class Assignment3 {
	public static void main(String[] args) {
		Disease obj=new Disease();
		obj.showhospitaltdetails("Govt hospital bangalore");
		obj.showpateintdetails("xyz");
		obj.showadress("Bangalore");
		obj.showdiseasedetails("cancer");
	}
}