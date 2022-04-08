package collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Linked_list {

	public static void main(String[] args) 
	{

			LinkedList<Integer> ll=new LinkedList<>();
			
			ll.add(20);
			ll.add(30);
			ll.add(40);
			ll.add(50);
			
	//		System.out.println(ll.get(3));
			
			
//			
//			System.out.println(ll.containsAll(ll));
//			
//			System.out.println(ll.contains(30));
//			
//			System.out.println(ll.lastIndexOf(50));
			
			System.out.println("===============================");
			
			for(int i:ll)
			{
				System.out.println(i);
			}
			
			System.out.println("============");
			
			System.out.println(ll.remove(2));
			
			System.out.println(ll.get(2));
			
			System.out.println("===============Using Iterator==============");
			
			Iterator<Integer> li = ll.iterator();
			
				while(li.hasNext())
				{
					System.out.println(li.next());
				}
			
				System.out.println("==============Using ListIterator============");
			
			ListIterator<Integer> lit = ll.listIterator();
			
			while(lit.hasNext())
			{
				System.out.println(lit.next());
			}
	}

}
