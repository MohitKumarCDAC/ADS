package Stack;

import java.util.Arrays;

public class StackOperation {
	
	//reverse array with the help of stack
	public static void reverseArray(int[] arr,Stack stack) {
		int i;
	for(i=0; i<arr.length; i++)
	{
		stack.push(arr[i]);
	}
	i=0;
	while(!stack.isEmpty())
	{
		arr[i]=stack.pop();
		++i;
	}
	}

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6};
			Stack s=new StackImpl(10);
//			s.push(1);
//			s.push(2);
//			s.push(3);
//			s.push(4);
			
			System.out.println("Before Reverse of the Array:"+Arrays.toString(arr));
			reverseArray(arr, s);
			System.out.println("Before Reverse of the Array:"+Arrays.toString(arr));
			
			
//			//peek and pop the stack element
//			while(!s.isEmpty())
//			{
//				System.out.println(s.peek());
//				s.pop();
//			}
		}

	

}
