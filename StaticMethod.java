package javaPractice;

// Calling Static Methods in main()
public class StaticMethod 
{
	// Static method to print a message 
	public static void printMessage() 
	{ 
		System.out.println("Hello, this is a static method."); 
	}
	
	// Static method to add two numbers 
	public static int add(int a, int b) 
	{ 
		return a + b; 
	}
	
	// Static method to find the maximum of two numbers 
	public static int findMax(int a, int b) 
	{ 
		return(Math.max(a, b));			 
	}
	
	public static void main(String[] args) 
	{
		printMessage(); 
		int sum = add(10, 20); 
		System.out.println("The sum of 10 and 20 is: " + sum); 
		int max = findMax(10, 20); 
		System.out.println("The maximum of 10 and 20 is: " + max);
	}
}
