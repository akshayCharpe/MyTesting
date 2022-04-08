package basic_progrm;

public class Fibonacci_series {

	public static void main(String[] args) 
	{

		int F=0,S=1;
		
		System.out.print(F+" "+S);
		
		int c;
		
		for(int i=2;i<=10;i++)
		{
			c=F+S;
			
			System.out.print(" "+c);
			
			F=S;
			S=c;
		}
	}

}
