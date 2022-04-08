package basic_progrm;

public class Practice_1 {

	public static void main(String[] args) 
	{

		int a=9;
		int b=6;
		int c=0;
		
		for(int i=1;i<=a;i++)
		{
			if(a%i==0 && b%i==0)
			{
				c=i;
			}
		}
		System.out.println("Greatest common factor is "+c);
		
		int d=(a*b)/c;
		
		System.out.println("Least common factor is "+d);
	}

}
