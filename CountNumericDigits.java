package javaPractice;

import java.util.Scanner;

public class CountNumericDigits 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your String : ");
		String str  = sc.nextLine();
		
		int countDigits = 0;
		
		for(int i=0; i<str.length(); i++)
		{
			if(Character.isDigit(str.charAt(i)))
			{
				countDigits++;
			}
		}			
			System.out.println("Total number of Digits in given String : "+ countDigits);
	}
}
