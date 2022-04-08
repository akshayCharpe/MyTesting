package control_statement;

public class If_else {

	public static void main(String[] args) {

		float per=35.6f;
		
		if (per==40.0)
		{
		
			System.out.println("Your are on boundary");
		}
		else if (per>40 & per<=60.0 )
		{
		
			System.out.println("You are in second class");
		}
		else if (per>60.0)
		{
		
			System.out.println("You are in First class");
		}
		else
		{
			System.out.println("You are failed");
		}
		
	}
	

}
