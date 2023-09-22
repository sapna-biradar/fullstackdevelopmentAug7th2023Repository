package com.gentech.polymorphismdemo;
abstract class Movie
{
	abstract void film();
}
class Comedy extends Movie
{
	void film()
	{
		String filmtype="funny";
		System.out.println("type of movie:"+filmtype);
	}
}
class Love extends Movie
{
	void film()
	{
		String filmtype="love";
		System.out.println("type of movie:"+filmtype);
	}
}
class Action extends Movie
{
	void film()
	{
		String filmtype="Action";
		System.out.println("type of mvie:"+filmtype);
	}
}

public class ProgramAssignment4 {
	public static void main(String[] args) {
		Movie movies=null;
		Comedy com=new Comedy();
		Love love=new Love();
		Action action=new Action();
		movies=com;
		movies.film();
		movies=love;
		movies.film();
		movies=action;
		movies.film();


	}

}