package collection;

import java.util.Iterator;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class TreeSet {

	public static void main(String[] args) 
	{

		java.util.TreeSet<Integer> ts=new java.util.TreeSet<>();
		
		ts.add(10);
		ts.add(20);
		ts.add(30);
		ts.add(40);
		ts.add(20);
		
		System.out.println(ts);
		
		for(Integer i:ts)
		{
			System.out.println(i);
		}
		
		System.out.println("===============");
		
		Iterator<Integer> it = ts.iterator();
		while (it.hasNext()) {
		System.out.println(it.next());
			
		}
		System.out.println("==============");
		
		ts.pollFirst();
		ts.pollFirst();
		System.out.println(ts);
		
		ts.pollLast();
		ts.pollLast();
		System.out.println(ts);
		
		System.out.println(ts.pollFirst());
	
	}

}
