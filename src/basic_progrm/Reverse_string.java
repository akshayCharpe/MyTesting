package basic_progrm;

public class Reverse_string {

	public static void main(String[] args) 
	{

//		String d="Akshay";
//		
//		
//		for(int i=d.length()-1;i>=0;i--)
//		{
//			System.out.print(d.charAt(i));
//		}
		
		
		int a=9876;
		
		int t1=a;
		
		int rev=0;
		
		while(t1!=0)
		{
			int rem=t1%10;
			
			rev=rev*10+rem;
			
			t1=t1/10;
		}
		
		System.out.println(rev);
	}

}
