package com.oops;

abstract class Vehicle {
	String brand;
	int year;

	// constructor
	Vehicle(String brand, int year) {
		this.brand = brand;
		this.year = year;
	}

	// Abstract method(no implementation)
	abstract void start();

	// abstract method
	abstract void stop();

	abstract int getMaxSpeed();

	// concrete method
	void displayInfo() {
		System.out.println("Brand: " + brand);
		System.out.println("year: " + year);

	}

	void honk() {
		System.out.println("Vehicle is honking");
	}
}

class Car extends Vehicle {
	Car(String brand, int year, String fuelType) {
		super(brand, year);
		this.fuelType = fuelType;
	}

	String fuelType;

	@Override
	void start() {
		System.out.println("Car started with key ignition");

	}

	@Override
	void stop() {
		System.out.println("Car stopped using brake pedal");

	}

	@Override
	int getMaxSpeed() {
		return 200;
	}

}

public class AbstractionExample {

	public static void main(String[] args) {
		Car car = new Car("Toyota", 2023,"Petrol");
		System.out.println("===car===");
		car.displayInfo();
		car.start();
		car.honk();
		System.out.println("Max Speed: " + car.getMaxSpeed() + " km/h");
		car.stop();
		

	}

}
