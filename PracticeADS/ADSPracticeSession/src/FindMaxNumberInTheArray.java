import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class FindMaxNumberInTheArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length of Array:");
		int i;
		int n=sc.nextInt();
		//declare the array
		int[] arr=new int[n];
		//insert the element into the array
		System.out.println("Enter element="+n);
		for(i=0; i<n; ++i)
		{
			arr[i]=sc.nextInt();
		}
		//display the array
		System.out.println("Elements are:");
		for(i=0; i<n; ++i)
		{
			System.out.print(arr[i]+",");
		}
		//find max number in the given array
		//initialize first index is max and the check other elements
		//int max=arr[0];
		//find max value
//		for(i= 1; i<n; ++i)
//		{
//			if(arr[i]>max)
//			{
//				max=arr[i];
//			}
//			
//		}
		int max=Arrays.stream(arr).max().getAsInt();
		System.out.println("\n max element:"+max);	
sc.close();
	}

}
