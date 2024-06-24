package GenericLinkList;

public class LinkList<T>{
	private Node<T> head;
	private int size;
	public LinkList()
	{
		this.head=null;
		this.size=0;
	}
	
	//node add at first index
	public void addFirst(T data)
	{
		//create a new node
		Node<T> newNode=new Node(data);
		//first we check that list is empty or any data
		//if list is empty then add head=newNode;
		if(head==null)
		{
			head=newNode;
		}
		else
		{
			//then add newNode
			//newNode's next connect to head of old node
			newNode.next=head;
			//now newNode head if first head
			head=newNode;
			
		}
		size++;
		 
		
		
		
	}
	//node add at last 
	public void addLast(T data)
	{
		//create a new node
		Node<T> newNode=new Node(data);
		//and then check list is empty or any othe list node
		//if node is empty then newNode is head
		if(head==null)
		{
			head=newNode;
		}
		else
		{
		//if node is present the traverse the node and find null to add the node
		//create a currnNode which is head
		Node<T> currnNode=head;
		while(currnNode.next!=null)
		{
			currnNode=currnNode.next;
		}
		//if the null is find then
		//add the newNode in the next of currnNode
		currnNode.next=newNode;
		}
		size++;
	}
	//print the list
	public void printList()
	{
		//take a current node and traverse this
		Node<T> currnNode=head;
		//traverse this currnNode and find null
		while(currnNode!=null)
		{
			System.out.print(currnNode.data+"->");
			currnNode=currnNode.next;
		}
		System.out.println("null");
	}
	
	//delete from first
	public void deleteFirst()
	{
		if(head==null)
		{
			System.out.println("list is empty..");
			return;
		}
		size--;
		head=head.next;
	}
	//delete from last
	public void deleteLast()
	{
		if(head==null)
		{
			System.out.println("List is Empty...");
			return;
		}
		size--;
		if(head.next== null)
		{
			head=null;
			return;
		}
		//take a new node that takes head
		Node<T> secondLastNode=head;
		Node<T> LastNode=head.next;
		//traverse the list
		while(LastNode.next!=null)
		{
			LastNode=LastNode.next;
			secondLastNode=secondLastNode.next;
		}
		secondLastNode.next=null;
	}
	
	public int size()
	{
		return size;
	}

}
