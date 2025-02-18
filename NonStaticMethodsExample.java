package javaPractice;

// How to call non static methods in main method
public class NonStaticMethodsExample 
{
	// Non-static method to print a message 
	public void printMessage() 
	{ 
		System.out.println("Hello, this is a non-static method."); 
	}
	
	// Non-static method to add two numbers 
	public int add(int a, int b) 
	{ 
		return a + b; 
	} 
	
	// Non-static method to find the minimum of two numbers 
	public int findMin(int a, int b) 
	{ 
		return(Math.min(a, b));	 
	}

	public static void main(String[] args) 
	{
		// Create an instance of the class 
		NonStaticMethodsExample example = new NonStaticMethodsExample(); 
		
		// Calling non-static methods using the instance 
		example.printMessage(); 
		
		int sum = example.add(10, 20); 
		System.out.println("The sum of 10 and 20 is: " + sum); 
		int min = example.findMin(10, 20); 
		System.out.println("The maximum of 10 and 20 is: " + min);
	}
}
