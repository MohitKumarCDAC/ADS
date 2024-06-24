package LinkList;

public class LinkListImpl implements LinkList {
	
	//create node
	class Node{
		String data;
		Node next;
		//constructor
		Node(String data)
		{
			this.data=data;
			next=null;
			size++;
		}
		
	}
	private int size;
	
	Node head;
	Node tail;
	public  LinkListImpl()
	{
		this.size=0;
		head=null;
		tail=null;
	}

	@Override
	public void addAtFirst(String data) {
		//create a node
		Node newNode=new Node(data);
		//then we check list is empty or not
		if(isEmpty())
		{
			head=newNode;
			return;
		}
		newNode.next=head;
		head=newNode;

	}

	@Override
	public void addAtLast(String data) {
		Node newNode=new Node(data);
		if(isEmpty())
		{
			head=newNode;
			return;
		}
		//traverse the node
		Node currnode=head;
		while(currnode.next !=null)
		{
			currnode=currnode.next;
		}
		currnode.next=newNode;

	}

	@Override
	public void display() {
		Node currnode=head;
		if(head == null)
		{
			System.out.println("list is empty:");
			return;
		}
		while(currnode != null)
		{
			System.out.print(currnode.data+"->");
			currnode=currnode.next;
		}
		System.out.println("null");

	}

	@Override
	public boolean isEmpty() {
		if(head == null)
		{
			return true;
		}
		return false;
	}
	@Override
	public void deleteAtFirst() {
		if(isEmpty())
		{
			System.out.println("list is empty");
			return;
		}
		size--;
		head=head.next;
		
	}

	@Override
	public void deleteAtLast() {
		if(isEmpty())
		{
			System.out.println("list is empty");
			return;
		}
		size--;
		if(head.next== null)
		{
			head=null;
			return;
		}
	Node secondLast=head;
	Node lastNode=head.next;
	
	
	//traverse
	while(lastNode.next!=null)
	{
		lastNode=lastNode.next;
		secondLast=secondLast.next;
	}
	secondLast.next=null;
	}
	
	public int getSize()
	{
		return size;
	}

	
	

	public static void main(String[] args) {
		//create instance of class
		LinkListImpl list=new LinkListImpl();
		
		list.addAtFirst("a");
		list.addAtFirst("is");
		list.display();
		list.addAtLast("list");
		list.display();
		list.addAtFirst("this");
		list.display();
		
		System.out.println("-----------Delete Operation------------");
		
		//delete at first
		list.deleteAtFirst();
		list.display();
		
		//delete at last
		list.deleteAtLast();
		list.display();
		
		System.out.println("-------------size of list-----------");
		
		System.out.println("Size of list::"+list.getSize());

	}

	
}
