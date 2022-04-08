package polymorphism;

public class Methodoverloading {

	public static void main(String[] args) 
	{

		Methodoverloading m=new Methodoverloading();
		m.test();
		m.test(25);
		m.test(30, 40);

		bike();
		bike(30);
		bike(25,78);
	}
	
	public static void bike()
	{
		System.out.println("pleaser");
	}
	
	public static void bike(int a)
	{
		System.out.println("pulser");
	}
	
	public static void bike(int a, int b)
	{
	System.out.println("Deo");	
	}
	
	public void test()
	{
		System.out.println("Test1");
	}
	public void test(int a)
	{
		System.out.println("Test2 is "+a);
	}
	public void test(int a, int b)
	{
		System.out.println("Test3 is "+a+b);
	}

}
