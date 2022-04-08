package testing_pckg;

public class Company implements Emp_1,Emp_2,Emp_3 {

	public static void main(String[] args) 
	{

		Emp_1.empname();
		Emp_2.empname();
		Emp_3.empname();
		Emp_1.empname();
		
		System.out.println("================");
		
		Company c=new Company();
		
		c.salary();
		c.time();
	
		
	}

	@Override
	public void salary() {
		// TODO Auto-generated method stub
		Emp_1.super.salary();
		Emp_2.super.salary();
		Emp_3.super.salary();
		Emp_1.super.salary();
	}

	@Override
	public void time() 
	{
	
		System.out.println("Timing is 9-5.");
	}

}
