package questions_practice;

import java.util.Scanner;

public class ArmstrongNumberChecker {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a number:");
		int number = scanner.nextInt();
		
		if(isArmstrongNumber(number)) {
			System.out.println(number + " is an Armstrong number.");
			
		}else {
			System.out.println(number + "not an Armstrong number.");
		}
		scanner.close();
	}
	 public static boolean isArmstrongNumber(int number) {
	        int originalNumber = number;
	        int n = String.valueOf(number).length();
	        int sum = 0;
	        
	        while (number > 0) {
	            int digit = number % 10;
	            sum += Math.pow(digit, n);
	            number /= 10;
	        }

	        return sum == originalNumber;
	    }
	

}
