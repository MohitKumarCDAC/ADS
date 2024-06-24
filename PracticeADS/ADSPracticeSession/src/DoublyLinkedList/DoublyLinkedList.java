package DoublyLinkedList;

public class DoublyLinkedList {
			Node head;
			Node tail;
			
			DoublyLinkedList()
			{
				head=null;
				tail=null;
			}
			
			//add node in the first
			public void addFirst(int data)
			{
				Node newNode=new Node(data);
				if(head == null)
				{
					  head = tail = newNode;
					return;
				}
				newNode.next=head;
				head.prev=newNode;
				head=newNode;
			}
			//add at last
			public void addLast(int data)
			{
				Node newNode=new Node(data);
				if(head == null)
				{
					  head = tail = newNode;
					return;
				}
				else {
		            // Set newNode as the next of current tail
		            tail.next = newNode;
		            // Set the previous of newNode as the current tail
		            newNode.prev = tail;
		            // Update tail to point to newNode
		            tail = newNode;
		        }
			}
			
			//add and any position
			public void addPosition(int position, int data) {
			    Node newNode = new Node(data);

			    // Base case: insert at the beginning
			    if (position == 0) {
			        if (head == null) { // List is empty
			            head = newNode;
			            tail = newNode;
			        } else {
			            newNode.next = head;
			            head.prev = newNode;
			            head = newNode;
			        }
			        return;
			    }

			    // Traverse to the node before the position
			    Node currentNode = head;
			    for (int i = 0; i < position - 1 && currentNode != null; i++) {
			        currentNode = currentNode.next;
			    }

			    // If position is out of bounds
			    if (currentNode == null) {
			        throw new ArrayIndexOutOfBoundsException("Position not found");
			    }

			    // Insert newNode between currentNode and currentNode.next
			    if (currentNode.next == null) {
			        // Insert at the end of the list
			        currentNode.next = newNode;
			        newNode.prev = currentNode;
			        tail = newNode; // Update tail to newNode
			    } else {
			        newNode.next = currentNode.next;
			        newNode.prev = currentNode;
			        currentNode.next.prev = newNode;
			        currentNode.next = newNode;
			    }
			}

			public void display()
			{
				if(head == null)
				{
					System.out.println("list is Empty..");
					return;
				}
				Node currnNode=head;
				while(currnNode !=null)
				{
					System.out.print(currnNode.data+"<->");
					currnNode=currnNode.next;
				}
				System.out.println("null");
			}
			
	public static void main(String[] args) {
		DoublyLinkedList list=new DoublyLinkedList();
		list.addFirst(10);
		list.addFirst(20);
		list.addLast(50);
		list.addFirst(12);
		
		list.addPosition(0, 100);
		list.addPosition(2, 200);
		
		list.display();

	}

}
