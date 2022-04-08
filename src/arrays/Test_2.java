package arrays;

public class Test_2 {

	public static void main(String[] args) {

		String[][] As=new String[2][2];
		
		As[0][0]="Akshay";
		As[0][1]="Prakash";
		
		As[1][1]="Akshay";
		
		for(int i=0;i<=As.length-1;i++)
		{
			for(int j=0;j<=As.length-1;j++)
			{
				System.out.print(As[i][j]+" ");
			}
			System.out.println();
		}
		
		int v[][]= {{10,30},{20,40}};
		
		for(int i=v.length-1;i>=0;i--)
		{
			for(int j=v.length-1;j>=0;j--)
			{
				System.out.print(v[i][j]+"  ");
			}
			System.out.println();
			System.out.println();
		}
		
//		String[] s= {"I","Want","Become","Software Test","Engg."};
//		
//		for(int i=s.length-1;i>=0;i--)
//		{
//			System.out.println(s[i]);
//		}
//		System.out.println("================");
//		
//		String[][] d= {{"Pass","Fail"},{"Fail","Pass"}};
//		
//		for(int i=0;i<=d.length-1;i++)
//		{
//			for(int j=0;j<=d.length-1;j++)
//			{
//				System.out.print(d[j][i]+"  ");
//			}
//			System.out.println();
//		}
//		System.out.println(d.length);
		
	}

}
