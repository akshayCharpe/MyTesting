package polymorphism;

public class Methodoverriding_2 extends Methodoverriding_1 
{

	public static void main(String[] args) 
	{

		Methodoverriding_1 m1=new Methodoverriding_1();
		
		Methodoverriding_2 m2=new Methodoverriding_2();
		
		m1.name();
		m2.name();
		
		m1.age();
		m2.age();
	}
	
	public void name()
	{
		System.out.println("Nikhil gole");
	}
	
	public void age()
	{
		System.out.println("Age is 28");
	}
	
	

}
