package basic_progrm;

public class ReverseOnly {

	public static void main(String[] args) 
	{

		String s=" velocity corporate training centre pune";
		//String sep=" ";
		String[] m = s.split(" ");
		
//		for(int i=0;i<=m.length-1;i++)
//		{
//			for(int j=m[i].length()-1;j>=0;j--)
//			{
//				System.out.print(m[i].charAt(j));
//			}
//			System.out.print(" ");
//		}
		
		for(int k=0;k<=m.length-1;k++)
		{
			for(int p=m[k].length()-1;p>=0;p--)
			{
				if(k==2)
				{
					System.out.print(m[k].charAt(p));
				}
			}
			System.out.println();
		}
	}

}
