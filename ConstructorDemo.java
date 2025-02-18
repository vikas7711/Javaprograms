package javaPractice;

// How to call Constructors in main method
public class ConstructorDemo 
{
	// Constructor
	ConstructorDemo()		// default and non parameterized constructor  
	{
		System.out.println("Constructor called");
	}
	
	ConstructorDemo(int a)		// parameterized constructor  
	{
		System.out.println("Parameterized Constructor called");
	}
	
	public static void main(String[] args) 
	{
		System.out.println("Main Method");
		// Constructor called automatically when class object is created.
		ConstructorDemo cd = new ConstructorDemo();
		new ConstructorDemo(1);
	}
}
