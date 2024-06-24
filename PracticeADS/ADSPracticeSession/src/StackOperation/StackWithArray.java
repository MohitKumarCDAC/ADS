package StackOperation;

public class StackWithArray {
	
	private int[] stack;
	private int top;
	//fixed array
	private int capacity;
	
	//make a constructor
	public StackWithArray(int capacity)
	{
		this.capacity=capacity;
		this.stack=new int[capacity];
		this.top=-1;
	}
	//method to check if stack isEmpty
	public boolean isEmpty()
	{
		return top==-1;
	}
	//method to check if stack is full
	public boolean isFull() {
		return top == capacity-1;
	}
	
	//method to add element into the stack
	public void push(int item)
	{
		//check if stack is full or not if stack is full the return exception
		if(isFull())
		{
			throw new RuntimeException("Stack is Overflow....");
		}
		stack[++top]=item;
	}
	//methid to pop the element
	public int pop()
	{
		//check if stack is empty or not
		if(isEmpty())
		{
			throw new RuntimeException("Stack is UnderFlow");
		}
		return stack[top--];
	}
	//method to peek the topmost element
	public int peek() {
		if(isEmpty())
		{
			throw new RuntimeException("stack is empty..");
		}
		return stack[top];
	}
	
	public static void main(String[] args) {
		//make instance of class to use his methods
		StackWithArray s=new StackWithArray(5);
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		while(!s.isEmpty())
		{
			System.out.println(s.peek());
			s.pop();
		}
	}

}
