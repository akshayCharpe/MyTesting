package basic_progrm;

public class Primeno_All {

	public static void main(String[] args) 
	{

		int s=56;
		int tem=0;
		
		for(int i=2;i<=s;i++)
		{
		
			for(int j=2;j<=i-1;j++)
			{
				if(i%j==0)
				{
					tem=tem+1;
				}
			}
			if(tem==0)
			{
				System.out.println(i);
			}
			else 
			{
				tem=0;
			}
		}
	}

}
