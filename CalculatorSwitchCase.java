package assignments;
//  Assignment 24 WAP to implement Switch case
import java.util.Scanner;

public class CalculatorSwitchCase 
{
	static double num1, num2;
	static double result;
	static int choice;
	
	static Scanner scn = new Scanner(System.in);
	public void addition()
	{
		result = num1 + num2;
	}
	
	public void subtraction()
	{
		result = num1 - num2;
	}
	
	public void multiplication()
	{
		result = num1 * num2;
	}
	
	public void division()
	{
		result = num1 / num2;
	}
		
	public static void main(String[] args) 
	{
		CalculatorSwitchCase cal = new CalculatorSwitchCase();
        // Display menu
        System.out.println("Welcome to the Calculator!");
        System.out.println("Choose an operation:");
        System.out.println("1. Addition (+)");
        System.out.println("2. Subtraction (-)");
        System.out.println("3. Multiplication (*)");
        System.out.println("4. Division (/)");
        
        // Take input for operation choice
        System.out.print("Enter your choice (1-4): ");
        int choice = scn.nextInt();
        if(choice<=4)
        {
		System.out.print("Enter Your First Number : ");
		num1 = scn.nextDouble();
		System.out.print("Enter Your Second Number : ");
		num2 = scn.nextDouble();
        }
        switch(choice)
        {
        	case 1:
        		cal.addition();
           		System.out.println("Addition of two numbers is : " +result);
           		break;
           		
        	case 2:
        		cal.subtraction();
           		System.out.println("Subtraction of two numbers is : " +result);
           		break;
        	case 3:
        		cal.multiplication();
           		System.out.println("Multiplication of two numbers is : " +result);
           		break;
           		
        	case 4:
        		cal.division();
           		System.out.println("Division of two numbers is : " +result);
           		break;
            default:
                System.out.println("Invalid choice. Please choose a valid operation (1-4)");
                break;
        }
	}
}
