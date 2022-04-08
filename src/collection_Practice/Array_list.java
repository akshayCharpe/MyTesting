package collection_Practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Array_list {

	public static void main(String[] args) 
	{

		ArrayList al=new ArrayList();
		
		al.add("Akshay");
		al.add("Anil");
		al.add("Akshay");
		al.add(null);
		al.add(null);
		al.add("Anil");
		
		
		System.out.println(al);
		
		System.out.println("=================");
		
		for(Object o:al)
		{
			System.out.println(o);
		}
		
		System.out.println("=================");
		
		Iterator it = al.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		System.out.println("=================");
		
		ListIterator li = al.listIterator();
		
		while (li.hasNext()) 
		{
		System.out.println(li.next());
		}
	}

}
