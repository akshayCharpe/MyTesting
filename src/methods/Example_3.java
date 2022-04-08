package methods;

public class Example_3 {

	public static void main(String[] args) {
		System.out.println("This is Static method with same class-->");

		Student1();
		System.out.println("This is Static method with different class-->");
		Example_4.Student2();
	}

	public static void Student1()
	{
		int a,b,c;
		float d;
		a=67;
		b=37;
		c=78;
		d=(a+b+c)*100/300f;
		System.out.println("This is the result for Student1: "+d);
		
	}
}
