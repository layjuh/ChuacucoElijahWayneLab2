package com.sample;

public class Car {

	private int year;
	private String color;
	private String licensenumber;
	private String model;
	
	
	public Car(int year, String color, String licensenumber, String model) {
		this.year = year;
		this.color = color;
		this.licensenumber = licensenumber;
		this.model = model;
	}
	
	
	public int getYear() {
		return this.year;
	}
	
	public String getColor() {
		return this.color;
	}
	
	public String getLicensenumber() {
		return this.licensenumber;
	}
	
	public String getModel() {
		return this.model;
	}


	public void print() {
		System.out.println("\t" + year);
		System.out.println("\t" + color);
		System.out.println("\t" + licensenumber);
		System.out.println("\t" + model);
	}
	
}