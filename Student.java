package javaPractice;

// Method Overloading Example 
public class Student 
{
	static void studentInfo()							// Default or Non Parameterized Method
	{
		System.out.println("Student Information !");
	}
	
	   public void studentInfo(String name, int age) 			//  Parameterized Method
	   {
	        System.out.println("Name: " + name);
	        System.out.println("Age: " + age);
	    }
	   
	   public void studentInfo(int standerd, char section, String school) 
	   {
	        System.out.println("class: " + standerd);
	        System.out.println("Section: " + section);
	        System.out.println("School: " + school);
	    }
	   
	public static void main(String[] args) 
	{
		studentInfo();
		
		Student std = new Student();
		std.studentInfo("David", 12);
		std.studentInfo(8, 'A', "DPS");
	}
}
