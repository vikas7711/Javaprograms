package javaPractice;

import java.util.Scanner;

public class UpdateGlobalVariable 
{
	// Global Variable
	static int globalVar;
	
	public static void staticMethod()
	{
		System.out.println("Static Method Global Variable and after their Updated Value");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a value for Global Variable : ");
		int globalVar = sc.nextInt();
		System.out.println("Initial value of Global Variable which you Entered : " + globalVar);
		// Update the Global variable Value
		System.out.println("Increment +5, in which value you have entered : ");
		globalVar +=5;		 
		System.out.println("After +5 Updation, Global Variable value is : " + globalVar);
	}
	
	public static void nonStaticMethod()
	{ 
		System.out.println("Non Static Method Global Variable and after their Updated Values");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a value for Global Variable : ");
		globalVar = sc.nextInt();
		System.out.println("Initial value of Global Variable which you Entered : " + globalVar);
		// Update the local variable Value
		System.out.println("Increment +10, in which value you have entered : ");
		globalVar +=10;		 
		System.out.println("After +10 Updation, Global Variable value is : " + globalVar);
	}

	public static void main(String[] args) 
	{
		staticMethod();
		System.out.println(" ");
		
		UpdateGlobalVariable gb = new UpdateGlobalVariable();
		gb.nonStaticMethod();
		
	}

}
