package com.gentech.constrchaining;

class Ascending
{
	Ascending(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
				{
				int temp=0;
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			System.out.print(arr[i]+" ");
		}
	}
}
public class ArrayAscendingExample {

	public static void main(String[] args) {
		
		int a[]= {1,3,6,5,8,9,2,4,7};
		Ascending obj=new Ascending(a);
	}
}
/*
1 2 3 4 5 6 7 8 9 
*/