package javaPractice;

//Create a class with 2 static and 2 non-static methods. Try calling them in main method
public class Assmnt12 
{
	public static void staticMethodOne()
	{
		System.out.println("This is Static Method One !");
	}
	
	public static void staticMethodTwo()
	{
		System.out.println("This is Static Method Two !");
	}
	
	public void nonStaticMethodOne()
	{
		System.out.println("This is Non Static Method One !");
	}
	
	public void nonStaticMethodTwo()
	{
		System.out.println("This is Non Static Method Two !");
	}

	public static void main(String[] args) 
	{
		// Calling Static Methods
		Assmnt12.staticMethodOne();
		Assmnt12.staticMethodTwo();
		System.out.println("____________________________");
		
		// Calling Non Static Methods
		Assmnt12 as = new Assmnt12();
		as.nonStaticMethodOne();
		as.nonStaticMethodTwo();
	}
}
