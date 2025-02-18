package assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Assignment38_SortCollection 
{
	public static void main(String[] args) 
	{
		 List<Character> chr = new ArrayList<Character>();
		 chr.add('F');
		 chr.add('C');
		 chr.add('E');
		 chr.add('B');
		 chr.add('D');
		 chr.add('A');
		 System.out.println("List Collection Before Sort !");
		 System.out.println("Char : "+chr);
		 System.out.println("-----------------------------");
		 System.out.println("List Collection After Sort !");
		 Collections.sort(chr);
		 System.out.println("Char : "+chr);
		 

	}

}
