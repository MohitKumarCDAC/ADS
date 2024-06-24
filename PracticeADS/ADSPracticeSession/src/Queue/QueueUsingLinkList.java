package Queue;

import java.util.concurrent.DelayQueue;



public class QueueUsingLinkList {
	//create a node class
	 static class Node{
		 static int data;
		 Node next;
		 //constructor
		 Node(int data)
		 {
			 //create a node whose next is null
			 this.data=data;
			 this.next=null;
		 }
		static  class Queue
		{ 
	static Node head=null;
	static Node tail=null;
	//check if list is Empty
	public static boolean isEmpty()
	{
		return head==null && tail==null;
	}
	//enqueue or add
	public static void add(int data)
	{
		Node newNode=new Node(data);
		//check if node is empty or not
		if(isEmpty())
		{
			head=newNode;
		}
		else
		{
			newNode.next=head;
			head=newNode;
		}
	}
	//dequeue
	public static int remove()
	{
		if(isEmpty())
		{
			System.out.println("list is empty....");
			return -1;
		}
		int front=head.data;
		if(head == tail)
		{
			tail=null;
		}
		head=head.next;
		return front;
		
	}
	//peek
	public static int peek()
	{
		if(isEmpty())
		{
			System.out.println("list is empty..");
			return -1;
		}
		else
		{
			return head.data;
		}
	}
	
	}
	 
	public static void main(String[] args) {
		Queue q=new Queue();
		q.add(1);
		q.add(2);
		q.add(3);
		
		System.out.println();
		while(!q.isEmpty())
		{
			System.out.println(q.peek());
			q.remove();
		}
		
		

	}
	 }
}
