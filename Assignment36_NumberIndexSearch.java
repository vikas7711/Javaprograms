package assignments;

// Assignment 36 WAP to check if 24 is a part of your array if yes print its indexing

import java.util.Arrays;
public class Assignment36_NumberIndexSearch 
{
	public static void main(String[] args) 
	{
		int a[] = new int [4];
		a[0] = 10;
		a[1] = 20;
		a[2] = 25;
		a[3] = 24;
		
		System.out.println("A : "+Arrays.toString(a));
		System.out.println(" ");
		
		int numToSearch = 24;
		
		for(int i=0; i<=a.length-1; i++)
		{
			if(numToSearch == a[i])
			{
				System.out.println("Number " + numToSearch + " is present at index : " + i);
			}
		}
	}
}
