package javaPractice;

import java.util.Scanner;

public class TriangleArea 
{
	public static void main(String[] args) 
	{
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Enter the Base of Triangle : ");
		double base = scn.nextDouble();
		
		System.out.print("Enter the Hight of Triangle : ");
		double hight = scn.nextDouble();
		
		double areaOfTriangle = 0.5 * base * hight;
		
		System.out.println("Area of Triangle is : " +areaOfTriangle);
	}
}
