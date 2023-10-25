package class_constructor;

public class Car {
	private String make;
    private String model;
    private short year;
    private int price;

    // Parameterized constructor
    public Car(String make, String model, short year, int price) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    // Getter methods
    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public short getYear() {
        return year;
    }

    public int getPrice() {
        return price;
    }

    // Method to display car details
    public void display() {
        System.out.println("Make: " + getMake());
        System.out.println("Model: " + getModel());
        System.out.println("Year: " + getYear());
        System.out.println("Price: " + getPrice());
    }

    public static void main(String[] args) {
        Car obj = new Car("Mahindra", "thar", (short)2015, 1693700);
        obj.display();
        
        System.out.println();
        
        Car obj2 = new Car("Tata", "Tigor", (short)2017, 7500000);
        obj2.display();
        
    }
}



