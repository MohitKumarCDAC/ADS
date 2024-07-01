package SortingArray;

import java.util.*;

public class Test {

	public static void main(String[] args) {
		int arr[]=new int[5];
		
		for(int i=5; i>0; i--)
			arr[5-i]=i;
		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		System.out.println(Arrays.binarySearch(arr, 4));
			

	}

}
