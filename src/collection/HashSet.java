package collection;

import java.util.Iterator;

public class HashSet {

	public static void main(String[] args) 
	{

		java.util.HashSet<String> hs=new java.util.HashSet<>();
		
		hs.add("Akshay");
		hs.add("Amarvati");
		hs.add("Akshay");
		hs.add(null);
		hs.add(null);
		hs.add("Engg.");
		hs.add("Shubham");
		
		System.out.println(hs);
		
		for(String s:hs)
		{
			System.out.println(s);
		}
		
		hs.remove("Engg.");
		
		System.out.println("===============");
		
		Iterator<String> it = hs.iterator();
		
		while (it.hasNext()) {
			System.out.println(it.next());
			}
		
		hs.clear();
		
		System.out.println(hs.isEmpty());
	}

}
