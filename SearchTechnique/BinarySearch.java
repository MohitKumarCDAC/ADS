package SearchTechnique;

import java.util.Arrays;

public class BinarySearch {
	public static int binarySearch(int arr[],int target)
	{
		int left=0;
		int right=arr.length-1;
		while(left <= right)
		{
			int mid=(left+right)/2;
			if(arr[mid] == target)
			{
				return mid;
			}
			else if(arr[mid] < target)
			{
				left=mid+1;
			}
			else
			{
				right=mid-1;
			}
		}
		return -1;
		
	}

	public static void main(String[] args) {
		int arr[]= {19,10,20,67,45,21,23,49,47};
		System.out.println(Arrays.toString(arr));
		//sort the array
		Arrays.sort(arr);
		//display sorted array
		System.out.println(Arrays.toString(arr));
		//find element by binarysearch in sorted array
		int find=binarySearch(arr, 47);
		if(find !=-1)
		{
			System.out.println("element found at index:"+find);
		}
		else
		{
			System.out.println("element not found:");
		}

	}

}
