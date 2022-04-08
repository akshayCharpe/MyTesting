package exceptions;

public class StringIndexOutOfBoundException {

	public static void main(String[] args) 
	{

String name="Velocity";
		
		try {
		
	System.out.println(name.charAt(9));
		}
		catch (StringIndexOutOfBoundsException e) 
		{
			System.out.println("enter CharAT argument between 0-7");
		}
	}

}
