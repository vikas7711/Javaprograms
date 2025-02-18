package assignments;

// Assignment_27 WAP to create an array of size 4 which belongs to int type and accept its input at run-time
import java.util.Arrays;
import java.util.Scanner;

public class Assignment27_DynamicArray 
{
	public static void main(String[] args) 
	{
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.print("Enter Your Array Size : ");
		 int arryA[] = new int[sc.nextInt()];
		 System.out.println(" ");
		 
		 for(int i=0; i<=arryA.length-1; i++)
		 {
			 System.out.print("Enter the Value of Array at index -> " +i + " : ");
			 arryA[i] = sc.nextInt();
		 }
		 System.out.println(" ");
		 System.out.print("arryA : "+Arrays.toString(arryA)); 
	}
}
