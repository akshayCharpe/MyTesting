package basic_progrm;

public class Amstrong_1 {

	public static void main(String[] args) 
	{

		int s=153;
		int s1=s;
		int length=0;
		
		while(s1!=0)
		{
			length=length+1;
			
			s1=s1/10;
		}
		System.out.println(length);
		
		
		int s2=s;
		int arm=0;
		
		while(s2!=0)
		{
			int mult=1;
			int rem=s2%10;
			for(int i=1;i<=length;i++)
			{
				mult=mult*rem;
				
			}
			s2=s2/10;
			
			arm=arm+mult;
		}
		
		if(arm==s)
		{
			System.out.println("Amstrong no.");
		}
		else
		{
			System.out.println("Not Amstrong no.");
		}
	    
	}
	
	}


