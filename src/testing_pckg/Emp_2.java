package testing_pckg;

public interface Emp_2 
{

	static void empname()
	{
		System.out.println("Name of Emp_2 is Anil");
	}
	
	default void salary()
	{
		System.out.println("Salary of Anil is 70000");
	}
	
	public void time();
}
