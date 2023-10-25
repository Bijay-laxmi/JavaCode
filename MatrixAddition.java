package Array;

	import java.util.Scanner;

	public class MatrixAddition {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Input matrix dimensions
	        System.out.print("Enter the number of rows: ");
	        int rows = scanner.nextInt();
	        System.out.print("Enter the number of columns: ");
	        int columns = scanner.nextInt();

	        // Create two matrices
	        Integer[][] matrix1 = new Integer[rows][columns];
	        Integer[][] matrix2 = new Integer[rows][columns];

	        // Input elements for matrix1
	        System.out.println("Enter elements for Matrix 1:");
	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < columns; j++) {
	                matrix1[i][j] = scanner.nextInt();
	            }
	        }

	        // Input elements for matrix2
	        System.out.println("Enter elements for Matrix 2:");
	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < columns; j++) {
	                matrix2[i][j] = scanner.nextInt();
	            }
	        }

	        // Perform matrix addition
	        Integer[][] resultMatrix = new Integer[rows][columns];
	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < columns; j++) {
	                resultMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
	            }
	        }

	        // Display the result matrix
	        System.out.println("Resultant Matrix:");
	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < columns; j++) {
	                System.out.print(resultMatrix[i][j] + " ");
	            }
	            System.out.println();
	        }

	        scanner.close();
	    }
	}


