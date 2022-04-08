package methods;

public class Example_5 {

	public static void main(String[] args) {
		
		Example_5 e5= new Example_5();
		System.out.println("This is non static method with same class-->");
		e5.patient1();
		e5.patient2();
		System.out.println("This is static method with different class-->");
		Example_4.Student2();
		Example_3.Student1();
		

	}
	
	public void patient1()
	{
		System.out.println("This Patient has a Cancer.");
	}
	public void patient2()
	{
		System.out.println("This Patient has Heart problem.");
	}

}
