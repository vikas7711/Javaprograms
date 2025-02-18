package assignments;
// Assignment 35 WAP to check if 2 given Strings are ANAGRAM
import java.util.Arrays;
import java.util.Scanner;

public class Assignment35_Anagram 
{
	public static void main(String[] args) 
	{
		System.out.println("Check Strings are ANAGRAM or Not !");
		System.out.println(" ");
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.print("Enter String One : ");
		 String input1 = sc.next();
		 
		 System.out.print("Enter String Two : ");
		 String input2 = sc.next();
		
//		String input1 = "listen";
//		String input2 = "silent";
		 
		 if(input1.length() != input2.length())
		 {
			 System.out.println("They can never be ANAGRAM since the length of the string is different !");
		 }
		 else
		 {
			 System.out.println("Let's find out now if it's ANAGRAM !");
			 
			 char c1[] = input1.toCharArray();
			 char c2[] = input2.toCharArray();
			 
			 Arrays.sort(c1);
			 Arrays.sort(c2);
			 System.out.println("After Sorting Given String in the Arrays form");
			 System.out.println("String One : "+Arrays.toString(c1));
			 System.out.println("String Two : "+Arrays.toString(c2));
			 
			 if(Arrays.equals(c1, c2) == true)
			 {
				 System.out.println("Input String are ANAGRAM ");
			 }else
			 {
				 System.out.println("Input Strings are Not ANAGRAM ");
			 }
		 }	 
	}
}
