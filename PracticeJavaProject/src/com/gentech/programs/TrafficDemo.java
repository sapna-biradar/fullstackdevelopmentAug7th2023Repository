package com.gentech.programs;

public class TrafficDemo {

	public static void main(String[] args) {
		String a=args[0];
		switch(a)
		{
		case "RED":case "Red":case "red":
			System.out.println("stop the vehicles");
			break;
		case "Yellow":
		    System.out.println("yellow for ready to go");
			break;
		case "Green":
			System.out.println("green for go");
			break;
		default:
			System.out.println("invalid");
			break;
		}

	}

}
