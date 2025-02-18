package assignments;

// Assignment 28 WAP to create an array of size 4 which belongs to int type and copy its values into a new array
import java.util.Arrays;
import java.util.Scanner;

public class Assmnt28_CopiedArray 
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
		 System.out.println("OriginalArray A : "+Arrays.toString(originalArray)); 
		 
		 int copiedArray[] = new int[originalArray.length];
		 for(int j=0; j<=copiedArray.length-1; j++)
		 {
			 copiedArray[j] = originalArray[j];
		 }
		 
		 System.out.println("CopiedArray   B : " + Arrays.toString(copiedArray));
	}
}
