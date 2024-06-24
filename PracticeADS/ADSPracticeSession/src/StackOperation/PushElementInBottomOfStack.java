package StackOperation;

import java.util.Stack;

public class PushElementInBottomOfStack {
	
	public static void PushAtBottom(int item, Stack<Integer>s )
	{
		if(s.isEmpty())
		{
			s.push(item);
			return;
		}
		//using recursion
		int top=s.pop();
		PushAtBottom(item, s);
		s.push(top);
	}
	public static void main(String[] args) {
		Stack<Integer>stack=new Stack<Integer>();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		
		//40 stores in buttom of the stack
		PushAtBottom(40, stack);
		System.out.println("Size of the stack:"+stack.size());
		System.out.println("top most element:"+stack.peek());
		//pop the element
		while(!stack.isEmpty())
		{
			System.out.println(stack.peek());
			stack.pop();
		}
		//System.out.println("top most element:"+stack.peek());
		System.out.println("capacity of stack:"+stack.capacity());
		System.out.println("size of the stack:"+stack.size());
		
	}

}
