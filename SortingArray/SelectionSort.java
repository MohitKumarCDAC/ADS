package SortingArray;

public class SelectionSort {
	
	public static void displayArray(int arr[])
	{
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int arr[]= {2,12,23,10,6,7};
		
		//selection sort
		for(int i=0; i<arr.length-1; i++)
		{
			//we take first index of array is shortest
			//here shortest=2
			int shortest=i;
			
			for(int j=i+1; j<arr.length; j++)
			{
				if(arr[shortest] < arr[j])
				{
					shortest=j;
				}
				//swap all the elements
				int temp=arr[j];
				arr[j]=arr[shortest];
				arr[shortest]=temp;
			}
			
		}
		displayArray(arr);

	}

}
