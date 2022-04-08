package basic_progrm;

public class Count_character {

	public static void main(String[] args) 
	{

		String name="Akshay Charpe";
		
		int count=0;
		
		for(int i=0;i<name.length();i++)
		{
			if(name.charAt(i)!=' ')    //Count each Character Except space.
			{
				count++;
				
			}
		}
		
		System.out.println("Counting of Characters is "+count);
	}

}
