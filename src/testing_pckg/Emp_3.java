package testing_pckg;

public interface Emp_3 
{

	static void empname()
	{
		System.out.println("Name of Emp_3 is Ambani");
	}
	
	default void salary()
	{
		System.out.println("Salary of Ambani is 65000");
	}
}
