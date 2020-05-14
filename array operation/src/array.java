import java.util.Scanner;
public class array{
	public static void main(String[] args) {
		int [][]arr=null,arr2=null,arr3=null;
	
		System.out.println("Create Matrix...");
		arr=matrixoperation.create(arr);
		arr2=matrixoperation.create(arr2);
		
		System.out.println("Accept elements Matrix1");
		arr=matrixoperation.accept(arr);
		System.out.println("Accept elements Matrix2");
		arr2=matrixoperation.accept(arr2);
		
		System.out.println("Display...1");
		matrixoperation.display(arr);
		System.out.println("Display...2");
		matrixoperation.display(arr2);
		
		arr3=matrixoperation.addition(arr,arr2,arr3);
		System.out.println("----ADDITION---------");
		matrixoperation.display(arr3);
		/*
		boolean b=true;
		//check both matrix row.
		if(arr.length==arr2.length){
			//check col for both matrix..
			for(int i=0;i<arr.length;i++){
				if(arr[i].length!=arr2[i].length){
					b=false;
					break;
				}
			}
		}


		if(b){
		
			
			arr3=new int[arr.length][];
			for(int i=0;i<arr.length;i++){
				arr3[i]=new int[arr[i].length];
			}
			//addition of two matrix..
			for(int i=0;i<arr.length;i++){
				for(int j=0;j<arr[i].length;j++){
					arr3[i][j]=arr[i][j]+arr2[i][j];
				}
			}
			//display matrix3
			for(int i=0;i<arr3.length;i++)
			{
				for(int j=0;j<arr3[i].length;j++)
				{
					System.out.print(arr3[i][j]+"\t");	
				}
				System.out.println("\n");
			}
		}
		else
		{
			System.out.println("Add not possible..");
		}*/
	}
}
