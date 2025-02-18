package javaPractice;

import java.util.Scanner;

public class CountingChar 
{
	static String str;
	public void input()
	{
		Scanner scn = new Scanner(System.in);
        System.out.print("Enter a string: ");
        str = scn.nextLine();
	}
	public void output()
	{
		str = str.toUpperCase();
		
		int count = 0;

        for (int i = 0; i < str.length(); i++) 
        {
            if (str.charAt(i) == 'A') 
            {
                count++;
            }
        }
        System.out.println("Number of 'A's in the given string: " + count);
	}
	public static void main(String[] args) 
	{
		CountingChar ch = new CountingChar();
		ch.input();
		ch.output();
	}
}
