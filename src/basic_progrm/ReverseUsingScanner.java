package basic_progrm;

import java.util.Scanner;

public class ReverseUsingScanner {

	public static void main(String[] args) 
	{

		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter the String");
		
		String sc = s.next();
		
		int length=sc.length();
		
		System.out.print("Reverse String is ");
		
		for(int i=length-1;i>=0;i--)
		{
			System.out.print(sc.charAt(i));
		}
	}

	

}
