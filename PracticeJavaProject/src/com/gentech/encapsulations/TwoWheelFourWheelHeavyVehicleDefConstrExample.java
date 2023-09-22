package com.gentech.encapsulations;

class TwoWheelers
{
	String type;
	int engineCapacity;
	String hasStorage;
	String fuelType;
}
class FourWheeler {
	String type;
	int seatingCapacity;
	String isSUV;
	String fuelType;
}
class HeavyVehicle {
	String type;
	double maxPayload;
	String fuelType;
	int numAxles;
}
public class TwoWheelFourWheelHeavyVehicleDefConstrExample {

	public static void main(String[] args) {
		TwoWheelers tw = new TwoWheelers();
		tw.type="scooter";
		tw.engineCapacity=125;
		tw.hasStorage="yes";
		tw.fuelType="petrol";
		System.out.println("Two wheeler type:"+tw.type);
		System.out.println("Engine capacity:"+tw.engineCapacity);
		System.out.println("Does it have storage space:"+tw.hasStorage);
		System.out.println("Fuel type:"+tw.fuelType);
		System.out.println("----------------------------------");
		FourWheeler fw = new FourWheeler();
		fw.type="SUV";
		fw.seatingCapacity=6;
		fw.isSUV="yes";
		fw.fuelType="diesel";
		System.out.println("Four wheeler type:"+fw.type);
		System.out.println("Seating capacity:"+fw.seatingCapacity);
		System.out.println("Is this an SUV:"+fw.isSUV);
		System.out.println("Fuel type:"+fw.fuelType);
		System.out.println("-----------------------------------");
		HeavyVehicle hv=new HeavyVehicle();
		hv.type="truck";
		hv.maxPayload=4.5;
		hv.fuelType="petrol";
		hv.numAxles=2;
		System.out.println("Heavy vehicle type:"+hv.type);
		System.out.println("Maximum Payload: "+hv.maxPayload+"tons");
		System.out.println("Fuel type:"+hv.fuelType);
		System.out.println("Number of axels:"+hv.numAxles);
	}

}


