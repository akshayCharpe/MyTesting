package basic_progrm;

public class HCF_LCM {

	public static void main(String[] args) 
	{

		int a=9;
		int b=97;
		int g=0;
		
		for(int i=1;i<=b;i++)
		{
			if(a%i==0 && b%i==0)
			{
				g=i;
			}
		}
		System.out.println("Highest common Factor "+g);
		
		int Lcm=(a*b)/g;
		
		System.out.println("Least common multiple "+Lcm);
	}

}
