package SearchTechnique;

import java.util.Arrays;

public class LinearSearch {

	public static void linearSearch(int[] arr,int target)
	{
		//work on unsorted array
		//time complexity O(n)
		int i,j;
		for(i=0; i<arr.length-1; i++)
		{
			if(arr[i] == target)
			{
				System.out.println("search found at index="+i);
				return;
			}
		}
		System.out.println("element not found....");
	}
	
	public static void main(String[] args) {
		int arr[]= {10,20,11,13,23,45,67,15};
		System.out.println("unsorted array:"+Arrays.toString(arr));
		linearSearch(arr, 13);
		Arrays.sort(arr);
		System.out.println("sorted array:"+Arrays.toString(arr));
		linearSearch(arr, 23);

	}

}
