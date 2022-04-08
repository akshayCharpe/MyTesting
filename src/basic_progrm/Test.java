package basic_progrm;

public class Test {

	public static void main(String[] args) 
	{

		String str="abc    ed  f  ";
		
		int count=0;
		
		for(int i=0;i<=str.length()-1;i++)
		{
			
			if(str.charAt(i)==' ')
			{
				count++;
			}
		}
		System.out.println("Total No.Space is "+count);
	}

}
