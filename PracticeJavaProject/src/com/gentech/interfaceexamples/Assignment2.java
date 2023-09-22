package com.gentech.interfaceexamples;
interface College
{
	void showcollege(int clgid,String clgname,String clgloc,String Branches);
}
interface Library extends College
{
	void displayLibrary(int Libraryid,String Bookname,String Author,String Libloc);
}
class CollegeLibrary implements Library
{
	public void showcollege(int clgid,String clgname,String clgloc,String Branch)
	{
		System.out.println("College id is : "+ clgid);
		System.out.println("College name is : "+ clgname);
		System.out.println("College location is : "+ clgloc);
		System.out.println("Branch Name : "+Branch);
	}
	public void displayLibrary(int Libraryid,String Bookname,String Author,String Libloc)
	{
		System.out.println("Librarian id is : "+ Libraryid);
		System.out.println("Book Name is : "+ Bookname);
		System.out.println("Author Name is : "+ Author);
		System.out.println("Library Location is : "+Libloc);
	}
}
public class Assignment2 {
	public static void main(String[] args) {
		CollegeLibrary o1=new CollegeLibrary();
		o1.showcollege(12, "Kalaburagi", "Computerscience", "Amareswari patil");
		o1.displayLibrary(160, "Python", "john", "Bidar");
	}
}
