package LinkedList;

public class Node<T extends Comparable<T>> implements Comparable<Node<T>> {
	
	T data;
	Node<T> next;
	
	//constructor
	public Node(T data)
	{
		this.data=data;
		this.next=null;
	}

	@Override
	public int compareTo(Node<T> o) {
		// TODO Auto-generated method stub
		 return this.data.compareTo(o.data);
	}

	

	
	

}
