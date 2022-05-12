package basic_progrm;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class RemoveDuplicate {

	public static void main(String[] args) 
	{

		String s= "AKSHAY";
		String[] sarray = s.split("");
		
		 LinkedHashSet<String> mySet = new LinkedHashSet<String>();
		
		for(String x:sarray)
		{
			mySet.add(x);
		}
		
		Iterator it = mySet.iterator();
		while(it.hasNext())
		{
			System.out.print(it.next()+"");
		}
			
	}
		 
	}


