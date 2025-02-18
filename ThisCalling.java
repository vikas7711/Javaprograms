package javaPractice;

class Demo
{
	Demo()
	{
		this(1);
		System.out.println("Constructor called with No Agrument");
	}
	
	Demo(int a)
	{
		this(1.2);
		System.out.println("Constructor called with int Agrument");
	}
	
	Demo(double d)
	{
		System.out.println("Constructor called with double Agrument");
	}
}
public class ThisCalling 
{
	public static void main(String[] args) 
	{
		Demo demo = new Demo();
	}
}
