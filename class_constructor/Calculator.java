package class_constructor;

public class Calculator {
	    public int add(int a, int b) {
	        return a + b;
	    }

	    public int add(int a, int b, int c) {
	        return a + b + c;
	    }

	    public double add(double a, double b) {
	        return a + b;
	    }

	    public static void main(String[] args) {
	        Calculator calculator = new Calculator();

	        // Using the first add() method
	        int result1 = calculator.add(3, 22);
	        System.out.println("Result of adding two ints: " + result1);

	        // Using the second add() method
	        int result2 = calculator.add(6, 11, 12);
	        System.out.println("Result of adding three ints: " + result2);

	        // Using the third add() method
	        double result3 = calculator.add(4.5, 4.5);
	        System.out.println("Result of adding two doubles: " + result3);
	    }
	}

