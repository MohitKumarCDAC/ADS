package SortingArray;

import java.util.Arrays;

public class HeapSort {
	//first we create a method were we make a max heap 
	//it is also called heapify
	//where complete binary tree convert into max heap
	//in max heap its parent element is greater than its both child element
	
	public  void heapify(int arr[],int n,int i)
	{
		int largest=i;//this is our root node
		int left=2*i+1;//its left node of the root
		int right=2*i+2;//its right node of the root
		
		//if left child is larger than root
		if(left < n && arr[left] > arr[largest])
			largest=left;
	
		//if right child is larger than root
		if(right < n && arr[right] > arr[largest])
			largest=right;
		
		//if largest is not root
		if(largest != i) {
			int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;
			
		//recursively heapify the affected sub tree
			heapify(arr, n, largest);
		}
	}
	public void swap(int arr[],int a,int b)
	{
		int temp=arr[a];
		arr[a]=arr[b];
		arr[b]=temp;
	}
	public void heapSort(int arr[],int n)
	{
		//build a max heaf call heapify
		for(int i=n/2-1; i>=0; i--)
			heapify(arr, n, i);
		
		//one by one extract an element from max heap
		for(int i=n-1; i>=0; i--) {
			//move current root to end
			swap(arr, 0, i);
		//call max heapify on the reduced
			heapify(arr, i, 0);
		}
		
	}
	
	
	public static void main(String[] args) {
		//here we sort through heap data structure[O(n logn)]
		int arr[] = {12, 11, 13, 5, 6, 7};
		int n=arr.length;
		System.out.println("Before:"+Arrays.toString(arr));
		HeapSort hs=new HeapSort();
		hs.heapSort(arr, n);
		System.out.println("After:"+Arrays.toString(arr));
		
		

	}

}
