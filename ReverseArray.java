package javaPractice;
// Assignment 29 WAP to create an array of size 4 which belongs to int type and copy its values into a new array in reverse order
import java.util.Arrays;

public class ReverseArray 
{
	public static void main(String[] args) 
	{
		 int originalArray[] = new int[4];
		 
		 originalArray[0] = 10;
		 originalArray[1] = 20;
		 originalArray[2] = 30;
		 originalArray[3] = 40;
		 
		 int reverseArray[] = new int[4];
		 for(int i=0,j=3; i<=3; i++, j--)
		 {
			 reverseArray[j] = originalArray[i];
		 }
		 	System.out.println("Original Array : " + Arrays.toString(originalArray));
		 	System.out.println("Reversed Array : " + Arrays.toString(reverseArray));
	}

}
