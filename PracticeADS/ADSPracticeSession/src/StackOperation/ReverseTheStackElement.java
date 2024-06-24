package StackOperation;

import java.util.Stack;

public class ReverseTheStackElement {
	
	public static void PustAtBottom(int data,Stack<Integer>s)
	{
		if(s.isEmpty())
		{
			s.push(data);
			return;
		}
		
		int top=s.pop();
		PustAtBottom(data, s);
		s.push(top);
	}
	//reverse the stack
	public static void reverse(Stack<Integer>s)
	{
		if(s.isEmpty())
		{
			return;
		}
		int top=s.pop();
		reverse(s);
		PustAtBottom(top, s);
	}

	

	public static void main(String[] args) {
		Stack<Integer> s=new Stack<Integer>();
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		reverse(s);
		while(!s.isEmpty())
		{
			System.out.println(s.peek());
			s.pop();
		}

	}

}
