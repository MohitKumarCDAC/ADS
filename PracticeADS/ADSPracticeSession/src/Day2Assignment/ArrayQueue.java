package Day2Assignment;

public class ArrayQueue<T> {
	
	private T[] array;
	private int front;
	private int rear;
	private int size;
	private int capacity;
	
	//constructor
	public ArrayQueue(int capacity)
	{
		this.capacity=capacity;
		front=0;
		rear=-1;
		size=0;
		array=(T[]) new Object[capacity];
	}
//check if the queue is empty
	public boolean isEmpty()
	{
		return size==0;
	}
	
	//check if the queue is full
	public boolean isFull()
	{
		return size==capacity;
	}
	
	//size
	public int size()
	{
		return size;
	}
   // add 
	public void enqueue(T item)
	{
		if(isFull())
		{
			throw new QueueFullException("Queue is full..");
		}
		rear++;
		array[rear]=item;
		size++;
	}
	//remove the item
	public T dequeue()
	{
		if(isEmpty())
		{
			throw new QueueEmptyException("Queue is Empty..");
		}
		T front=array[0];
		for(int i=0; i<rear; i++)
		{
			array[i]=array[i+1];
		}
		rear--;
		size--;
		return front;
		
	}
	
	//peek element
	public T peek()
	{
		if(isEmpty())
		{
			throw new QueueEmptyException("Queue is Empty..");
		}
		return array[front];
	}
	
	public static void main(String[] args) {
		
			ArrayQueue<Integer> queue=new ArrayQueue<Integer>(5);
			queue.enqueue(10);
			queue.enqueue(20);
			queue.enqueue(30);
			queue.enqueue(40);
			
			System.out.println("size="+queue.size());
			
			while(!queue.isEmpty())
			{
				System.out.print(queue.peek()+",");
				queue.dequeue();
			}
			
	}

}
