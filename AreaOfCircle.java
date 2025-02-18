package javaPractice;

import java.util.Scanner;

public class AreaOfCircle 
{
	public static void main(String[] args) 
	{		
		double pi = Math.PI;
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter the Radius of a Circle: "); 
		double radius = scn.nextDouble();
		
		double AreaOfCircle = pi*radius*radius;
		System.out.print("The area of a circle is: " + AreaOfCircle);
	}
}