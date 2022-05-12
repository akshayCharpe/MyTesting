package basic_progrm;

public class Amstrong_2 {

	public static void main(String[] args) 
	{

		
		int a=1555;
		int t1=a;
		int length=0;
		
		while(t1!=0)
		{
			length++;
			
			t1=t1/10;
		}
	System.out.println(length);
		
		int t2=a;
		
		int arm=0;
		while(t2!=0)
		{
			int mult=1;
			int rem=t2%10;
			for(int i=1;i<=length;i++)
			{
				mult=mult*rem;
			}
			arm=arm+mult;
			t2=t2/10;
		}
		
		if(arm==a)
		{
			System.out.println("Armstrong no.");
			
		}
		else
		{
			System.out.println("Not armstrong no.");
		}
		
	}

}
