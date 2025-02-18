package assignments;
// Write a program to demonstrate the following functions like append, insert, replace, delete, reverse, capacity, charAt, length, substring(int) & substring (start & end index) using StringBuffer concept
public class Assignment40 
{
	public static void main(String[] args) 
	{
		 System.out.println("String Buffer Methods !");

		 StringBuffer sb = new StringBuffer("Om Jay Jagdeesh");
		 System.out.println("String Buffer Object : "+sb);
		 System.out.println(" ");
		 
		 System.out.println("length() : " +sb.length()); 	 
		 
		 System.out.println("capacity() : " +sb.capacity());		 
		 //System.out.println("substring() : " +sb.substring(2, 7));	 
		 System.out.println("append() : " +sb.append(" Hare"));
		 System.out.println("charAt(16) : " +sb.charAt(16));
		 
		 System.out.println("insert() : " +sb.insert(20, " Ji"));
		  
		System.out.println("replace(): " +sb.replace(20, 23, " Rama"));
		
		System.out.println("delete() : " +sb.delete(7, 15));
		
		StringBuffer sb1 = new StringBuffer("Om Jay Jagdeesh");
		System.out.println("reverse() : " +sb1.reverse());
		
		StringBuffer sb2 = new StringBuffer("Om Jay Jagdeesh");
		System.out.println("substring((2)) : " +sb2.substring(2));
		
		StringBuffer sb3 = new StringBuffer("Om Jay Jagdeesh");
		System.out.println("substring((2, 7)) : " +sb3.substring(2, 7));
		 
	}

}
