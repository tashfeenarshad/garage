package com.qa.garage;

public class Motorbike extends Vehicle {
	
	 String braking;
	 int Hp;
	 
	 public Motorbike(String id, String name, String engine,String braking, int Hp) {
		 this.id =id;
			this.name = name;
			this.engine = engine;
			this.braking = braking;
			this.Hp = Hp;
	 		
		 }
 
	 public Motorbike() {
		 
		  }

	@Override
	public String toString() {
		return "Motorbike [braking=" + braking + ", Hp=" + Hp + ", id=" + id + ", name=" + name + ", engine=" + engine
				+ "]";
	}

	public String getBraking() {
		return braking;
	}

	public void setBraking(String braking) {
		this.braking = braking;
	}

	public int getHp() {
		return Hp;
	}

	public void setHp(int hp) {
		Hp = hp;
	}

	
	






}
