package javaPractice;

import java.util.Scanner;

public class AreaOfRectangle 
{
	public static void main(String[] args)
	{
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Enter the Length of a Rectangle: ");
		double Length = scn.nextDouble();
		
		System.out.print("Enter the Width of a Rectangle: ");
		double Width = scn.nextDouble();
		
		double AreaOfRectangle = Length * Width;
		System.out.println("The Area of a Rectangle is: " + AreaOfRectangle);
	}
}
