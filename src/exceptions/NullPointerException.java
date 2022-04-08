package exceptions;

public class NullPointerException {

	public static void main(String[] args) 
	{

		String name=null;
		
		try {
		name.charAt(0);
		}
		catch (NullPointerException e) {
			
			System.out.println("Cant perform actions on null value");
		}
		System.out.println("Hi all");
	}
	}


