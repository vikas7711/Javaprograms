package assignments;

public class Assignment41 
{
	public static void main(String[] args) 
	{
		 System.out.println("String Buider Methods !");
		 System.out.println(" ");
	 	 StringBuilder sb = new StringBuilder("Hello World");
		 System.out.println("String Builder Object : "+sb);
		 System.out.println(" ");
	 	
       sb.append(" How are You !");									// Append method
       System.out.println("After append() : " + sb.toString());
   
       sb.insert(6, "Beautiful ");										// Insert method
       System.out.println("After insert() : " + sb.toString());

       sb.replace(6, 16, "Wonderful ");								// Replace method
       System.out.println("After replace() : " + sb.toString());
       
       StringBuilder sb1 = new StringBuilder("Hello World");
       													
       System.out.println("After reverse()	: " + sb1.reverse());		// Reverse method
       	        												
       System.out.println("After delete() : " + sb.delete(6, 16));		// Delete method
       
       System.out.println("Current capacity() : " + sb.capacity());  	// Capacity method
								
       System.out.println("Character at index 5: " + sb.charAt(6));	// CharAt method
							
       System.out.println("Length of the StringBuilder: " + sb.length());	// Length method
       	        
       StringBuilder sb2 = new StringBuilder("Hello World");			
       String sub1 = sb2.substring(5);									// Substring method with start index only
       System.out.println("Substring from index 5: " + sub1);
       
       StringBuilder sb3 = new StringBuilder("Hello World");	
       String sub2 = sb3.substring(5, 11);								// Substring method with start and end index
       System.out.println("Substring from index 5 to 11: " + sub2);

	}

}
