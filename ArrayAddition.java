package questions_practice;

import java.util.Scanner;

public class ArrayAddition {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		
		// Get the size of the arrays
        System.out.print("Enter the size of the arrays: ");
        int size = scanner.nextInt();

        // Declare arrays
        int[] array1 = new int[size];
        int[] array2 = new int[size];
        int[] sumArray = new int[size];

        // Input elements for the first array
        System.out.println("Enter elements for the first array:");
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array1[i] = scanner.nextInt();
        }

        // Input elements for the second array
        System.out.println("Enter elements for the second array:");
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array2[i] = scanner.nextInt();
        }

        // Add the arrays element-wise
        for (int i = 0; i < size; i++) {
            sumArray[i] = array1[i] + array2[i];
        }

        // Display the result
        System.out.println("Resultant array after addition:");
        for (int i = 0; i < size; i++) {
            System.out.print(sumArray[i] + " ");
        }

        scanner.close();
    }
}
