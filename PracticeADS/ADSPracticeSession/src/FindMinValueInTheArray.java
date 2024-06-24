import java.util.Arrays;
import java.util.Scanner;

public class FindMinValueInTheArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length of Array:");
		int n=sc.nextInt();
		int i;
		//declare array
		int[] arr=new int[n];
		
		//insert element into the array
		System.out.println("Enter elements");
		for(i=0; i<n; ++i)
		{
			arr[i]=sc.nextInt();
		}
		//display the array
		System.out.println("display Array element");
		for(i=0; i<n; i++)
		{
			System.out.print(arr[i]+",");
		}
		//find min element in the given array
		int min=arr[0];
		//
		min=Arrays.stream(arr).min().getAsInt();
		System.out.println("\n min value:"+min);
	}

}
