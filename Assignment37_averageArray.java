package assignments;
// Assignment 37 "WAP to check the array of the given numbers which are present in your array Ex:[2,4,6,8], Average=(2+4+6+8)/4"
import java.util.Arrays;

public class Assignment37_averageArray 
{
	public static void main(String[] args) 
	{
		System.out.println("Finding the Average No. in given Array !");
		
		int[] a = {2,4,6,8,2,2}; 

		 System.out.println("A : "+Arrays.toString(a));
		 
		 int sum = 0;
		 for (int i=0; i<a.length; i++)
		 {
		     sum = sum + a[i];
		 }
		 
		 System.out.println("Sum of Array 	 : "+sum);
		 
		 int avg = 0 ;
		
		 avg = sum/a.length; 
		
		 System.out.println("Average of Array : "+avg);
		 
		 
		for(int i=0; i<a.length; i++)
		{
		 if(avg == a[i])
			{
				System.out.println("The Average Digit " + avg + " is Present in Given Array !");				 
			}
		}
		if(avg != a.length)
			{
				System.out.println("The Average Digit "+ avg + " is NOT Present in Given Array !");
			}
		 }
}
