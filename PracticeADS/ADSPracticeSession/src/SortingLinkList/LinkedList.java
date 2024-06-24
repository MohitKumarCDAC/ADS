package SortingLinkList;

public class LinkedList<T> {
	private Node<T> head;
	
	public LinkedList()
	{
		head=null;
	}
	//add last
	public void addLast(T data)
	{
		Node<T> newNode=new Node<T>(data);
		if(head == null)
		{
			head=newNode;
		}
		else
		{
		//travesr from first node to last and find null
		Node<T> currnNode=head;
		while(currnNode.next !=null)
		{
			currnNode=currnNode.next;
		}
		currnNode.next=newNode;
		}
	}
	
	//display all list
	public void display()
	{
		if(head == null)
		{
			System.out.println("list is empty..");
			return;
		}
		Node<T> currnNode=head;
		while(currnNode != null)
		{
			System.out.print(currnNode.data+"->");
			currnNode=currnNode.next;
		}
		System.out.println("null");
	}
	//find middle value
	public Node<T> middle(Node<T> head)
	{
		if(head == null && head.next == null)
		{
			return head;
		}
		Node<T> turtle=head;
		Node<T> hare=head.next;
		while(hare !=null && hare.next !=null)
		{
			turtle=turtle.next;
			hare=hare.next.next;
		}
		return turtle;
	}
	
public static void main(String[] args) {
		
		LinkedList<Integer> list=new LinkedList<Integer>();
		list.addLast(10);
		list.addLast(20);
		list.addLast(30);
		list.addLast(101);
		list.addLast(102);
		
		list.display();
		
		Node<Integer> middle=list.middle(list.head);
		System.out.println("middle:"+middle.data);
		
		System.out.println("----------String----------");
		
		LinkedList<String> strlist=new LinkedList<String>();
		strlist.addLast("aman");
		strlist.addLast("mohit");
		strlist.addLast("mohan");
		strlist.addLast("sohan");
		strlist.addLast("rohan");
		
		strlist.display();
		
		Node<String> middle1=strlist.middle(strlist.head);
		System.out.println("middle:"+middle1.data);

	}
	

}
