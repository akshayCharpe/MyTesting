package basic_progrm;

public class Prime_no {

	public static void main(String[] args) 
	{

		int n=37;
		int t=0;
		
		if(n==0||n==1)
		{
			System.out.println(n+" is not prime number.");
		}
		 for(int i=2;i<=n-1;i++)
		 {
			 if(n%i==0)
			 {
				 t=t+1;
			 }
		 }
		 if(t>0)
		 {
			 System.out.println(n+" is not prime number.");
		 }
		 else {
			 System.out.println(n+" is prime number.");
		 }
		
	}

}
