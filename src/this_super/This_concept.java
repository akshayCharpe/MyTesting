package this_super;

public class This_concept extends Super_keywords
{

	int a=30;
	static int b=40;
	String c="Akshay";
	public static void main(String[] args) 
	{
	
		This_concept t=new This_concept();
		t.sum();
		
		sub();

	}
	
	public void sum()
	{
		int a=10;
		int b=20;
		String c="Shubham";
		
		System.out.println("Name is "+c);
		System.out.println("Nmae is "+this.c);
		
		int sum=a+b;
		System.out.println("sum is "+sum);
		
		int sum1=this.a+this.b;
		System.out.println("Sum is "+sum1);
		
		int sum2=100+super.b;
		System.out.println("Sum is "+sum2);
		
	}
	
	public static void sub()
	{
		int a=45;
		
	
		int sub=a-b;
		System.out.println("sub is "+sub);
		
		
	}

}
