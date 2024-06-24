package Queue;

import Day2Assignment.QueueEmptyException;
import Day2Assignment.QueueFullException;

public class QueueImpl implements Queue{
	//in queue we add data from rear and delete data from front
	//if front and rear is in same position then queue is empty
	//if rear=lengthofqueue-1 the queue is full
	
	private int front;
	private int rear;
	private int[] queue;
	private int size;
	//constructor 
	public QueueImpl(int size)
	{
		this.size=size;
		//initialize the size of queue array
		queue=new int[size];
		//set rear and front is -1 that means queue is empty
		this.rear=-1;
		this.front=-1;
	}

	@Override
	public boolean isEmpty() {
		//queue is empty when rear and front is in same place
		if(front == rear)
		{
			return true;
		}
		return false;
	}

	@Override
	public boolean isFull() {
		if(rear== queue.length-1) {
		return true;
	}
	return false;
	}

	@Override
	public void add(int data) {
		if(isFull())
		{
			throw new QueueFullException("Queue is Full....");
		}
		rear++;
		queue[rear]=data;
		
	}

	@Override
	public int remove() {
		if(isEmpty())
		{
			throw new QueueEmptyException("Queue is Empty........");
		}
		int front =queue[0];
		for(int i=0; i<rear; i++)
		{
			queue[i]=queue[i+1];
		}
		 
		rear--;
		return front;
	}

	@Override
	public int peek() {
		if(isEmpty())
		{
			throw new QueueEmptyException("Queue is Empty........");
		}
		return queue[0];
	}
	
public static void main(String[] args) {
	Queue q=new QueueImpl(5);
	q.add(1);
	q.add(2);
	q.add(3);
	q.add(4);
	q.add(5);
	while(!q.isEmpty())
	{
		System.out.println(q.peek());
		q.remove();
	}

	}

}
