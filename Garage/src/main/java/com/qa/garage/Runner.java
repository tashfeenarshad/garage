package com.qa.garage;

public class Runner {
	
	

    public static void main(String[] args) {
    	
  Garage garage = new Garage ();
  
  garage.addVehicle(garage.newVehicle("car","audi"));
  garage.addVehicle(garage.newVehicle("car","bmw"));
  garage.addVehicle(garage.newVehicle("car","porsche"));
  garage.billGarage(garage.vehicleCollections);
  
  garage.removeVehicle(garage.vehicleCollections, "audi");
  System.out.println("");
  garage.billGarage(garage.vehicleCollections);
  
  garage.addVehicle(garage.newVehicle("cycle", "honda"));
  garage.addVehicle(garage.newVehicle("motorbike", "classical"));
  garage.addVehicle(garage.newVehicle("car", "Bugatti"));
  garage.emptyGarage(garage.vehicleCollections);
  garage.billGarage(garage.vehicleCollections);
  
  
    
    
    }
    }

