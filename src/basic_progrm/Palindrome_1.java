package basic_progrm;

public class Palindrome_1 {

	public static void main(String[] args) 
	{

		int a=121;
		int a1=a;
		int rev=0;
		int rem;
		
		while(a1!=0)
		{
			rem=a1%10;
			rev=rev*10+rem;
			
			a1=a1/10;
		}
		if(rev==a)
		{
			System.out.println("Palindrome No.");
			
		}
		else
		{
			System.out.println("Not Palindrome No.");
		}
	}

}
