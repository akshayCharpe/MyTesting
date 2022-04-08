package constructor;

public class Cs1 {
	int a=30;
	int b=40;
	int c=a+b;
	String nm="Akshay";
	
	public Cs1()
	{
		System.out.println("The sum is: "+c);
	}

	public static void main(String[] args) {

		Cs1 o=new Cs1("Sarla",55,49);
		
		System.out.println("===============");
		
		Cs1 ob=new Cs1();
		
		ob.Student(65, 54, 78);
		
		System.out.println("=================");
		
		System.out.println("Name of Student is= "+o.nm);
		
		o.Student(46, 97, 58);
		
		System.out.println("The name "+Cs2.b);
		
		System.out.println("===============");
		
		Cs2 obj=new Cs2();
		
		System.out.println("The no. is "+obj.a);
		
	}
	
	public void Student(int a,int b,int c)
	{
		System.out.println("==================");
		int d=a+b+c;
		System.out.println("Sum is "+d);
	}
	
	public Cs1(String a, int b,float c)
	{
		System.out.println("Name of Mother is "+a);
		System.out.println("Age of Mother is "+b);
		System.out.println("Weight is "+c);
	}

}
