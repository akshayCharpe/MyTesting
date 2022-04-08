package arrays;

public class Split {

	public static void main(String[] args) {

//		String ar="My Name Is Akshay";
//		
//		String sep=" ";
//		
//		String[] ref = ar.split(sep);
//		
//		for(int i=0;i<=ref.length-1;i++)
//		{
//			System.out.println(ref[i]+" ");
//		}
		
		String ch="My Name is @123";
		
		String s=" ";
		
		String[] r=ch.split(s);
		
		for(int j=0;j<=r.length-1;j++)
		{
			System.out.println(r[j]);
		}
		
	}

}
