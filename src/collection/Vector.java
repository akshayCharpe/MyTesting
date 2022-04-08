package collection;

import java.util.Enumeration;
import java.util.ListIterator;

public class Vector {

	public static void main(String[] args) 
	{

		java.util.Vector v=new java.util.Vector<>();
		
		v.add("Akshay");
		v.add(28);
		v.add('A');
		v.add(2, "Charpe");
		v.add("Bike");
		v.add("Car");
		
		v.remove(2);
		
//		System.out.println(v.size());
		
		System.out.println(v);
		
		for(int i=0;i<v.size();i++)
		{
			System.out.println(v.get(i));
		}
		
		v.remove(3);
		
		System.out.println("==============For Each Loop============");
		for(Object o:v)
		{
			System.out.println(o);
		}
		
		System.out.println("==============Using ListIterator============");
		
		ListIterator li = v.listIterator();
		{
			while(li.hasNext())
			{
				System.out.println(li.next());
			}
		}
		
		System.out.println("===============Using Enumeration==============");
		
		Enumeration en = v.elements();
		{
			while(en.hasMoreElements())
			{
				System.out.println(en.nextElement());
			}
		}
		
//		ListIterator li = v.listIterator(2);
//		{
//			while(li.hasNext())
//			{
//				System.out.println(li.next());
//			}
//		}
		
	}

}
