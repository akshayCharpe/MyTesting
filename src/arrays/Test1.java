package arrays;

import java.util.Arrays;

public class Test1 {

	public static void main(String[] args) 
	{

		String a[]=new String[3];
		
		a[0]="Akshay ";
		a[1]="Prakash ";
		a[2]="Charpe.";
		
		
		for(int i=0;i<=a.length-1;i++)
		{
			System.out.print(a[i]);
		}
		
		System.out.println();
		char grade[]=new char[4];
		
		grade[0]='A';
		grade[1]='B';
		grade[2]='C';
		grade[3]='D';
		
		for(int i=0;i<=grade.length-1;i++)
		{
			System.out.println(grade[i]);
		}
		
		System.out.println("===================");
		
		for(int j=grade.length-1;j>=0;j--)
		{
			System.out.println(grade[j]);
		}
		
		System.out.println("==================");
		
		int value[]=new int[5];
		
		value[0]=30;
		value[1]=10;
		value[2]=20;
		value[3]=50;
		value[4]=40;
		
		
		for(int i=0;i<=4;i++)
		{
			System.out.println(value[i]);
		}
		
		System.out.println("=================");
		
		for(int i=value.length-1;i>=0;i--)
		{
			System.out.println(value[i]);
		}
		
		System.out.println("==================");
		
		Arrays.sort(value);
		
		for(int i=0;i<=value.length-1;i++)
		{
			System.out.println(value[i]);
		}
		

		int rollno[]= {1,2,3,4};
		
		System.out.println(rollno[3]);
		
		
		
		
		
		
	}

}
