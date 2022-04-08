package constructor;

public class Cs3 
{

	int a=30;
	int b=10;
	int c;
	public Cs3(int s,int s1)
	{
		a=s;
		b=s1;
	}
	
	public Cs3(int a,int b,int c)
	{
		this.a=a;
		this.b=b;
		this.c=c;
	}
	
	public static void main(String[] args) 
	{

		Cs3 c=new Cs3(20, 40);
		c.sum();
		
		Cs3 c1=new Cs3(5, 5, 5);
		c1.mult();
		
	}
	
	private void sum()
	{
		int c=a+b;
		
		System.out.println("Sum is "+c);
	}
	
	public void mult()
	{
		int d=a*b*c;
		
		System.out.println("Multiplication is "+d);
	}

}
