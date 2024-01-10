package questions_practice;

import java.util.Scanner;

public class AverageOfGivenNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        double[] numbers = new double[n];

        System.out.println("Enter " + n + " numbers:");

        for (int i = 0; i < n; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextDouble();
        }

        double average = calculateAverage(numbers);

        System.out.println("The average of the given numbers is: " + average);

        scanner.close();
    }

    public static double calculateAverage(double[] numbers) {
        double sum = 0;

        for (double num : numbers) {
            sum += num;
        }

        return sum / numbers.length;
    }
}

