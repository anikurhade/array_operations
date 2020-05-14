import java.util.Scanner;

public class all_side_array_sum {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] arr=new int[3][3];
		int [][] r_sum=new int[1][4];
		int [][] c_sum=new int[1][3];
		int[][]arrSum=new int[4][4];
		int sum0=0,sum1=0,sum3=0;
		System.out.println("\n-----------------All Side Matrix Sum----------------");
		System.out.println("\nEnter The Matrix  :- ");
		 for(int i=0;i<arr.length;i++)
			{
				for(int j=0;j<arr[i].length;j++)
				{
					System.out.println("Insert Value At "+(i+1)+" Row And "+(j+1)+"  Location :-");
					arr[i][j]=sc.nextInt();
				}
			}
		Display(arr);
	
		 for(int i=0;i<arr.length;i++)
			{
			 sum0=0;
				for(int j=0;j<arr[i].length;j++)
				{
					sum0+=arr[i][j];
					if(i==j)
					{
						sum1+=arr[i][j];
					}
				}
				
				r_sum[0][i]=sum0;
				r_sum[0][3]=sum1;
			}
		 //Display(r_sum);

		 for(int i=0;i<arr.length;i++)
			{
				sum0=0;
			 for(int j=0;j<arr[i].length;j++)
				{
					sum0+=arr[j][i];
					
				}
			 
				c_sum[0][i]=sum0;
			}
		// Display(c_sum);
//-------------------------------------------------------
		
		 arrSum[0][0]=arr[0][0] ;
		 arrSum[0][1]=arr[0][1] ;
		 arrSum[0][2]=arr[0][2] ;
		 arrSum[0][3]=r_sum[0][0] ;
		// ---------------------------
		 arrSum[1][0]=arr[1][0] ;
		 arrSum[1][1]=arr[1][1] ;
		 arrSum[1][2]=arr[1][2] ;
		 arrSum[1][3]=r_sum[0][1] ;
		// ---------------------------
				 arrSum[2][0]=arr[2][0] ;
				 arrSum[2][1]=arr[2][1] ;
				 arrSum[2][2]=arr[2][2] ;
				 arrSum[2][3]=r_sum[0][2] ;
				// ---------------------------
				 arrSum[3][0]=c_sum[0][0] ;
				 arrSum[3][1]=c_sum[0][1] ;
				 arrSum[3][2]=c_sum[0][2] ;
				 arrSum[3][3]=r_sum[0][3] ;
	//--------------------------------------------------------------------------
	Display(arrSum);
	}


	public static void Display(int arr[][])
	{
		System.out.println("-----------------------Matrix  Is ------------------------------");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print("\t"+arr[i][j]);
			}
			System.out.println("\n");
			
		}
	}

}
