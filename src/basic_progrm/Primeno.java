package basic_progrm;

public class Primeno {

	public static void main(String[] args) 
	{

		int a=19;
		int tem=0;
		
		for(int i=2;i<=a-1;i++)
		{
			if(a%i==0)
			{
				tem=tem+1;
			}
		}
		if(tem>0)
		{
			System.out.println(a+" is not Prime No.");
		}
		else
		{
			System.out.println(a+" is Prime No.");
		}
	}

}
