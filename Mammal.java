package com.ernesto.zookeeper2;

public class Mammal {
	protected int energyLevel;
	
	public Mammal() {
		this.energyLevel = 300;
	}
	
	public Mammal(int energyLevel) {
		this.energyLevel = energyLevel;
	}
	
	public int displayEnergy() {
		return energyLevel;
	}
	
}