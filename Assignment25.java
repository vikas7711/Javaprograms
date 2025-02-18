package assignments;

import java.util.Scanner;
// Assignment_25 WAP to reverse a string
public class Assignment25 
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
		Assignment25 rs = new Assignment25();
		rs.input();
		rs.output();
		 
	}
}
