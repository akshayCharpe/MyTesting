package access_specifier;

public class Jd2 {

	public static void main(String[] args) {
		
		Jd1 j=new Jd1();
		
		j.age();
		j.mobile();
		
	    Jd1.name();
	    
	    System.out.println("public is "+j.a);
	    System.out.println("default is "+j.b);
	    System.out.println("protected is "+j.d);

	}
}
