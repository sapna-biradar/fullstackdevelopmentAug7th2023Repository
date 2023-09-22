package com.gentech.programs;

public class WeekDayDemo {

	public static void main(String[] args) {
		int num=Integer.parseInt(args[0]);
		if(num==1) 
			System.out.println("This is a Sunday");
		else if(num==2)
			System.out.println("This is a Monday");
		else if(num==3)
			System.out.println("This is a Tuesday");
		else if(num==4)
			System.out.println("This is a Wednesday");
		else if(num==5)
			System.out.println("This is a Thursday");
		else if(num==6)
			System.out.println("This is a Friday");
		else if(num==7)
			System.out.println("This is a Saturday");
		else
			System.out.println("Enter 1 to 7...");		
		
	}
}
