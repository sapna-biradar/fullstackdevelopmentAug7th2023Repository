package com.gentech.noargs;

class Desktop
{
	int desktopid;
	String Desktopname;
	int  version;
	int noofdesktops;
	int ram;
	int storage;
	Desktop()
	{
		desktopid=11;
		Desktopname="hp";
		storage=200;
		ram=8;
		version=3;
		System.out.println("desk top id:"+desktopid);
		System.out.println("desk top name:"+Desktopname);
		System.out.println("storage is :"+storage);
		System.out.println("RAM:"+ram);
		System.out.println("version:"+version);
		System.out.println("++++++++++");
	}
}
class Laptop
{
	int laptopid;
	String Laptopname;
	int version;
	int nooflaptops;
	int ram;
	int storage;
	Laptop()
	{
		laptopid=11;
		Laptopname="hp";
		storage=200;
		ram=8;
		version=3;
		System.out.println("laptop id:"+laptopid);
		System.out.println("laptop name:"+Laptopname);
		System.out.println("storage:"+storage);
		System.out.println("RAm:"+ram);
		System.out.println("version:"+version);
		System.out.println("++++++++++");
	}
}
class Mobiledevices
{
	int mobileid;
	String mobilename;
	int version;
	int noofmobiles;
	int ram;
	int storage;
	Mobiledevices()
	{
		mobileid=12;
		mobilename="oneplus";
		storage=126;
		version=10;
		System.out.println("mobile id :"+mobileid);
		System.out.println("mobile name:"+mobilename);
		System.out.println("storage is:"+storage);
		System.out.println("RAM:"+ram);
		System.out.println("version is:"+version);

	}
}

public class DesktopLapMobExample {

	public static void main(String[] args) {
		Desktop desktops=new Desktop();

		Laptop lap=new Laptop();

		Mobiledevices mobile=new Mobiledevices();



	}

}




