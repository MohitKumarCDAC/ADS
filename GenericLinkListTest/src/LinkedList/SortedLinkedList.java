package LinkedList;

public class SortedLinkedList<T extends Comparable<T>> {
    Node<T> head;
    
    //constructor
    public SortedLinkedList()
    {
    	head=null;
    }
    
    //addNode in sorted Manner
    public void addNode(T data)
    {
    	Node<T> newNode=new Node<>(data);
    	 if (head == null || newNode.data.compareTo(head.data) < 0) {
             newNode.next = head;
             head = newNode;
             return;
         }
    	
    	//take a node to traverse
    	Node<T> currnNode=head;
    	Node<T> prevNode=null;
    	
    	//traverse 
    	while (currnNode != null && newNode.data.compareTo(currnNode.data) >= 0) {
            prevNode = currnNode;
            currnNode = currnNode.next;
        }

        // Insert newNode between previous and current
        prevNode.next = newNode;
        newNode.next = currnNode;
    	
    }
    
    //display the nodes
    public void displayList()
    {
    	if(head == null)
    	{
    		System.out.println("list is empty...");
    		return;
    	}
    	Node<T> currnNode=head;
    	while(currnNode !=null)
    	{
    		System.out.print(currnNode.data+"->");
    		currnNode=currnNode.next;
    	}
    	System.out.println("null");
    }
    
    //reverse the list
    
    public void reverseList()
    {
    	if(head==null || head.next == null)
    	{
    		return;
    	}
    	
    	Node<T> prevNode=head;
    	Node<T> currnNode=head.next;
    	
    	//traverse
    	while(currnNode!=null)
    	{
    		//create a next node
    		Node<T> nextNode=currnNode.next;
    		
    		//update value
    		
    		currnNode.next=prevNode;
    		prevNode=currnNode;
    		currnNode=nextNode;
    	}
    	head.next=null;
    	head=prevNode;
    }
    
    //find middle value
    public Node<T> findMiddle(Node<T> head)
    {
    	//here we use slow and fast
    	
    	
    	//in start both are head
    	Node<T> slow=head;
    	Node<T> fast=head;
    	
    	while(fast.next != null && fast.next.next !=null)
    	{
    		//where slow go one step
        	//and fast go two step
    		slow=slow.next;
    		fast=fast.next.next;
    	}
    	return slow;
    }
    
    //delete element
    public void delete(T data)
    {
    	//check if list is present or not
    	if(head == null)
    	{
    		System.out.println("list is empty");
    		return;
    	}
    	Node<T> currnNode=head;
    	Node<T> prevNode=null;
    	while(currnNode !=null)
    	{
    		if(currnNode.data == data) {
    			System.out.println("element found:"+currnNode.data+"-delete this element");
    			break;
    		}
    		prevNode=currnNode;
    		currnNode=currnNode.next;
    	}
    	
    	if(currnNode == null)
    	{
    		System.out.println("element not found..");
    		return;
    	}
    	
    	if(currnNode == head)
    	{
    		head=head.next;
    		currnNode=null;
    		return;
    				
    	}
    	else {
    		prevNode.next=currnNode.next;
    		currnNode=null;
    	}
    	
    }
}
