package javaPractice;

import java.util.Random;

public class CircleCalculations 
{
	CircleCalculations()
	{
		System.out.println("Achieve 5 random results for both Area & Circumference of Circle");
		System.out.println("------------------------------------------------------");
	}
	public static void main(String[] args) 
	{
		new CircleCalculations();
		
		Random random = new Random(); 				// To generate random numbers
		final double PI = Math.PI;   				// Value of PI
		int numOfCircles = 5;
		
		System.out.println("Result \tRadius\t\tArea\t\tCircumference");
        System.out.println("------------------------------------------------------");

		for (int i = 0; i < numOfCircles; i++) 
		{
			double radius = 1 + random.nextDouble() * 5; // Generating random radius between 1 and 5
			double area = PI * radius * radius;
			double circumference = 2 * PI * radius;
			
			System.out.print((i + 1) + ":");
 
			System.out.printf("\t%.2f\t\t%.2f\t\t%.2f\n", radius, area, circumference);
		}
	}
}
