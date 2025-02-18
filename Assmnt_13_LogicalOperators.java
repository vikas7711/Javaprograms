package javaPractice;

import java.util.Scanner;

public class Assmnt_13_LogicalOperators 
{
	static {
		System.out.println("Check blow conditios by following Logical Operators");
		System.out.println(
				"Condition 1 : (a>b && c>a)" +"\n"
				+ "Condition 2 :(a>b || c<a)" +"\n"
				+ "Condition 3 :(!(a>b && c<a))");
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the value of A : ");
		int a = sc.nextInt();
		
		System.out.print("Enter the value of B : ");
		int b = sc.nextInt();
		
		System.out.print("Enter the value of C : ");
		int c = sc.nextInt();
		
		// using && Operator
		if(a>b && c>a)
		{
			System.out.println("Both conditions are true : (a>b && c>a)");
		}
		
		// Using '||' operator
		if(a>b || c<a)
		{
			System.out.println("At least one condition true : (a>b || c<a)");
		}
		
		// Using '!' operator
		if(!(a>b && c<a))
		{
			System.out.println("The condition Not True : (!(a>b && c<a))");
		}
	}
}
