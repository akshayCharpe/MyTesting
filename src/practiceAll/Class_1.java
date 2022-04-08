 package practiceAll;

import java.util.Enumeration;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Vector;

public class Class_1 
{

	public static void main(String[] args) 
	{
	
//		Vector<String> v=new Vector<String>();
//		
//		v.add("Mumbai");
//		v.add("Amravati");
//		v.add("pune");
//		v.add("Nagpur");
//		
//		Enumeration<String> en = v.elements();
//		while(en.hasMoreElements())
//		{
//			System.out.println(en.nextElement());
//		}
		
		LinkedList<String>ll=new LinkedList<String>();
		
		ll.add("Honda");
		ll.add("Hero");
		ll.add("Tata");
		ll.add("Suzuki");
		ll.add("Hundai");
		
		for(String s:ll)
		{
			System.out.println(s);
		}
		
		ll.remove(3);
		
		ll.remove("Hundai");
		System.out.println("=================");
		
		ListIterator<String> li = ll.listIterator();
		{
			while(li.hasNext())
			{
				System.out.println(li.next());
			}
		}
	}
	
	
}
