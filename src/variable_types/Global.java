package variable_types;

public class Global {
	
	static int a=50;
	static int b=45;

	public static void main(String[] args) {

		Global g=new Global();
		
		System.out.println("The global non static variable is "+g.a);
		
		System.out.println("The global static variable is "+b);
		
		System.out.println("==============");
		
		g.test();
		
		g.test1();
		
		g.test2();
		
		Global_1 g1=new Global_1();
		
		System.out.println("The variable frm another class is "+g1.b);
		
		g1.test3();
	}
	
	public void test()
	{
		int c=30;
		int d=50;
		int sum=a+c+d;
		
		System.out.println("The sum of test is "+sum);
	}
	
	public void test1()
	{
		int a=78;
		int sm=a+b;
		
		System.out.println("The sum of test1 is "+sm);
	}
	
	public static void test2()
	{
		
		int sm=a+a;
		
		System.out.println("The sum is "+sm);
		
	}

}
