import java.util.Scanner;

public class array_functions {


public static int[][] create()
{
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter The Array Row Size :-");
	int n=sc.nextInt();
	int[][] arr= new int[n][];
	for(int i=0;i<arr.length;i++)
	{	
		System.out.println("Enter The Array Column "+(i+1)+" Size :-" );
	    arr[i]=new int[sc.nextInt()];
		}
	return arr;
}
public static int[][] accept(int arr[][])
{
	Scanner sc= new Scanner(System.in);
	System.out.println("Insert Values In Array !!!");
	for(int i=0;i<arr.length;i++)
	{
		for(int j=0;j<arr[i].length;j++)
		{
			System.out.println("Insert Value At "+(i+1)+" Row And "+(j+1)+"  Location :-");
			arr[i][j]=sc.nextInt();
		}
	}
	return arr;
}
	public static void display(int arr[][])
{
		System.out.println("Display Array !!!");
	for(int i=0;i<arr.length;i++)
	{
		for(int j=0;j<arr[i].length;j++)
		{
			System.out.print("\t"+arr[i][j]);
		}
		System.out.println("\n");
		
	}
}

	public static boolean check_array(int arr[][],int arr2[][]){
		int r_length=0, c_length=0;
		boolean b=true;
		if(arr.length==arr2.length)
		{
			 		for(int i=0;i<arr.length;i++) 
		{
		   if(arr[i].length!=arr2[i].length)
		   {
			 
			   b=false;
		   }
		}	

		}
	
		return b;
	}
public static int[][] addition(int arr[][],int arr2[][],int arr3[][])
{
	for(int i=0;i<arr.length;i++)
	{
		for(int j=0;j<arr[i].length;j++)
		{
			arr3[i][j]=arr[i][j]+arr2[i][j];
		}
	}
	return arr3;
}
public static int[][] substraction(int arr[][],int arr2[][],int arr3[][])
{
	for(int i=0;i<arr.length;i++)
	{
		for(int j=0;j<arr[i].length;j++)
		{
			arr3[i][j]=arr[i][j]-arr2[i][j];
		}
	}
	return arr3;
}
public static int[][] multiplication(int arr[][],int arr2[][],int arr3[][])
{
	for(int i=0;i<arr.length;i++)
	{
		for(int j=0;j<arr2[0].length;j++)
		{
 			for(int k=0;k<arr[0].length;k++)
			{
				arr3[i][j]+=arr[i][k]*arr2[k][j];
			
			}
		}
	}
	return arr3;
}
public static void transpose(int arr[][])
{
	
for(int i=0;i<arr.length;i++)
{
	for(int j=0;j<arr[i].length;j++)
	{
		System.out.print("\t"+arr[j][i]);
	}
	System.out.println("\n");
	
}
}

}
