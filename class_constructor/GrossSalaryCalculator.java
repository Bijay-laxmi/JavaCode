package class_constructor;

import java.util.Scanner;

public class GrossSalaryCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter the basic salary (-1 to exit): ");
            double basicSalary = scanner.nextDouble();

            if (basicSalary == -1) {
                break;
            }

            double HR, DA;
            if (basicSalary > 15000) {
                HR = 0.20 * basicSalary;
                DA = 0.60 * basicSalary;
            } else {
                HR = 3000;
                DA = 0.70 * basicSalary;
            }

            double grossSalary = basicSalary + HR + DA;
            System.out.println("Gross Salary: " + grossSalary);
        }

        scanner.close();
    }
}


