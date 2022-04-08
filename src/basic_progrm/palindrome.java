package basic_progrm;

public class palindrome {

	public static void main(String[] args) 
	{

		int a=323;
		 int t1=a;
		 int rev=0;
		 
		 while(t1!=0)
		 {
			int rem=t1%10;
			
			rev=rev *10+rem;
			
			t1=t1/10;
		 }
		 
		 if(rev==a)
		 {
			 System.out.println("Palindrome no.");
			 
		 }
		 else {
			 System.out.println("Not Palindrome no.");
		 }
	}

}
