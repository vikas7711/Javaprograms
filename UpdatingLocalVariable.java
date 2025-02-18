package javaPractice;

import java.util.Scanner;

public class UpdatingLocalVariable 
{
	public static void staticMethod()
	{
		// Local Variable for Static Method
		int localVar;
		System.out.println("Static Method Variable and after their Updated Values");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a value for local variable : ");
		localVar = sc.nextInt();
		System.out.println("Initial value of localVar which you Entered : " + localVar);
		// Update the local variable Value
		System.out.println("Increment +5, in which value you have entered : ");
		localVar +=5;		 
		System.out.println("After +5 Updation, localVar value is : " + localVar);
	}
	
	public static void nonStaticMethod()
	{
		// Local Variable for Non Static Method
		int localVar;
		System.out.println("Non Static Method Variable and after their Updated Values");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a value for local variable : ");
		localVar = sc.nextInt();
		System.out.println("Initial value of localVar which you Entered : " + localVar);
		// Update the local variable Value
		System.out.println("Increment +10, in which value you have entered : ");
		localVar +=10;		 
		System.out.println("After +10 Updation, localVar value is : " + localVar);
	}
	

	public static void main(String[] args) 
	{
		staticMethod();
		System.out.println(" ");
		
		UpdatingLocalVariable var = new UpdatingLocalVariable();
		var.nonStaticMethod();
	}

}
