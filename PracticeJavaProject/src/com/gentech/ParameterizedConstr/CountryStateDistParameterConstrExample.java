package com.gentech.ParameterizedConstr;
class Country
{

	Country(String countryname,int  noofstates,long population,String language)
	{

		System.out.println("country name:"+countryname);
		System.out.println("population is :"+population);
		System.out.println("no of states:"+noofstates);
		System.out.println("language:"+language);
		System.out.println("++++++++++++");
	}
}
class State
{

	State(String statename,int noofdistricts,int population,String language)
	{  

		System.out.println("state name:"+statename);
		System.out.println("no of dist:"+noofdistricts);
		System.out.println("population:"+population);
		System.out.println("language:"+language);
		System.out.println("++++++++++");
	}
}
class District
{

	District(String Districtname,int population,String language,int noofmandals)
	{

		System.out.println("district name:"+Districtname);
		System.out.println("no of mandals :"+noofmandals);
		System.out.println("population is:"+population);
		System.out.println("language:"+language);
	}
}

public class CountryStateDistParameterConstrExample {

	public static void main(String[] args) {
		Country countries=new Country("india",3200000,32,"Hindi");

		State states=new State("Karnataka",27,3220000,"Kannada");

		District dist=new District("gulbarga",240000,"kannada",18);
	}

}
