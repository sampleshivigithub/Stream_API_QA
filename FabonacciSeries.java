package questions_practice;

import java.util.Scanner;

public class FabonacciSeries {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of terms in the Fibonacci series:");
		 
		int n = scanner.nextInt();
		System.out.println("Fibonacci Series:");
		
		 for (int i = 0; i < n; i++) {
	            System.out.print(fibonacci(i) + " ");
	        }

	        scanner.close();
	    }
	
	public static int fibonacci(int n) {
        if (n <= 1) {
         return n;
         
            } else {
            	
           return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
	}

