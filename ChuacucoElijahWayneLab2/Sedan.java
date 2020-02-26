package com.sample;

public class Sedan extends Car {
	public Sedan(int year, String color, String licensenumber, String model) {
		super(year, color, licensenumber, model);
	}
	public void print() {
		System.out.println("Sedan Details:");
		super.print(); 
	}


}