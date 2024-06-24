import java.util.Scanner;

public class SumofGivenArray {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("Enter the number");
		n=sc.nextInt();
		
		//declare array
		int arr[]= new int[n];
		//take number to sum
		System.out.println("Enter the number of Element");
		for(int i=0;i<n; i++)
		{
			arr[i]=sc.nextInt();
		}
		int sum=0;
		//process the sum
		for(int i=0; i<n; i++)
		{
			sum=sum+arr[i];
		}
		System.out.println("sum:"+sum);
	}
}
