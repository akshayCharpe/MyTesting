package collection;

import java.util.ArrayList;
import java.util.Iterator;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class Array_list {

	public static void main(String[] args) 
	{

//		ArrayList al=new ArrayList<>();
//		
//		al.add("Akshay");
//		al.add(28);
//		al.add("Amravati");
//		al.add('B');
//		al.add("Anil");
//		al.add(27);
//		al.add("Yavatmal");
//		al.add('A');
//		al.add('B');
//		al.add("Saurabh");
//		al.add('B');
//		al.add("Digras");
//		
//		System.out.println(al);
//		System.out.println(al.size());
//		
//		System.out.println("===========Using For Loop=============");
//		
//		for(int i=0;i<=al.size()-1;i++)
//		{
//			System.out.println(al.get(i));
//		}
//		
//		System.out.println("============Using Iterator=============");
//		
//		Iterator it=al.iterator();
//		
//		while(it.hasNext())
//		{
//			System.out.println(it.next());
//		}
//		
//		System.out.println("==============Using For Each Loop===============");
//		
//		for(Object o:al)
//		{
//			System.out.println(o);
//		}
		
		ArrayList<String> st=new ArrayList<String>();
		
		st.add("Michael");
		st.add("Akshay");
		st.add("Michael");
		st.add("Charpe");
		
		for(String i:st)
		{
			System.out.println(i);
		}
		
		System.out.println();
		System.out.println(st);
		
		
	
	}

}
