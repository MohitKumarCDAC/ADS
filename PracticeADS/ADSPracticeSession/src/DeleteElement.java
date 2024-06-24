import java.util.Scanner;

public class DeleteElement {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i;
		System.out.println("Enter the size of Array::");
		int n=sc.nextInt();
		//initialize the array
		int[] arr=new int[n];
		//input element in the array
		System.out.println("Add element in the array"+n);
		for(i=0; i<n; ++i)
		{
			arr[i]=sc.nextInt();
		}
		
	//display the element 
		for(i=0; i<n; i++)
		{
			System.out.print(arr[i]+",");
		}
	//delete the element with the specific position
		System.out.println("\nEnter the position Which ");
		int pos=sc.nextInt();
		//check the position that valid or not
		if(pos<0||pos>n)
		{
			System.out.println("invalid position....");
		}
		else
		{
			//create a new array with size n-1
			int[] newarr=new int[n-1];
			//copy element from original array into new array
			int j=0;
			for(i=0; i<n; ++i) {
				if(i !=pos) {
				newarr[j++]=arr[i];
				}
			}
			//update array 
			arr=newarr;
			//print element after deletion
			System.out.println("Elements after deletion..");
			for(int num:arr)
			{
				System.out.println(num+",");
			}
		}
sc.close();
	}

}
