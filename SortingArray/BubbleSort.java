package SortingArray;

public class BubbleSort {
	
	//display method
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
		
		//bubble sort
		//traverse the array from 0 to last
		for(int i=0; i<arr.length-1; i++) {
			//when i=0 then its goes last
			//when i=1 then its goes second last becouse in 
			//the first iteration greater element is in last
			for(int j=0; j<arr.length-i-1; j++)
			{
				if(arr[j]>arr[j+1]) 
				{
					//swapping
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		displayArray(arr);

	}

}
