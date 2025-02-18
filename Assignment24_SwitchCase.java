package assignments;
// Assignment 24 WAP to implement Switch case
import java.util.Scanner;
public class Assignment24_SwitchCase 
{
	static double num1, num2;
	public static void main(String[] args) 
	{
		double result;
		int choice;
		System.out.println("Select an option for Calculation !");
        System.out.println("1. Addition (+)");
        System.out.println("2. Subtraction (-)");
        System.out.println("3. Multiplication (*)");
        System.out.println("4. Division (/)");
        
		Scanner scn = new Scanner(System.in);		 // Take input for operation choice
        System.out.print("Enter your choice (1-4): ");
        choice = scn.nextInt();
        if(choice<=4)
        {
		System.out.print("Enter First Digit : ");
		num1 = scn.nextDouble();
		System.out.print("Enter Second Digit : ");
		num2 = scn.nextDouble();
        }
        
        switch(choice)
        {
        	case 1:     		
        			result = num1 + num2;
               		System.out.println("Addition of two digit's result is : " +result);
               		break;
           	case 2:     		
	    			result = num1 - num2;
	           		System.out.println("Subtraction of two digit's result is : " +result);
	           		break;
        	case 3:     		
	    			result = num1 * num2;
	           		System.out.println("Multiplication of two digit's result is : " +result);
	           		break;
        	case 4:     		
	    			result = num1 / num2;
	           		System.out.println("Division of two digit's result is : " +result);
	           		break;
        	 default:
	                 System.out.println("Invalid choice. Please choose a valid operation (1-4)");
	                 break; 
        }
	}
}
