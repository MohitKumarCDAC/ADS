import java.util.Scanner;

public class InsertDataInArray {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Array Length:");
	int n;
	n=sc.nextInt();
	int[] arr=new int[n];
	
	System.out.println("Enter elements="+n);
	for(int i=0; i<n; i++)
	{
		arr[i]=sc.nextInt();
	}
//display the array
	System.out.println("Display Befor insert New Element:");
	for(int i=0; i<n; i++)
	{
		System.out.print(arr[i]+",");
	}
	
	
	//add new element in the array
	
	System.out.println("\nEnter New ELement to insert the array:");
	int newelement=sc.nextInt();
	
	//take position where the element add
	
	System.out.println("Enter the position where we want to insert the element:");
	int pos=sc.nextInt();
	
	//check that position is valid or not
	if(pos<0 || pos> n)
	{
		System.out.println("invalid position.......");
	}else
	{
	//create a new array
	int[] newarr=new int[n+1];
	//copy the element from old array to new array
	for(int i=0; i<pos; i++)
	{
		newarr[i]=arr[i];
	}
	newarr[pos]=newelement;
	for(int i=pos; i<n; i++)
	{
		newarr[i+1]=arr[i];
	}
	//print the new Array
	for(int i=0; i<newarr.length; i++)
	{
		System.out.println(newarr[i]);
	}
}
	sc.close();
	}
}
