package assignments;
//WAP to implement super calling statement (parameterized and non parameterized) 

class Computer 					//Superclass
{
 String brand;

 Computer() 					// Non-parameterized constructor
 {
     System.out.println("Computer: Default constructor called !");
     brand = "Generic Computer";
 }

 Computer(String brand)			 // Parameterized constructor
 {
     System.out.println("Computer: Parameterized constructor called !");
     this.brand = brand;
 }

 void displayBrand() 
 {
     System.out.println("Computer Brand: " + brand);
 }
}

class Laptop extends Computer 		//Subclass
{
 String model;

  Laptop()							// Non-parameterized constructor
  {
     super(); 						// Calls the non-parameterized constructor of Computer
     System.out.println("Laptop: Default constructor called	!");
     model = "Basic Laptop";
 }

  Laptop(String model) 				// Parameterized constructor
  {
     super("Lenovo"); 					// Calls the parameterized constructor of Computer with "HP" as the brand
     System.out.println("Laptop: Parameterized constructor called !");
     this.model = model;
 }

 void displayDetails() 
 {
     super.displayBrand(); 			// Calls method from the superclass
     System.out.println("Laptop Model: " + model);
 }
}

public class Assmnt22_SuperCallingExample 
{
	static
	{
		System.out.println("super() calling statement");
		System.out.println(" ");
	}
	public static void main(String[] args) 
	{
        System.out.println("Using Non-Parameterized Constructors:");
        Laptop laptop1 = new Laptop(); 											// Calls non-parameterized constructors
        laptop1.displayDetails();
        
        System.out.println("\nUsing Parameterized Constructors:");
        Laptop laptop2 = new Laptop("ThinkBook 16 G6 IRL"); 					// Calls parameterized constructors
        laptop2.displayDetails();
	}
}
