import java.util.Scanner;
public class matrixoperation {
	static Scanner sc=new Scanner(System.in);
	public static int[][] create(int arr[][]){
		System.out.println("How many rows and col do you want for matrix1");
		int r=sc.nextInt();//4
		arr=new int[r][];//4
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter col for "+(i+1)+" row");
			arr[i]=new int[sc.nextInt()];//2 3 4 1
		}	
		return arr;
	}//accept method over..
	public static int[][] accept(int arr[][])
	{
		System.out.println("Insert values in matrix");
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				arr[i][j]=sc.nextInt();
			}
		}
		return arr;
	}
	public static void display(int arr[][]){
		System.out.println("--------Matrix-----------");
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}
	public static int[][] addition(int arr[][],int arr2[][],int arr3[][]){
		arr3=create(arr3);
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				arr3[i][j]=arr[i][j]+arr2[i][j];
			}
		}
		return arr3;
	}
}
