package basic_progrm;

public class Duplicate_array {

	public static void main(String[] args) 
	{
//
//		int[] a= {1,2,3,6,7,3,2};
//		
//		for(int i=0;i<a.length;i++)
//		{
//			for(int j=i+1;j<a.length;j++)
//			{
//				if(a[i]==a[j] && (i!=j))
//				{
//					System.out.print(a[j]+" ");
//				}
//			}
//		}
		
		String[] b= {"Akshay","Poonam","Saurabh","Akshay","Poonam"};
		
		for(int i=0;i<b.length;i++)
		{
			for(int j=i+1;j<b.length;j++)
			{
				if(b[i]==b[j] && (i!=j))
				{
					System.out.println(b[j]);
				}
				
			}
		}
			
		
		
	}

}
