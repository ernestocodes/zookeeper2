package com.ernesto.zookeeper2;

public class Bat extends Mammal{
	
	public void fly(){
		this.energyLevel -= 50;
		System.out.println("Screeeee");
	}
	
	public void eatHumans() {
		this.energyLevel += 25;
	}
	
	public void attackTown() {
		this.energyLevel -= 100;
		System.out.println("AAAHHHHH. HELP. The bat has my croissant, evil!");
	}
}
