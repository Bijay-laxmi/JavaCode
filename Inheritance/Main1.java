package Inheritance;
class Vehicle10 {
	  String make;
	  String model;
	  int year;
	  int maximumSpeed;

	 // Constructor
	 public Vehicle10(String make, String model, int year, int maximumSpeed) {
	     this.make = make;
	     this.model = model;
	     this.year = year;
	     this.maximumSpeed = maximumSpeed;
	 }

	 // Drive method
	 public void drive() {
	     System.out.println(make + " " + model + " is driving.");
	 }
	 public void display() {
	     System.out.println("Make: " + make);
	     System.out.println("Model: " + model);
	     System.out.println("Year: " + year);
	     System.out.println("Maximum Speed: " + maximumSpeed);
	 }
	}

	// Car subclass
	class Car10 extends Vehicle10 {

	 public Car10(String make, String model, int year, int maximumSpeed) {
	     super(make, model, year, maximumSpeed);
	 }

	 // Override the drive method for Car
	 @Override
	 public void drive() {
	     System.out.println(make + " " + model + " Car is driving.");
	 }
	}

	//Define the Bike subclass
	class Bike1 extends Vehicle10 {
	 // Constructor
	 public Bike1(String make, String model, int year, int maximumSpeed) {
	     super(make, model, year, maximumSpeed);
	 }

	 // Override the drive method for Bike
	 @Override
	 public void drive() {
	     System.out.println(make + " " + model + " Bike is driving.");
	 }
	}


public class Main1 {
	 public static void main(String[] args)
	 {
	     // Instances a Car object
	     Car10 car = new Car10("Bayerische Motoren Werke AG", "BMW", 2018, 250);
	     Bike1 bike = new Bike1("Bajaj Auto","Bajaj Pulsar N150" ,2014, 90);

	    
	     System.out.println("Car Attributes:");
	     car.display();
	     System.out.println("\nBike Attributes:");
	     bike.display();

	     System.out.println("\nCalling drive method:");
	     car.drive();
	     bike.drive();
	     
	 }
	}





