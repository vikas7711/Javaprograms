package assignments;
// Assignment_26 WAP to check if the given strings are Palindrome    

import java.util.Scanner;

public class Assignment26_Palindrome 
{
	String str, revs="";
	public void input()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Any String : ");
		str = sc.nextLine();
	}
	
	public void output()
	{
		 for(int i=str.length()-1; i>=0; i--)
		{
			revs = revs + str.charAt(i);
		}
		System.out.println("Reverse String is :" +revs);
	}
	
	public void checkPalindrome()
	{
		if (str.equalsIgnoreCase(revs))
		{
			System.out.println(str + "  : is a Palindrome.");
        } else
        	
        {
        	System.out.println(str + "  : is Not a Palindrome.");
        }
	}

	public static void main(String[] args) 
	{
		Assignment26_Palindrome palindrome = new Assignment26_Palindrome();
		
		palindrome.input();
		palindrome.output();
		palindrome.checkPalindrome();
		
		/*
		String str, revs="";
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Any String : ");
		str = sc.nextLine();
		
		for(int i=str.length()-1; i>=0; i--)
		{
			revs = revs + str.charAt(i);
		}
		System.out.println("Reverse String is :" +revs);
		
		
		if (str.equalsIgnoreCase(revs))
			{
	            System.out.println(str + "  : is a Palindrome.");
	        } 
		else
	        {
	            System.out.println(str + "  : is Not a Palindrome.");
	        }
	        */


	 
	}
}
	

