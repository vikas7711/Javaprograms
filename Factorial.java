package javaPractice;

import java.util.Scanner;

public class Factorial 
{

	public static void main(String[] args) 
	{
		Scanner scnr = new Scanner(System.in);
		
        System.out.print("Enter a number: ");
        int num = scnr.nextInt();
        
        int fact = 1;
        for (int i = 1; i <= num; i++) 
        {
        	 fact=fact*i; 
        }
        
        System.out.println("Factorial of " + num + " is: " + fact);
	}
}
