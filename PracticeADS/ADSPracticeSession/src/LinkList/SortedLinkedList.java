package LinkList;

public class SortedLinkedList {

	Node head;
	
	public SortedLinkedList() {
		head=null;
	}
	//add sorted list in the link list
	public void addData(int data)
	{
		Node newNode=new Node(data);
		
		if(head == null)
		{
			head=newNode;
			return;
		}
		
		Node CurrnNode=head;
		Node prevNode=null;
		
		while(CurrnNode!=null)
		{
			if(CurrnNode.data > newNode.data)
				break;
			prevNode=CurrnNode;
			CurrnNode=CurrnNode.next;
		}
		
		if(prevNode == null)
		{
			newNode.next=head;
			head=newNode;
			return;
		}
		
		prevNode.next=newNode;
		newNode.next=CurrnNode;
	}
	
	public void display()
	{
		if(head == null)
		{
			System.out.println("list is empty...");
			return;
		}
		Node currnNode=head;
		while(currnNode !=null)
		{
			System.out.print(currnNode.data+"->");
			currnNode=currnNode.next;
		}
		System.out.println("null");
	}
	//delete at index
	public void delete(int data)
	{
		if(head == null)
		{
			System.out.println("list is empty..");
			return;
		}
		Node currnNode=head;
		Node prevNode=null;
		
		while(currnNode !=null)
		{
			if(currnNode.data == data)
			{
				System.out.println("Element found:"+currnNode.data+":this element is deleted in the list");
				break;
			}
			prevNode=currnNode;
			currnNode=currnNode.next;
		}
		
		if(currnNode == null)
		{
			System.out.println("element not found...");
			return;
		}
		//found in first
		if(currnNode == head)
		{
			head=head.next;
			currnNode=null;
			return;
		}
		else
		{
			//found in any where then
			prevNode.next=currnNode.next;
			currnNode=null;
		}
	}
	
	public static void main(String[] args) {
			SortedLinkedList list=new SortedLinkedList();
			list.addData(10);
			list.addData(20);
			list.addData(5);
			list.addData(13);
			list.addData(8);
		
			list.display();
			
			
			list.delete(10);
			
			list.display();

	}

}
