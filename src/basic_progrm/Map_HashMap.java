package basic_progrm;

import java.util.HashMap;
import java.util.Set;

public class Map_HashMap {

	public static void main(String[] args) 
	{

		// String str="abc xyz abc lmn pqr abc xyz";
		
//				String str="abc xyz abc lmn pqr abc xyz";
//				 String ar[]=str.split(" ");//[abc xyz abc lmn pqr abc xyz]
//				 
//				 HashMap<String,Integer> mp= new HashMap<String, Integer>();
//				 
//				 			for(int i=0; i<=ar.length-1;i++)
//				 			{
//				 				String s=ar[i];//abc
//				 				
//				 				if(mp.containsKey(s))
//				 				{
//				 					mp.put(s, mp.get(s)+1);
//				 				}
//				 				
//				 				else {
//									mp.put(s, 1);
//								}
//				 			}
//				 			
//				 			Set <String> key= mp.keySet();//[abc abc ]
//				 			
//				 			for(String k:key)
//				 			{
//				 				System.out.println(k+" : "+mp.get(k));
//				 			}
		
		HashMap<Integer, String> m=new HashMap<>();
		
		m.put(101, "Akshay");
		m.put(102, "Saurabh");
		System.out.println(m.get(101));
		
	}

}
