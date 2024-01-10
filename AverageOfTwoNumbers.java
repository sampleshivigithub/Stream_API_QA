package questions_practice;

import java.util.Scanner;

public class AverageOfTwoNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        double average = calculateAverage(num1, num2);

        System.out.println("The average of " + num1 + " and " + num2 + " is: " + average);

        scanner.close();
    }

    public static double calculateAverage(double num1, double num2) {
        return (num1 + num2) / 2;
    }
}
