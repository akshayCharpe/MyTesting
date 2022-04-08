package casting;

public class TataShowroom extends Showroom {

	public static void main(String[] args) 
	{

		TataShowroom t=new TataShowroom();
		t.autocar();
		t.nexon();
		t.autokeys();
		
		
		Showroom s=new Showroom();
		s.autocar();
		s.sunroof();
		
		
		Showroom t1=new TataShowroom();//Here we performing UP casting operation.
		                               //& we can call only superclass method or common method in both 
		                               // by creating object of subclass.
		t1.autocar();
		t1.sunroof();
		t1.autokeys();
		
		
	}
	
	public void autokeys()
	{
		System.out.println("Tata have Autokeys");//Overriding concept
	}
	
	void nexon()
	{
		System.out.println("Tata have Nexon car.");
	}

}
