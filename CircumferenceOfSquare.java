package javaPractice;

import java.util.Scanner;

public class CircumferenceOfSquare 
{
	public static void main(String[] args) 
	{
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter the side length of Square : ");
		double sideLength = scn.nextDouble();
		double CircumferenceOfSquare = 4 * sideLength;
		System.out.print("The Circumference Of the Square is : " +CircumferenceOfSquare);
	}

}
