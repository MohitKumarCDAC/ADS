package SortingArray;

import java.util.Arrays;

public class QuickSortTest {
    public static void swap(int[] arr,int x,int y)
    {
    	int temp=arr[x];
    	arr[x]=arr[y];
    	arr[y]=temp;
    }
    public static void quickSort(int[] arr,int left,int right)
    {
    	int i=0, j=right;
    	//check base case that array has element or not
    	if(left >= right)
    	{
    		return;
    	}
    	
    	while(i < j)
    	{
    		//from the left(i-index) find element greater than pivot
    		while(i <=right && arr[i] <= arr[left])
    			i++;
    		//from the right(j-index) find element less than pivot
    		while(arr[j] > arr[left])
    			j--;
    		//if i is less than j swap its element with jth element
    		if(i < j)
    			swap(arr, i, j);
    	}
    	swap(arr, j, left);
    	
    	quickSort(arr, left, j-1);
    	quickSort(arr, j+1, right);
    		
    }
	
	public static void main(String[] args) {
		
		int arr[]= {9,6,2,8,7,11,10};
		
		System.out.println(Arrays.toString(arr));
		quickSort(arr, 0, arr.length-1);
		System.out.println(Arrays.toString(arr));
	}

}
