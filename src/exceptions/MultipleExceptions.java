package exceptions;

public class MultipleExceptions {

	public static void main(String[] args) 
	{

		int a=10;
		int b=0;
		
		try
		{
			int div= a/b;
			System.out.println(div);
		}
		
		
		catch (NullPointerException e)
		{
			System.out.println("Cant perform actions on null value");

		}
		
		catch (StringIndexOutOfBoundsException e) {
			System.out.println("check String index");

		}
		catch (Exception e) {
			e.printStackTrace();
			System.out.println("Generic exception caught");
		}
		catch (ArithmeticException e) {
			
			System.out.println("Divide by zero is not possible");
		}
		
		
		finally {
			System.out.println("Hi finally is excuted");
		}
	}
	}

}
