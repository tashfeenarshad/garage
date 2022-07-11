package com.qa.garage;
import java.util.ArrayList;
import java.util.Iterator;

public class Garage {

	public Garage() {
		
		ArrayList<Vehicle>vehicleCollections = new ArrayList<>();
		}
	
	
	ArrayList<Vehicle>vehicleCollections = new ArrayList<>();
	public Vehicle newVehicle (String nV, String name) {
		
		Vehicle i = null;
				if(nV.equalsIgnoreCase("car")) {
					Car car =new Car();
					car.setBhp(300);
					car.setEngine(" inline-6 automobile engines.JZ engines were 24-valve DOHC engines in 2.5- and 3.0-litre versions.");
					car.setId (nV);
					car.setName("Toyata Supra Mk4");
					car.setRange("200k easy");
					i= car;
					
					
					
					
				}else if (nV.equalsIgnoreCase("cycle")) {
					Cycle cycle = new Cycle();
					cycle.setBrand("Arshad bikes");
					cycle.setDurability("Invincible");
					cycle.setEngine("human effort");
					cycle.setId("bike 45");
					cycle.setName("new model x45");
					
					
				}else if (nV.equalsIgnoreCase("Motorbike")) {
					Motorbike mb = new Motorbike();
					mb.setBraking("liquid powerd nitro ");
					mb.setEngine("V8");
				   mb.setId("Suzuki");
				   mb.setHp(2000);
				   mb.setName("killer 455");
						   
					
					
					
				}
				return i;
		
		}
	
	 public void billGarage(ArrayList<Vehicle> x) {
		 
		 int price;
		 int IntialPrice = 1000;
		 
		 for (Vehicle i : x) {
			 
			 if (i instanceof Car) {
				 
				 price = IntialPrice * 5;
				 System.out.println("the bill to repair your car is " + i.getName() + "is $" + price);
				 
			 }else if (i instanceof Motorbike) {
				 price = IntialPrice * 50;
				 System.out.println("the bill to repair your motorbike is " + i.getName() + "is $" + price);
			 }else if (i instanceof Cycle);
			 price = IntialPrice / 5;
			 System.out.println("the bill to repair your cycle is " + i.getName() + "is $" + price);
			 
		 }
		 
		 
	 }
	   
	
	public void addVehicle(Vehicle i) {
		   vehicleCollections.add(i);
		   
	   }
	   public void removeVehicle(ArrayList<Vehicle>j, String nV) {
		   Iterator<Vehicle> it = vehicleCollections.iterator();
		   while(it.hasNext()) {
			   if(it.next().getName().equalsIgnoreCase(nV)) {
				   it.remove();
			   }
		   }
		  
		   
	   }
	   
	   public static void emptyGarage(ArrayList<Vehicle> j) {

	        j.clear();
	        System.out.println("Garage has been emptied");
	    }

	
	
	
}

