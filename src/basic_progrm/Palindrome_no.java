package basic_progrm;

import java.util.Scanner;

public class Palindrome_no {

	public static void main(String[] args) 
	{
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter the number: ");
		
		 int a = s.nextInt();
		
		int t1=a;  //t1=22
		int rev=0;
		
		while(t1!=0)
		{
			int rem=t1%10;      
			rev=rev*10+rem;
			
			t1=t1/10;
		}
		
		if(rev==a)
		{
			System.out.println("It is Palindrome No.");
		}
		else 
		{
			System.out.println("It is not Palindrome No.");
		}
		
	}

}
