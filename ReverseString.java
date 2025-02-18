package javaPractice;

import java.util.Scanner;

public class ReverseString 
{
	String str, revs=" ";
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

	public static void main(String[] args) 
	{
		ReverseString rs = new ReverseString();
		rs.input();
		rs.output();
		
		
	}

}
