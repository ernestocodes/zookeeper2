package com.ernesto.zookeeper2;

public class BatTest {
	public static void main(String[] args) {
		Bat batty = new Bat();
		batty.fly();
		batty.attackTown();
		batty.eatHumans();
		batty.attackTown();
		batty.eatHumans();
		batty.fly();
		batty.attackTown();
		System.out.println(batty.displayEnergy());
	}
}
