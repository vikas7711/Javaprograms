package javaPractice;

public class MissingNumber 
{
	public static void main(String[] args) 
	{
		 int arr[] = {1,2,6,7,8,10};
		 
		 int lastValue = arr[arr.length-1];
		 
		 int index = 0;
		 
		 for(int i=1; i<=lastValue; i++)
		 {
			 if(index < arr.length && arr[index] == i)
			 {
				 index++;
			 } else
			 {
				 System.out.print(i + " ");
			 }
		 }
	}
}
