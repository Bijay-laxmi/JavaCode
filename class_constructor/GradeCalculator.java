package class_constructor;

	import java.util.Scanner;

	public class GradeCalculator {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Initialize variables
	        int totalMarks = 0;
	        double averageMarks;

	        // Input marks for five subjects
	        for (int i = 1; i <= 5; i++) {
	            System.out.print("Enter marks for subject " + i + " (out of 100): ");
	            int marks = scanner.nextInt();

	            // Check if marks are within the valid range
	            if (marks < 0 || marks > 100) {
	                System.out.println("Invalid marks entered. Marks should be between 0 and 100.");
	                return;
	            }

	            totalMarks += marks;
	        }

	        // Calculate average marks
	        averageMarks = (double) totalMarks / 5;

	        // Determine the grade based on average marks
	        String grade;
	        if (averageMarks > 90) {
	            grade = "O";
	        } else if (averageMarks > 80) {
	            grade = "A";
	        } else if (averageMarks > 60) {
	            grade = "B";
	        } else if (averageMarks >= 40) {
	            grade = "C";
	        } else {
	            grade = "F";
	        }

	        // Display the results
	        System.out.println("Total Marks: " + totalMarks);
	        System.out.println("Average Marks: " + averageMarks);
	        System.out.println("Grade: " + grade);

	        // Close the scanner
	        scanner.close();
	    }
	}


