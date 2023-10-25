package class_constructor;

     class Vehicle1 {
		// Base class: Vehicle
		    void start() {
		        System.out.println("Vehicle started.");
		    }
		}
       // Subclass: Car
		class Car2 extends Vehicle1 {
		    //Override
		    void start() {
		        System.out.println("Car started.");
		    }
		}

		// Subclass: Motorcycle
		class Motorcycle extends Vehicle1 {
		    //Override
		    void start() {
		        System.out.println("Motorcycle started.");
		    }
		}

		// Garage class
		class Garage {
		    void serviceVehicle(Vehicle1 vehicle) {
		        vehicle.start();
		        System.out.println("Vehicle1 serviced.");
		    }
		}
		//main class
		    public class MainClass {
		    	
		     public static void main(String[] args) {
		        // Create instances of Car and Motorcycle
		        Car2 car = new Car2();
		        Motorcycle motorcycle = new Motorcycle();

		        // Create an instance of the Garage class
		        Garage garage = new Garage();
		        garage.serviceVehicle (car);
		        garage.serviceVehicle (motorcycle);
	     }
		    }
	 


