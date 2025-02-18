package assignments;
import java.util.Arrays;
import java.util.Scanner;
// Assignment 31-34 WAP to count the number of numeric values, Spaces, Alphabets and Special characters present in the String			
public class Assignment31_CountNumericDigits 
{
	public static void main(String[] args) 
	{
		 int countNumeric=0;
		 int countSpace = 0;
		 int countAlphabet = 0;
		 int countSpecialChar = 0;
		 
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter Your String : ");
		 System.out.println("-------------------------------------------------------------------------------------------------");
		// String str = "1236 vikas ! @ # $ % ^ & Anand";
		 String str = sc.nextLine();
		 char[] chr = str.toCharArray();
		 System.out.println(Arrays.toString(chr));
//		 boolean b1 = Character.isDigit(chr[6]);
//		 System.out.println(b1);
		 
		 for(int i=0; i<chr.length; i++)
		 {
			 boolean b1 = Character.isDigit(chr[i]);
			 boolean b2 = Character.isWhitespace(chr[i]);
			 boolean b3 = Character.isAlphabetic(chr[i]);
			  
			 if(b1 == true)
			 {
				 countNumeric++;
			 }
			
			 if(b2 == true)
			 {
				 countSpace++;
			 }
			 
			 if(b3 == true)
			 {
				 countAlphabet++;
			 }
		 }
		 	System.out.println("-----------------------------------------------------------------------------------------------");
		 	System.out.println("Count of Numeric Value : "+countNumeric);
		 	System.out.println("Count of Space Value   : "+countSpace);
		 	System.out.println("Count of Alphabate Value: "+countAlphabet);
		 	
		 	countSpecialChar = str.length()-(countNumeric + countSpace + countAlphabet);
		 	System.out.println("Count of Special Characters : " + countSpecialChar);
	}
}
