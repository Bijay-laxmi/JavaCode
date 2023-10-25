package class_constructor;
import java.util.Scanner;

public class SimpleInterest {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Input principal amount
	        System.out.print("Enter the principal amount: ");
	        double principal = scanner.nextDouble();

	        // Input time in years
	        System.out.print("Enter the time (in years): ");
	        double time = scanner.nextDouble();

	        double rate;

	        // Determine the interest rate based on the principal amount
	        if (principal > 10000) {
	            rate = 0.10; // 10% interest rate
	        } else if (principal >= 5000 &&  principal <=54233){
	            rate = 0.08; // 8% interest rate
	        } else {
	            rate = 0.05; // 5% interest rate
	        }

	        // Calculate simple interest
	        double simpleInterest = (principal * rate * time);

	        // Display the result
	        System.out.println("Simple Interest: " + simpleInterest);
	        System.out.println(" Time (in years): " + time + "year");

	        // Close the scanner
	        scanner.close();
	    }
	}

