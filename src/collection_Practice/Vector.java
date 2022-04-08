package collection_Practice;

import java.util.Enumeration;

public class Vector {

	public static void main(String[] args) 
	{

		java.util.Vector v=new java.util.Vector();
		
		v.add('A');
		v.add('C');
		v.add('A');
		v.add(2, 'H');
		v.add('D');
		v.add('E');
		v.add('F');
		v.add(null);
		
		System.out.println(v);
		
		v.remove(3);
		
		System.out.println(v);
		
		Enumeration en = v.elements();
		while(en.hasMoreElements())
		{
			System.out.println(en.nextElement());
		}
		
	}

}
