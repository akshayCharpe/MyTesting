package basic_progrm;

public class Large_min_array {

	public static void main(String[] args) 
	{

		int[] v= {3,7,4,6,3,2,9};
		
		int max=v[0];
		
		for(int i=1;i<v.length;i++)
		{
			if(v[i]>max)
			{
				max=v[i];
			}
		}
		System.out.println("Largest no is "+max);
		
		
//		int[] k= {4,2,5,9,6};
//		
//		int min=k[0];
//		for(int j=1;j<k.length;j++)
//		{
//			if(k[j]<min)
//			{
//				min=k[j];
//				
//			}
//		}
//		System.out.println("Smallest no. is "+min);
}

}
