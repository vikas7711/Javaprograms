package assignments;
import java.util.Arrays;
import java.util.Scanner;

// Assignment 30 WAP to accept the values of 2 arrays at run-time and compare if both are equal
public class Assignment30_Compare2Arrays 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		 
		 System.out.println("Array A :");
		 System.out.print("Take Array Size : ");
		 int array_A [] = new int[sc.nextInt()];
		 System.out.println(" ");
		 
		 for(int i=0; i<=array_A.length-1; i++)
		 {
			 System.out.print("Enter the Value of Array A at  index -> " +i + " : ");
			 array_A[i] = sc.nextInt();
		 }
		 System.out.println(" ");
		 System.out.println("Array A  : "+Arrays.toString(array_A));  
		 System.out.println(" ");
		 System.out.println("Array B :");
		 System.out.print("Take Array Size : ");
		 int array_B [] = new int[sc.nextInt()];
		 System.out.println(" ");
		 for(int i=0; i<=array_B.length-1; i++)
		 {
			 System.out.print("Enter the Value of Array B at index -> " +i + " : ");
			 array_B[i] = sc.nextInt();
		 }
		 System.out.println(" ");
		 System.out.println("Array B  : "+Arrays.toString(array_B));  
		 System.out.println(" ");
		 System.out.println("Compared both A & B arrays !");	// Comparing both A & B arrays
		 System.out.println(" ");
		 boolean answer = Arrays.equals(array_A, array_B);
		 if(answer == true)
		 {
			 System.out.println("Both Arrays are EQUAL");
		 }else
			 {
				 System.out.println("Both Arrays are NOT EQUALS");
			 }
		 }
}
