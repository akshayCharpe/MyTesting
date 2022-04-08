package exceptions;

public class ArithmaticException {

	public static void main(String[] args) 
	{


		int a=10;
		int b=0;
		
		try 
		{
			int div=a/b;
			System.out.println(div);
		} 
		catch (ArithmeticException e) 
		{
			System.out.println("Cannot divide by zero");
		}
		
		
				System.out.println("Hi all");
		

}
