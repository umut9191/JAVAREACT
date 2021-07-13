package javaHomework;

public class Main {

	public static void main(String[] args) {
		// Ozellik nesnesi olarak Apartment ve EstateAgent siniflari olusturuldu
		// Is sinifi olarak ApartmentManager olusturuldu

		
		Apartment apartment1=new Apartment(1,true,2,10,4,"high entrance","Izmir-Bornova-Kazimdirik Mh.");
		
		Apartment apartment2=new Apartment();
		apartment2.id=2;
		apartment2.isFurnished=false;
		apartment2.buildingAge=4;
		apartment2.numberOfBalcony=1;
		apartment2.numberOfFloors=3;
		apartment2.floorLocation="fourth";
		apartment2.Address="Istanbul-Sisli";
		
		Apartment apartment3=new Apartment(3,true,1,5,3,"high entrance","Ankara");
		
		Apartment[] apartments= {apartment1,apartment2,apartment3};
		
		
		  for (Apartment apartment : apartments) {
			System.out.println(apartment.Address);
		  }
		  //
		  EstateAgent agent1=new EstateAgent(1,"Emlak1","0534 111 11 11");
		  EstateAgent agent2=new EstateAgent(2,"Emlak2","0534 222 22 33");
		  EstateAgent agent3=new EstateAgent(3,"Emlak3","0534 333 33 33");
		  
		  EstateAgent[] agents= {agent1,agent2,agent3};
		  for (EstateAgent agent : agents) {
			System.out.println(agent.name);
		  }
		  
		  ApartmentManager apartmentManager=new ApartmentManager();
		  
		  apartmentManager.detail(apartment1);
		  apartmentManager.detail(apartment2);
		  apartmentManager.detail(apartment3);
		  
		  apartmentManager.streetView(apartment1);
		  apartmentManager.streetView(apartment2);
		  apartmentManager.streetView(apartment3);
	}

}
