package com.gentech.encapsulations;

class Desktop
{
	int desktopid;
	String Desktopname;
	int  version;
	int noofdesktops;
	int ram;
	int storage;

}
class Laptop
{
	int laptopid;
	String Laptopname;
	int version;
	int nooflaptops;
	int ram;
	int storage; 
}
class Mobiledevices
{
	int mobileid;
	String mobilename;
	int version;
	int noofmobiles;
	int ram;
	int storage;
}

public class DesktopLapMobDefaultConstExample {

	public static void main(String[] args) {
		Desktop desktops=new Desktop();
		desktops.desktopid=10;
		desktops.Desktopname="dell";
		desktops.storage=126;
		desktops.ram=8;
		desktops.version=5;
		System.out.println(desktops.desktopid);
		System.out.println(desktops.Desktopname);
		System.out.println(desktops.storage);
		System.out.println(desktops.ram);
		System.out.println(desktops.version);
		System.out.println("++++++++++");
		Laptop lap=new Laptop();
		lap.laptopid=10;
		lap.Laptopname="dell";
		lap.storage=126;
		lap.ram=8;
		lap.version=5;
		System.out.println(lap.laptopid);
		System.out.println(lap.Laptopname);
		System.out.println(lap.storage);
		System.out.println(lap.ram);
		System.out.println(lap.version);
		System.out.println("++++++++++");
		Mobiledevices mobile=new Mobiledevices();
		mobile.mobileid=10;
		mobile.mobilename="oneplus";
		mobile.storage=126;
		mobile.ram=8;
		mobile.version=10;
		System.out.println(mobile.mobileid);
		System.out.println(mobile.mobilename);
		System.out.println(mobile.storage);
		System.out.println(mobile.ram);
		System.out.println(mobile.version);


	}

}
