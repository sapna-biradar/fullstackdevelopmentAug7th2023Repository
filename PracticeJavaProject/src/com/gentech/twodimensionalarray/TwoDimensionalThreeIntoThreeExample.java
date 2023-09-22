package com.gentech.twodimensionalarray;

public class TwoDimensionalThreeIntoThreeExample {

	public static void main(String[] args) {
		String x[][]= {{"sapna","preeti","pavitra"},
				{"renuka","soumya","sahana"},
				{"sakshi","ruchita","shreya"}};
		for(int i=x.length-1;i>=0;i--)
		{
			for(int j=x[i].length-1;j>=0;j--)
			{
				System.out.print(x[i][j]+" ");
			}
			System.out.println();
		}
	}
}
/*
shreya ruchita sakshi 
sahana soumya renuka 
pavitra preeti sapna 
*/