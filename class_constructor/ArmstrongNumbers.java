package class_constructor;

	import java.util.Scanner;

	public class ArmstrongNumbers {
	    // Method to calculate the cube of a number
	    public static int cube(int num) {
	        int result = 0;
	        int temp = num;
	        while (temp > 0) {
	            int digit = temp % 10;
	            result += (digit * digit * digit);
	            temp /= 10;
	        }
	        return result;
	    }

	    // Method to print Armstrong numbers in a given range
	    public static void printArmstrongNumber(int start, int end) {
	        System.out.println("Armstrong numbers between " + start + " and " + end + ":");
	        for (int i = start; i <= end; i++) {
	            if (i == cube(i)) {
	                System.out.println(i);
	            }
	        }
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the start of the range: ");
	        int start = scanner.nextInt();
	        System.out.print("Enter the end of the range: ");
	        int end = scanner.nextInt();

	        printArmstrongNumber(start, end);

	        scanner.close();
	    }
	}


