package arrays;

public class Test_3 {

	public static void main(String[] args) 
	{

	int[][] a= {{20,45,89,76,56},{29,76,99,56,23}};
	
	for(int i=0;i<=a.length-1;i++)
	{
		for(int j=0;j<=a.length-1;j++)
		{
			
			System.out.print(a[i][j]+" ");
			
		}
		System.out.println();
	}
		
	}

}
