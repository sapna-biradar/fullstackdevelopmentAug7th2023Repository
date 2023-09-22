package com.gentech.encapsulations;

class Country
{
	String countryname;
	int  noofstates;
	long population;
	String language;
}
class State
{
	String statename;
	int noofdistricts;
	int population;
	String language;
}
class District
{
	String Districtname;
	int population;
	String language;
	int noofmandals;
}

public class CountryStateDistrictDeafConstrExample {

	public static void main(String[] args) {
		Country countries=new Country();
		countries.countryname="india";
		countries.population=100000000;
		countries.noofstates=22;
		countries.language="english";
		System.out.println(countries.countryname);
		System.out.println(countries.population);
		System.out.println(countries.noofstates);
		System.out.println(countries.language);
		System.out.println("++++++++++++");
		State states=new State();
		states.statename="andhrapradesh";
		states.noofdistricts=25;
		states.language="telugu";
		states.population=2900000;
		System.out.println(states.statename);
		System.out.println(states.noofdistricts);
		System.out.println(states.population);
		System.out.println(states.language);
		System.out.println("++++++++++");
		District dist=new District();
		dist.Districtname="prakasam";
		dist.noofmandals=19;
		dist.population=1000000;
		dist.language="telugu";
		System.out.println(dist.Districtname);
		System.out.println(dist.noofmandals);
		System.out.println(dist.population);
		System.out.println(dist.language);
	}

}
