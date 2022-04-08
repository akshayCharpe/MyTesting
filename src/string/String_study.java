package string;

public class String_study {

	private static final String Charpe = null;

	public static void main(String[] args) 
	{

		String s="Akshay Charpe";
		
		String s1="Akshay Charpe";
		
		String m=new String("Akshay Charpe");
		
		String m1=new String("akshay charpe");
		
		System.out.println(s==s1);
		
		System.out.println(s.equals(s1));
		
		System.out.println(m==m1);
		
		System.out.println(m.equalsIgnoreCase(m1));
		
		System.out.println(m1.toUpperCase());
		
		System.out.println(m.toLowerCase());
		
		System.out.println("Length is "+s.length());
		
		System.out.println(m.contains("ay"));
		
		System.out.println(s.contains("C"));
		
		String a="";
		String b=" ";
		
		System.out.println(b.isBlank());
		
		System.out.println(s.charAt(5));
		
		System.out.println(s1.substring(4));
		
		System.out.println(a.isEmpty());
		
		
		System.out.println("return "+s.startsWith("Aksh"));
		
		String str=null;
		
		System.out.println(str.equals("tushar"));
		
	}

}
