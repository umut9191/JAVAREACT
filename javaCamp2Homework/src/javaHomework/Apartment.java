package javaHomework;

public class Apartment {
	 int id;
	 boolean isFurnished;
	 int numberOfBalcony;
	 int buildingAge;
	 int numberOfFloors;
	 String floorLocation;
	 String Address;
	
	Apartment(){
		System.out.println("Apartman yapici method calisti");
	}
	
	Apartment(int id,
	 boolean isFurnished,
	 int numberOfBalcony,
	 int buildingAge,
	 int numberOfFloors,
	String  floorLocation,
	String  Address){
		this.id=id;
		this.isFurnished=isFurnished;
		this.buildingAge=buildingAge;
		this.numberOfBalcony=numberOfBalcony;
		this.numberOfFloors=numberOfFloors;
		this.floorLocation=floorLocation;
		this.Address=Address;
	}
	
	
}
