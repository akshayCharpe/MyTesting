package basic_progrm;

import java.util.Arrays;

public class Array_desc {

	public static void main(String[] args) 
	{

		int[] a= {20,48,30,56};
		
		Arrays.sort(a);
		
//		for(int i=0;i<a.length;i++)
//		{
//			System.out.println(a[i]);
//		}
		
		for(int j=a.length-1;j>=0;j--)
		{
			System.out.println(a[j]);
		}
	}

}
