package javaPractice;

import java.util.Scanner;

public class TriangleOfCircumference 
{
	public static void main(String[] args)
	{
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Enter the Length of Side A : ");
		double side_a = scn.nextDouble();
		
		System.out.print("Enter the Length of Side B : ");
		double side_b = scn.nextDouble();
		
		System.out.print("Enter the Length of Side C : ");
		double side_c = scn.nextDouble();
		
		double TriangleOfCircumference = side_a + side_b + side_c;
		
		System.out.print("The circumference of the triangle is: " + TriangleOfCircumference);
	}

}
