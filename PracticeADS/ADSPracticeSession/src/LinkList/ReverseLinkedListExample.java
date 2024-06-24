package LinkList;

public class ReverseLinkedListExample {
    // create a node
    class Node {
        int data;
        Node next;

        // constructor
        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    Node head;

    // constructor of LinkedList
    public ReverseLinkedListExample() {
        head = null;
    }

    // create a function to addFirst in the list
    public void addFirst(int data) {
        // create a node instance
        Node newNode = new Node(data);
        // if the list is empty, add newNode as the first node
        if (head == null) {
            head = newNode;
        } else {
            // if nodes are present, add the new node at the beginning
            newNode.next = head;
            head = newNode;
        }
    }

    // add node at the last
    public void addLast(int data) {
        // create a newNode
        Node newNode = new Node(data);
        // if the list is empty, add newNode as the first node
        if (head == null) {
            head = newNode;
            return;
        }
        // traverse to the last node
        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    // display all nodes
    public void displayList() {
        Node currNode = head;
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        // traverse all nodes
        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("null");
    }
    
    //reverse the list with iterative method
    public void reverserNode()
    {	
    	//check list is empty or not
    	if(head== null || head.next==null)
    	{
    		return;
    	}
    	
    	Node prevNode=head;
    	Node currNode=head.next;
    	while(currNode !=null)
    	{
    		Node nextNode=currNode.next;
    		//update the nodes
    		currNode.next=prevNode;
    		prevNode=currNode;
    		currNode=nextNode;
    	}
    	head.next=null;
    	head=prevNode;
    	
    }
    //reverse a linklist with recursive method
    public Node recursiveReverse(Node head)
    {
    	//check if the list is empty or only one node then return null or 1st node
    	if(head==null || head.next==null)
    	{
    		return head;
    	}
    	Node newNode=recursiveReverse(head.next);
    	head.next.next=head;
    	head.next=null;
    	return newNode;
    }
    
    //find middle value of linkedlist by turtle(slow) or hare(fast) method
    public Node findMiddle(Node head)
    {
    	if(head==null && head.next == null)
    	{
    		return head;
    	}
    	Node turtle=head;
    	Node hare=head.next;
    	
    	while(hare !=null && hare.next !=null )
    	{
    		 turtle = turtle.next;
    	        hare = hare.next.next;
    	}
    	return turtle;
    }
    

    public static void main(String[] args) {
       ReverseLinkedListExample list = new ReverseLinkedListExample();
        list.addFirst(10);
        list.addFirst(20);
        list.addFirst(50);
        list.addFirst(100);
        list.addLast(40);
        list.addLast(120);
        list.addFirst(110);

        list.displayList(); // Expected output: 20 -> 10 -> 40 -> null
       // list.reverserNode();
        
     // Reverse the linked list recursively
        list.head=list.recursiveReverse(list.head);
        
        list.displayList();
        
        //find middle
        Node middle=list.findMiddle(list.head);
        //System.out.println("Middle value of the linked list:"+middle.data);
        System.out.println("Middle Node: " + (middle != null ? middle.data : "null"));
       
        
    }
}
