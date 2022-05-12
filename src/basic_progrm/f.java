package basic_progrm;

import java.util.Scanner;

public class f 
{

	public static void main(String[] args)
    {
        // Scanner sc=new Scanner(System.in);
        
        //  System.out.println("Enter the Number");
        
        //  int a=sc.nextint();
        
        int a=435;
        
        int b=a;
        int rev=0,rem=0;
        
        while(b>0)
        {
         rem=b%10;
            rev=(rev*10)+rem;
             
             b=b/10;
            
        }
        System.out.println("Revesre No. is "+rev);
    }
}
