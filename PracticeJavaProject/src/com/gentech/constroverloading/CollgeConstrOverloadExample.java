package com.gentech.constroverloading;

class College
{
	College(int college_id)
	{
		System.out.println("collegeid :"+college_id);
	}
	College(double marks)
	{
		System.out.println("marks:"+marks);
	}
	College(String collegename)
	{
		System.out.println("CollegeName :"+collegename);
	}

}
public class CollgeConstrOverloadExample {

	public static void main(String[] args) {
		College o1=new College(84);
		College o2=new College(250.0);
		College o3=new College("PDA College of engineering gulbarga");

	}
}
/*
collegeid :84
marks:250.0
CollegeName :PDA College of engineering gulbarga
 */