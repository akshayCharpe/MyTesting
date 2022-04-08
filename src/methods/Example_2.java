package methods;

public class Example_2 {
	
	public static void result_1()
	{
		float a,b;
		float c;
		
		a=45f;
		b=56f;
		c=(a+b)*100/200f;
		System.out.println("The Result_1 is: "+c);
		
	}
	public static void result_2()
	{
		float a,b;
		float c;
		
		a=67f;
		b=98f;
		c=(a+b)*100/200f;
		System.out.println("The Result_2 is: "+c);
	}

	public static void main(String[] args) {
		
	 System.out.println("CUSTOMER PRODUCT: ");
     customer_1();
     customer_2();
     System.out.println("STUDENT RESULT: ");
     result_1();
     result_2();
	}
	public static void customer_1()
	{
		System.out.println("I want to buy Laptop");
		System.out.println("Hp Laptop");
	}
	
	public static void customer_2()
	{
		System.out.println("I want to buy Mobile");
		System.out.println("Iphone Mobile");
	}
    
}
