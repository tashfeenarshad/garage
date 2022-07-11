package com.qa.garage;

public class Cycle extends Vehicle {
 
	 	String durability;
	 	String brand;
	 	
	 	public Cycle(String id, String name, String engine,String durability, String brand) {
	 		
	 		this.id =id;
			this.name = name;
			this.engine = engine;
			this.durability = durability;
			this.brand = brand;
	 		
	 		}

	 	public Cycle () {
	 		
	 		
	 		
	 		
	 		
	 	}

		@Override
		public String toString() {
			return "Cycle [durability=" + durability + ", brand=" + brand + ", id=" + id + ", name=" + name
					+ ", engine=" + engine + "]";
		
		
		
		
		
		}

		public String getDurability() {
			return durability;
		}

		public void setDurability(String durability) {
			this.durability = durability;
		}

		public String getBrand() {
			return brand;
		}

		public void setBrand(String brand) {
			this.brand = brand;
		}
		
		
		
		
	

	 	
	 	
	 	
	 	
	 	
}
