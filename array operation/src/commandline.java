
public class commandline {
	
		public static void main(String[] args)
		{
		String[] arr=args;
		 String sum = 0;			
		 System.out.println("Array Is :- \n");
		 for(int i=0;i<arr.length;i++)
		{
		      sum=sum+arr[i];
		System.out.println(" "+arr[i]);
		}
		 System.out.println("Array Sum Is :- "+sum);		
	
	}
}
