package javaPractice;

import java.util.Scanner;

public class CircumferenceOfRectangle 
{
	public static void main(String[] args)
	{
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Enter the Length of a Rectangle: ");
		double Length = scn.nextDouble();
		
		System.out.print("Enter the Width of a Rectangle: ");
		double Width = scn.nextDouble();
		
		double CircumferenceOfRectangle = 2*(Length + Width);
		
		System.out.println("The Circumference of a Rectangle is: " + CircumferenceOfRectangle);
	}
}
