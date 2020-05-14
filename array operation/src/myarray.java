import java.util.Scanner;

public class myarray {

	

	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in); 
//memory allocation
	System.out.println("------------------Matrix Operation(2D)----------------------------");
	System.out.println("\n\n------------------------Matrix A ----------------------------------");
int[][] arr=array_functions.create();
array_functions.accept(arr);
System.out.println("\n\n------------------------Matrix A Is ----------------------------------");

array_functions.display(arr);
System.out.println("\n\n------------------------Matrix B ----------------------------------");

int[][] arr2=array_functions.create();
array_functions.accept(arr2);
System.out.println("\n\n------------------------Matrix B Is ----------------------------------");

array_functions.display(arr2);
int r_length=0, c_length=0;
r_length=arr.length;
for(int i=0;i<arr.length;i++) 
{
	for(int j=0;j<arr[i].length;j++)
	{
		c_length=arr[i].length;
	
	}

}

boolean b2=array_functions.check_array(arr, arr2);
if(b2==false)
{
	System.out.println("Matrix Operation Can't Be Possible ");
	}
else
{
	

	}
	
int[][] arr3=new int[r_length][c_length];
for(int i=0;i<arr.length;i++) 
{
	for(int j=0;j<arr[i].length;j++)
	{
		arr3[i][j]=0;
	
	}	
}
int ch;
do {
System.out.println("\n---------------------------Matrix Operation ----------------------------------");
System.out.println("\nEnter 1 For Addition ");
System.out.println("\nEnter 2 For Substraction ");
System.out.println("\nEnter 3 For Multiplication ");
System.out.println("\nEnter 4 For Transpose ");
System.out.println("\nEnter 5 For Exit :-");
 ch=sc.nextInt();
switch(ch)
{
case 1 :
	array_functions.addition(arr, arr2, arr3);
	System.out.println("\n Addition Is :-");
	array_functions.display(arr3);
	break;
case 2 :
	array_functions.substraction(arr, arr2, arr3);
	System.out.println("\n Substraction Is :-");
	array_functions.display(arr3);
	break;
case 3:
	array_functions.multiplication(arr, arr2, arr3);
	System.out.println("\nMultiplication Is :-");
	array_functions.display(arr3);
	break;
case 4:
	System.out.println("\n-----------------Matrix A Transpose ----------------------");
	array_functions.transpose(arr);
	System.out.println("\n-----------------Matrix B Transpose ----------------------");
	array_functions.transpose(arr2);
	break;
}
}while(ch!=5);
System.out.println("\n-----------Thank You----------");
//main end
	}
//class end
}

