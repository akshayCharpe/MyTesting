package practiceAll;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Collection_test {

	public static void main(String[] args) 
	{

		ArrayList al=new ArrayList();
		
		al.add("Amravati");
		al.add(1, 27);
		al.add("Nagpur");
		al.add(3, 31);
		al.add("Pune");
		al.add(5, 12);
		
		for(Object o:al)
		{
			System.out.println(o);
		}
		
		System.out.println("=====================");
		Iterator it=al.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		System.out.println("======================");
		ListIterator li = al.listIterator(3);
		
		while(li.hasNext())
		{
			System.out.println(li.next());
		}
	}

}
