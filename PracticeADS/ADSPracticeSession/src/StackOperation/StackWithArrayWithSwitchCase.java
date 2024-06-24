package StackOperation;

import java.util.Scanner;

public class StackWithArrayWithSwitchCase {
	
	private int[] stack;
	private int top;
	private int capacity;
	
	//make a parametrize constructor
	public StackWithArrayWithSwitchCase(int capacity)
	{
	
		this.capacity=capacity;
		this.stack=new int[capacity];
		this.top=-1;//here we assign top -1 that means stack is empty
	}
	//function to check stack is full
	public boolean isFull() {
		return top==capacity-1;
	}
	//function to check stack is empty
	public boolean isEmpty()
	{
		return top==-1;
	}
	//function to push element
	public  void push(int item)
	{
		if(isFull())
		{
			throw new RuntimeException("stack is overflow");
		}
		stack[++top]=item;
	}
	//function to pop element
	public int pop()
	{
		if(isEmpty())
		{
			throw new RuntimeException("Stack is Underflow");
		}
		return stack[--top];
	}
	//function to peek the item
	public int peek()
	{
		if(isEmpty())
		{
			throw new RuntimeException("Stack is empty....");
		}
		return stack[top];
	}
	//display all stack elemet
	public void display()
	{
		if(isEmpty())
		{
			System.out.println("stack is empty......");
			return;
		}
		for(int i=0; i<=top; i++)
		{
			System.out.print(stack[i]+",");
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Capacity of the Stack");
		int capacity=sc.nextInt();
		
		StackWithArrayWithSwitchCase stack=new StackWithArrayWithSwitchCase(capacity);
		
		
		while(true)
		{
			System.out.println("\nStack Operation:");
			System.out.println("1.Push Element:");
			System.out.println("2.Pop Element:");
			System.out.println("3.Peek Element:");
			System.out.println("4.Display all ELements..");
			System.out.println("5.Exit from loop.....");
			
			System.out.println("Enter choice...");
			int choice=sc.nextInt();
			
			switch (choice) {
			case 1:
				System.out.println("Enter the Element to push..");
				int element=sc.nextInt();
				stack.push(element);
				break;
			case 2:
				stack.pop();
				break;
			case 3:
				int topElement=stack.peek();
				if(topElement!=-1)
				{
					System.out.println("Top element is::"+topElement);
				}
				break;
			case 4:
				stack.display();
				break;
			case 5:
				System.out.println("Existing.....");
				sc.close();
				System.exit(0);
			default:
				System.out.println("Invalid choice. Please try again.");
			}
		}

	}

}
