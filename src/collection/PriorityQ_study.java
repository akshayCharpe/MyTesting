package collection;

import java.util.PriorityQueue;

public class PriorityQ_study {

	public static void main(String[] args) 
	{

		PriorityQueue pq=new PriorityQueue<>();
		
		pq.add("Mango");
		pq.add("Apple");          //Only String is Applicable.
		pq.add("Chikuu");
		
		System.out.println(pq);
	    System.out.println(pq.peek());
    	System.out.println(pq.poll());
//		System.out.println(pq.poll());
	    System.out.println(pq.element());
//		
		System.out.println(pq);
		
//		for(Object s:pq)
//		{
//			System.out.println(s);
//		}
	}

}
