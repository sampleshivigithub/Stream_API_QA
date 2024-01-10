package questions_practice;
import java.util.Scanner;


	public class AnyDigitWord {

	    // Arrays to store word representations of numbers
	    private static final String[] units = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
	    private static final String[] teens = {"", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
	    private static final String[] tens = {"", "Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
	    
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter a number: ");
	        int number = scanner.nextInt();

	        if (number < 0 || number > 999) {
	            System.out.println("Number out of range. Please enter a number between 0 and 999.");
	        } else {
	            String result = convertToWords(number);
	            System.out.println("Word representation: " + result);
	        }

	        scanner.close();
	    }

	    public static String convertToWords(int number) {
	        if (number == 0) {
	            return "Zero";
	        }

	        return convertToWordsHelper(number);
	    }

	    private static String convertToWordsHelper(int number) {
	        String result = "";

	        // Handle hundreds place
	        if (number >= 100) {
	            result += units[number / 100] + " Hundred ";
	            number %= 100;
	        }

	        // Handle tens and ones place
	        if (number >= 20) {
	            result += tens[number / 10] + " ";
	            number %= 10;
	        } else if (number >= 11) {
	            result += teens[number - 10] + " ";
	            number = 0; // No ones place
	        }

	        // Handle ones place
	        if (number > 0) {
	            result += units[number];
	        }

	        return result.trim();
	    }
	}

