package com.sample;

public class TestPolymorphism {

	public static void main(String[] args) {
		Car cars[] = new Car[3];
		cars[0] = new LuxuryCar(2020, "YELLOW", "999TMT", "Lamborghini", 2, 90);
		cars[1] = new LuxuryCar(2017, "BLUE", "163TMT", "SKYLINE", 2, 100);
		cars[2] = new Sedan(2019, "Black", "NIO163", "Honda Civic");
		 
		for (Car car : cars) {
			car.print();
		}
	}

}