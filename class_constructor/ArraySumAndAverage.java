package class_constructor;

	import java.util.Scanner;

	public class ArraySumAndAverage {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Input: Array size
	        System.out.print("Enter the size of the array: ");
	        int size = scanner.nextInt();

	        // Create an array of the given size
	        int[] numbers = new int[size];

	        // Input: Array elements
	        System.out.println("Enter the elements of the array:");
	        for (int i = 0; i < size; i++) {
	            numbers[i] = scanner.nextInt();
	        }

	        // Calculate sum
	        int sum = 0;
	        for (int num : numbers) {
	            sum += num;
	        }

	        // Calculate average
	        double average = (double) sum / size;

	        // Output sum and average
	        System.out.println("Sum: " + sum);
	        System.out.println("Average: " + average);

	        scanner.close();
	    }
	}
