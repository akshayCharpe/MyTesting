package starPattern;

public class Star3 {

	public static void main(String[] args) 
	{

		int star=7;
		int space=0;
		
		for(int i=0;i<=4;i++)
		{
			for(int j=0;j<=space;j++)
			{
				System.out.print(" ");
			}
			for(int j=0;j<=star;j++)
			{
				System.out.print("*");
			}
			System.out.println();
			space++;
			star=star-2;
		}
	}

}
