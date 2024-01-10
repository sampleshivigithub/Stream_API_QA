package questions_practice;

import java.util.Scanner;

public class RectangleAreaCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of the rectangle: ");
        double length = scanner.nextDouble();

        System.out.print("Enter the width of the rectangle: ");
        double width = scanner.nextDouble();

        double area = calculateRectangleArea(length, width);

        System.out.println("The area of the rectangle with length " + length + " and width " + width + " is: " + area);

        scanner.close();
    }

    public static double calculateRectangleArea(double length, double width) {
        // Area of a rectangle formula: A = length * width
        return length * width;
    }
}

