package com.sgtesting.abstractclass;

abstract class Department
{
	static void location(String departname)
	{
		System.out.println("Department name is:"+departname);
	}
	static void Faculty(String facultyname)
	{
		System.out.println("Faculty Name is :"+facultyname);
	}
	static void student(String studentname)
	{
		System.out.println("Student Name is :"+studentname);
	}
}

public class AbstractDemo4 {

	public static void main(String[] args) {
		
		Department.location("computer science and engineering");
		Department.Faculty("priyadarshini patil");
		Department.student("sapna biradar");

	}

}
