package SortingArray;

import java.util.Arrays;

public class MergeSort {
	
	public static void mergeSort(int[] arr,int left,int right)
	{
		//if partition is in valid or have single element then,return
		if(left >=right)
			return;
		//find mid value
		int mid=(left+right)/2;
		//sort left partition(left to mid)
		mergeSort(arr, left, mid);
		//sort right partition(mid+1 to right)
		mergeSort(arr, mid+1, right);
		//create temporary array to accomodate the array
		int[] temp=new int[right-left+1];
		//merge two sorted partition into temp array
		int i=left,j=mid+1, k=0;
		//compare element from both the partition and 
		//smaller element is copy in temp
		while(i <=mid && j <= right)
		{
			if(arr[i] < arr[j])
				temp[k++]=arr[i++];
			else
				temp[k++]=arr[j++];
		
		}
		//copy remaining element in the temp
		while(i <= mid)
			temp[k++]=arr[i++];
		while(j <= right)
			temp[k++]=arr[j++];
		
		//overwrite temp array back to array
		for(i=0; i<temp.length; i++)
		{
		 	arr[left+i]=temp[i];
		}
		
	}
	
	public static void main(String[] args) {
		int arr[]= {8,3,9,1,5,7,2,6,4};
		
		System.out.println(Arrays.toString(arr));
		
		mergeSort(arr, 0, arr.length-1);
		
		System.out.println(Arrays.toString(arr));

	}

}
