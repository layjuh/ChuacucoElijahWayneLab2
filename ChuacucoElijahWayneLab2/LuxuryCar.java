package com.sample;

public class LuxuryCar extends Car {
	
	
	private int seats;
	private int gasliters;
	
	public LuxuryCar(int year, String color, String licensenumber, String model, int seats, int gasliters) {
	super (year, color, licensenumber, model);
	this.seats =  seats;
	this.gasliters =  gasliters;
	
	}
	public void print() {
		System.out.println("LuxuryCar Details:");
		super.print();
		System.out.println("\t" + seats);
		System.out.println("\t" + gasliters + "LITERS");
	}
}