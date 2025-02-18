package assignments;
//  Assignment_23 WAP to implement this() calling statement
public class Assignment23ThisStatement 
{ 
		private String accountHolderName;
		private long accountNumber;
		private double balance;
		
		Assignment23ThisStatement()											 // Constructor 1: Default constructor
		{
	        this("Unknown", 0, 0.0); 							// Calls Constructor 2
	        System.out.println("Default constructor called.");
		}
		
	    public Assignment23ThisStatement(String accountHolderName, long accountNumber, double balance) 	// Constructor 2: Parameterized constructor
	    {
	        this.accountHolderName 	= accountHolderName;
	        this.accountNumber 		= accountNumber;
	        this.balance 			= balance;
	        System.out.println("Parameterized constructor called.");
	    }
	    	    
	    public Assignment23ThisStatement(String accountHolderName, long accountNumber) 			// Constructor 3: Partial parameterized constructor
	    {
	        this(accountHolderName, accountNumber, 0.0);						 // Calls Constructor 2
	        System.out.println("Partial parameterized constructor called.");
	    }
	    	    
	    public void displayAccountDetails() 									// Method to display account details
	    {
	        System.out.println("Account Holder Name: " + accountHolderName);
	        System.out.println("Account Number: " + accountNumber);
	        System.out.println("Balance: " + balance);
	    }
	    
	public static void main(String[] args) 
	{
		System.out.println("this() calling statement");
	    Assignment23ThisStatement account1 = new Assignment23ThisStatement();	 // Using default constructor
        account1.displayAccountDetails();

        Assignment23ThisStatement account2 = new Assignment23ThisStatement("Alice", 1234567890L, 5000.0);	// Using parameterized constructor
        account2.displayAccountDetails();
        
        Assignment23ThisStatement account3 = new Assignment23ThisStatement("Bob", 9876543210L);			// Using partial parameterized constructor
        account3.displayAccountDetails();
	}
}
