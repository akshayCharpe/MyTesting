package generalization;

public class Generalize_call {

	public static void main(String[] args) 
	{

		System.out.println("Employee 1 Details:-");
		Emp_1 e1=new Emp_1();
		e1.lunch();
		e1.rules();
		e1.timing();
		e1.profile();
		
		System.out.println("===================");
		
		System.out.println("Employee 2 Details:-");
		
		Emp_2 e2=new Emp_2();
		e2.lunch();
		e2.rules();
		e2.timing();
		e2.background();
	}

}
