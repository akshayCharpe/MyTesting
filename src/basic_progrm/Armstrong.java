package basic_progrm;

public class Armstrong {

	public static void main(String[] args) 
	{

		int no=153;//1*1*1+5*5*5+3*3*3=1+125+27=153
		int t1=no;
		int length=0;
		
		while(t1!=0)
		{
			length=length+1;
			
			t1=t1/10;
		}
		
		System.out.println("Length is "+length);
		
		int t2=no;
		
		int arm=0;
		
		
		while(t2!=0)
		{
			
			int mul=1;
			int rem=t2%10;
		for(int i=1;i<=length;i++)
		{
			mul=mul*rem;
			
		}
		//27+125+1
		arm=arm+mul;//arm=27+125+1=153
		
		t2=t2/10;
		
		
		
		}
		
		if(arm==no) {
			System.out.println("Amstrong no.");
		}
		else {
			System.out.println("Not Amstrong no.");
		}
	}

}
