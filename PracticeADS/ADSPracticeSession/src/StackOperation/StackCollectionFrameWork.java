package StackOperation;

import java.util.Stack;

public class StackCollectionFrameWork {

	public static void main(String[] args) {
		 Stack<Integer> stack=new Stack<Integer>();
		 stack.push(10);
		 stack.push(20);
		 stack.push(30);
		 stack.push(40);
		 
		 //display the stack
		 System.out.println("Before Pop,ELements Are...");
		 for(Integer s:stack)
		 {
			 System.out.print(s+",");
		 }
		 //if want to peek the element
		 System.out.println("\nPeek Top Element:"+stack.peek());
		 System.out.println("pop the Top element:"+stack.pop());
		 
		 System.out.println("After Pop,ELements Are...");
		 for(Integer s:stack)
		 {
			 System.out.print(s+",");
		 }

	}

}
