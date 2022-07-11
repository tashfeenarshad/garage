package com.qa.garage;

public class Car extends Vehicle {
	
	String range;
	int Bhp;
	
	public Car(String id, String name, String engine,String range, int Bhp) {
		
		this.id =id;
		this.name = name;
		this.engine = engine;
		this.range = range;
		this.Bhp = Bhp;
		
		}
	
	public Car() {
		
	}

	@Override
	public String toString() {
		return "Car [range=" + range + ", Bhp=" + Bhp + ", id=" + id + ", name=" + name + ", engine=" + engine + "]";
	}

	public String getRange() {
		return range;
	}

	public void setRange(String range) {
		this.range = range;
	}

	public int getBhp() {
		return Bhp;
	}

	public void setBhp(int bhp) {
		Bhp = bhp;
	}
	
	
	

}
