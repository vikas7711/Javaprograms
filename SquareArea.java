package javaPractice;

import java.util.Scanner;

public class SquareArea 
{
	public static void main(String[] args) 
	{
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter the side length of Square : ");
		double sideLength = scn.nextDouble();
		double squareArea = sideLength * sideLength;
		System.out.print("The Area of the Square is : " +squareArea);
	}

}
