package assignments;
//WAP to create relation between multiple classes containing both static and non-static methods. Multi Level Inheritance

 class Bank 									//Base class representing a general bank
 	{
	 static void displayBankInfo() 			// Static method
		 {
		     System.out.println("This is a general bank. All banks serve to customers.");
		 }
 
	 void bankServices() 						// Non-static method
		 {
		     System.out.println("Bank provides basic services like deposit, withdrawal, and loans.");
		 }
 	}

 class SBI extends Bank 						//Subclass representing SBI
	{
	 static void displaySBIInfo() 				 // Static method
		 {
		     System.out.println("State Bank of India (SBI) is the largest bank in India.");
		 }
		
	  void sbiSpecialServices() 				// Non-static method
		 {
		     System.out.println("SBI provides YONO services and exclusive interest rates for loans.");
		 }
	}

 class CanaraBank extends SBI 				//Subclass representing Canara Bank
	{
	  static void displayCanaraInfo() 			// Static method
		  {
		     System.out.println("Canara Bank is one of the oldest banks in India.");
		 }
	
	  void canaraSpecialServices() 			// Non-static method
		 {
		     System.out.println("Canara Bank offers special deposit schemes and digital banking.");
		 }
	}

 public class Assignment21 
 {
	Assignment21()
	{
		System.out.println("Multilevel Inheritance Demo ");
	}
	public static void main(String[] args) 
	{
		new Assignment21();
        // Accessing Static Methods
		Bank.displayBankInfo();
        SBI.displaySBIInfo();
        CanaraBank.displayCanaraInfo();
        
        System.out.println();
        
        // Accessing Non Static Methods
        CanaraBank cb = new CanaraBank();
        cb.bankServices(); 					// Inherited from Bank class
        cb.sbiSpecialServices(); 			// Inherited from SBI class
        cb.canaraSpecialServices(); 		// Inherited from CanaraBank class
	}
}
