package access_specifier;

public class Jd1 
{

	public int a=30;
    String b="Akshay";
	protected char d='A';
	private int e=20;
	
	public static void main(String[] args) 
	{
	
		Jd1 j=new Jd1();
		
		j.adress();
		j.age();
		j.mobile();
		name();
		
		System.out.println("public is "+j.a);
		System.out.println("Default String is "+j.b);
		System.out.println("protected char is "+j.d);
		System.out.println("private is "+j.e);

	}
	
	public static void name()
	{
		System.out.println("My name is Akshay");
	}
	
	void age()
	{
		System.out.println("Age is 28");
		
	}
	
	protected void mobile()
	{
		System.out.println("IPhone");
	}
	
	private void adress()
	{
	
		System.out.println("Amravati,Maharastra.");
	}
	
	

}
