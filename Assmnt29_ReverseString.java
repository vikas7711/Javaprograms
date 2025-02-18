package assignments;

//Assignment 29 WAP to create an array of size 4 which belongs to int type and copy its values into a new array in reverse order
import java.util.Arrays;
import java.util.Scanner;

public class Assmnt29_ReverseString 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		 
		 System.out.print("Enter Your Array Size : ");
		 int originalArray[] = new int[sc.nextInt()];
		 System.out.println(" ");
		 
		 for(int i=0; i<=originalArray.length-1; i++)
		 {
			 System.out.print("Enter the Value of Array at index -> " +i + " : ");
			 originalArray[i] = sc.nextInt();
		 }
		 System.out.println(" ");
		 
		 System.out.println("Original Array : "+Arrays.toString(originalArray)); 
		 
		 
		// Copying values to a new array in reverse order
		 
		 int reverseArray[] = new int[originalArray.length];
		 for (int j=0; j<originalArray.length; j++)
		 {
			  reverseArray[j] = originalArray[originalArray.length - 1 - j];
		 }
		 System.out.println("Reversed Array : " +Arrays.toString(reverseArray));

	}

}
