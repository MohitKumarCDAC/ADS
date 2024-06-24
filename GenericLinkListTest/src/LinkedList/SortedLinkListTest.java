package LinkedList;

public class SortedLinkListTest {

	public static void main(String[] args) {
		SortedLinkedList<Integer> list=new SortedLinkedList<Integer>();
		
		list.addNode(10);
		list.addNode(5);
		list.addNode(20);
		list.addNode(15);
		list.addNode(13);
		
		list.displayList();
		
        list.reverseList();
	    list.displayList();
	    
	    Node<Integer> middle=list.findMiddle(list.head);
	    System.out.println("middle value is="+middle.data);
	    
	    
	    System.out.println();
	    System.out.println("delete the list element.....");
	    list.delete(15);
	    list.delete(5);
	    list.delete(13);
	    
	    list.displayList();
	}
	

}
