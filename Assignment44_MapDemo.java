package assignments;
// Assignment 44 Write a program to demonstrate the Map interface 
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
public class Assignment44_MapDemo 
{
	public static void main(String[] args) 
	{
		System.out.println("Map to store the Names and Bodyweights");
		Map<String, Double> myMap= new HashMap<String, Double>();
		 myMap.put("Jay", 55.0);
		 myMap.put("Kishan", 62.50);
		 myMap.put("Shyam", 80.20);
		  		 
		 System.out.println("Name	\tWeight");
		 System.out.println("----------------------------");
		 for(Entry<String, Double>ele : myMap.entrySet())
		 {
			 System.out.println(ele.getKey() +"	\t" + ele.getValue());
		 }
		 	 System.out.println("");
		 	 System.out.println("Map to store the BankName and AccountID");
		 	 Map<String, String> myMap2= new HashMap<String, String>();
				 myMap2.put("HDFC", "04910HD");
				 myMap2.put("SBI", "07582SGO");
				 myMap2.put("BOB", "01243NOI");
			  
			 System.out.println("BankName  \t AccountID");
			 System.out.println("----------------------------");
			 for(Entry<String, String>ele : myMap2.entrySet())
			 {
				 System.out.println(ele.getKey() +"	\t" + ele.getValue());
			 }
			 
		 	 System.out.println("");
		 	 System.out.println("Map to store Household Items and their Quantities");
		 	 Map<String, Integer> myMap3= new HashMap<String, Integer>();
			 	myMap3.put("Soap", 10);
			 	myMap3.put("Shampoo", 5);
			 	myMap3.put("HairOil", 7);
			  
			 System.out.println("Household Items\tQuantities");
			 System.out.println("----------------------------");
			 for(Entry<String, Integer>ele : myMap3.entrySet())
			 {
				 System.out.println(ele.getKey() +"	\t" + ele.getValue());
			 }
		}
}
