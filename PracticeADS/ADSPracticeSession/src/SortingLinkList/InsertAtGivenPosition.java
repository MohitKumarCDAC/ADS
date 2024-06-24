package SortingLinkList;

public class InsertAtGivenPosition<T> {
	Node<T> head;
	
	public InsertAtGivenPosition() {
		head=null;
	}
	
	public void insertAtPosition(int position, T data)
	{
		Node<T> newNode=new Node<T>(data);
		
		if(position == 0)
		{
			newNode.next=head;
			head=newNode;
			return;
		}
		
		Node<T> currnNode=head;
		for(int i=0; i<position-1; i++)
		{
			if(currnNode == null)
			{
				 throw new IndexOutOfBoundsException("Position out of bounds");
			}
			currnNode=currnNode.next;	
		}
		newNode.next=currnNode.next;
		currnNode.next=newNode;
	}
	
	//display
	public void displayList()
	{
		if(head == null)
		{
			System.out.println("Empty list...");
			return;
		}
		
		Node<T> currNode=head;
		
		while(currNode!=null)
		{
			System.out.print(currNode.data+"->");
			currNode=currNode.next;
		}
		System.out.println("null");
	}

	public static void main(String[] args) {
		InsertAtGivenPosition<Integer> list=new InsertAtGivenPosition<Integer>();
		
		list.insertAtPosition(0, 10);
		list.insertAtPosition(1, 20);
		list.insertAtPosition(1, 30);
		list.insertAtPosition(0,50);
		list.displayList();

	}

}
