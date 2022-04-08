package control_statement;

public class Nested_ifelse {

	public static void main(String[] args) {
		
		String movie_name="Spyderman no way home";
		int screen=2;
		String seat="s45";
	
		if (movie_name=="Spyderman no way home")
		{
		System.out.println("What is your Screen no.\n");
		
		if (screen==3)
		{
		System.out.println("Whats your seat no.\n");
		
		if (seat=="s45")
		{
		System.out.println("Welcome, please go ahead");	
		}
		else
		{
			System.out.println("Already booked");
		}
		
		}
		else
		{
			System.out.println("Incorrect Screen,please check other screen");
		}
		
		}
		else
		{
			System.out.println("This movie is not in this Theater,Sorry for inconvenience");
		}
		
		

	}

}
