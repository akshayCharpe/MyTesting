package testing_pckg;

public interface Emp_1 
{

	static void empname()
	{
		System.out.println("Name of Emp_1 is Ashok");
	}
	
	default void salary()
	{
		System.out.println("Salary of Ashok is 60000.");
	}
	
	public void time();
}
