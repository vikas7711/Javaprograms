package javaPractice;

import java.util.Scanner;

public class CircumferenceOfCircle 
{
	public static void main(String[] args) 
	{
		
		double pi = Math.PI;
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter the Radius of a Circle: "); 
		double radius = scn.nextDouble();
		
		double CircumferenceOfCircle = 2*pi*radius;
		System.out.print("The Circumference of a Circle is: " + CircumferenceOfCircle);
	}

}
