package testing_pckg;

public class Teacher extends Headmaster {

	public static void main(String[] args) 
	{

		Teacher t=new Teacher();
		Headmaster h=new Headmaster();
		
		t.hustle();
		h.hustle();
		
		jerry();
		Headmaster.jerry();
		
	}
	
	public void hustle()
	{
		System.out.println("Panda Game");
	}
	
	public static void jerry()
	{
		System.out.println("No I am not Jerry");
	}

}
