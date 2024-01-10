package questions_practice;

import java.util.Scanner;

public class CubeOfNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        double number = scanner.nextDouble();

        double cube = calculateCube(number);

        System.out.println("The cube of " + number + " is: " + cube);

        scanner.close();
    }

    public static double calculateCube(double number) {
        return Math.pow(number, 3);
    }
}

