package javaPractice;

import java.util.Scanner;

public class ScannerMethods 
{
	public static void main(String[] args) 
	{
		 	Scanner scanner = new Scanner(System.in);
		 
		 	System.out.print("Enter an integer: ");
	        int intValue = scanner.nextInt();

	        System.out.print("Enter a floating-point value: ");
	        float floatValue = scanner.nextFloat();

	        System.out.print("Enter a double value: ");
	        double doubleValue = scanner.nextDouble();

	        System.out.print("Enter a boolean value (true/false): ");
	        boolean booleanValue = scanner.nextBoolean();

	        System.out.print("Enter a single word: ");
	        String singleWord = scanner.next();
	        
	        scanner.nextLine();
	        
	        System.out.print("Enter Complete Sentence: ");
	        String sentence = scanner.nextLine();
	        
	        System.out.println("          ");
	        
	        System.out.println("You have Entered the following:");
	        System.out.println("Integer: " + intValue);
	        System.out.println("Floating-point number: " + floatValue);
	        System.out.println("Double value: " + doubleValue);
	        System.out.println("Boolean value: " + booleanValue);
	        System.out.println("Single word: " + singleWord);
	        System.out.println("Complete Sentence: " + sentence);
	        
	        scanner.close();
	}
}
