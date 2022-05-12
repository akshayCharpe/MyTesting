package collection;

import java.util.Iterator;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class LinkedHashSet {

	public static void main(String[] args) 
	{

		java.util.LinkedHashSet lh=new java.util.LinkedHashSet<>();
		
		lh.add("zumber");
		lh.add("cumber");
		lh.add(344);
		lh.add('B');
		lh.add(344.344f);
		lh.add("chachunder");
		
		System.out.println(lh);
		
		
		for(Object o:lh)
		{
			System.out.println(o);
		}
		
		System.out.println("================");
		
		Iterator it = lh.iterator();
		while (it.hasNext())
		{
			System.out.println(it.next());
		}
		
		lh.remove(344);
		System.out.println(lh);
	}

}
