package javaPractice;

public class Bike 
{
	String  brand; 
	String color;
	int engineCapacity;  
	int year;
	
	Bike() 														// Default constructor 
	{ 
		brand = "Unknown"; 
		color = "Unknown";
		engineCapacity = 0; 
		year = 0; 
		System.out.println("Bike Information"); 
	}
	
	Bike(String modelname) 										//Constructor with one parameter
	{ 
		brand = modelname; 
		color = "Unknown";
		engineCapacity = 0;  
		year = 0; 
	}
	
	Bike(String modelname, String colorinput) 				//Constructor with Two parameter	
	{ 
		brand = modelname; 
		color = colorinput;
		engineCapacity = 0;  
		year = 0; 
	}
	
	Bike(String modelname, String colorinput, int cc, int madein) 	//Constructor with four parameter
	{ 
		brand = modelname; 
		color = colorinput;
		engineCapacity = cc;  
		year = madein; 
	}
	
	void displayBikeInfo()
	{
		System.out.println("Brand : "+brand + ", Color : "+color + ",EngineCapacity : "+engineCapacity +"cc" + ", Year : " + year);
	}
	
	public static void main(String[] args) 
	{
		System.out.println("Counstructor Overloading Example");
		
		Bike b1 = new Bike();
		Bike b2 = new Bike("Hero");
		Bike b3 = new Bike("Suzuki", "Yellow & Black");
		Bike b4 = new Bike("Bajaj Pulser", "Black", 220, 2020);
		
		b1.displayBikeInfo();
		b2.displayBikeInfo();
		b3.displayBikeInfo();
		b4.displayBikeInfo();
	}

}
