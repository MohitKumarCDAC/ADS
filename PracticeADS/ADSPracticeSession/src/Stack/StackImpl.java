package Stack;

import java.util.Arrays;

public class StackImpl implements Stack{
	//make a array stack
		private int[] stack;
		private int top;
		private int capacity;
		
		//constructor
		public StackImpl(int capacity)
		{
			this.capacity=capacity;
			this.stack=new int[capacity];
			this.top=-1;
		}
	
	

	@Override
	public boolean isEmpty() {
		return top==-1;
	}

	@Override
	public boolean isFull() {
		return top==capacity-1;
	}

	@Override
	public void push(int item) {
		//chek that stack is empty or not
		if(isFull())
		{
			throw new StackOverFlowException("Stack is Full....");
		}
		stack[++top]=item;
		
	}

	@Override
	public int pop() {
		if(isEmpty())
		{
			throw new StackUnderFlowException("Stack is Empty.....");
		}
		return stack[top--];
	}

	@Override
	public int peek() {
		if(isEmpty())
		{
			 throw new StackUnderFlowException("Stack is Empty.....");
		}
		return stack[top];
	}
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
	 public static void main(String[] args)
	 {
		 int arr[]= {1,2,3,4,5,6};
		Stack stack=new StackImpl(10); 
		System.out.println("Before Reverse:"+Arrays.toString(arr));
		reverseArray(arr, stack);
		System.out.println("After Reverse:"+Arrays.toString(arr));
	 }
	
}
