package starPattern;

public class Start2 {

	public static void main(String[] args) 
	{

		int star=1;
		int space=3;
		
		for(int i=0;i<=3;i++)
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=star;j++)
			{
				System.out.print("*");
			}
			System.out.println();
			space--;
			star=star+2;
		}
	}

}
