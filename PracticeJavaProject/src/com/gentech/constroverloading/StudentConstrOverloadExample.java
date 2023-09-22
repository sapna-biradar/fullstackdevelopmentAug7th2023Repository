package com.gentech.constroverloading;
class Students
{
	Students(int Student_id)
	{
		System.out.println("Student_id :"+Student_id);
	}
	Students(String StudentName)
	{
		System.out.println("StudentName:"+StudentName);
	}
	Students(boolean is_active)
	{
		System.out.println("is_active :"+is_active);
	}

}
public class StudentConstrOverloadExample {

	public static void main(String[] args) {
		Students o1=new Students(67);
		Students o2=new Students("sapna ");
		Students o3=new Students(true);

	}

}
/*
Student_id :67
StudentName:sapna 
is_active :true
 */
