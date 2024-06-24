package CircularQueue;

public class Queue {
	
		private  int arr[];
		private int size;
		private  int rear;
		private int front;
		
		public Queue(int size)
		{
		 this.size=size;
		 arr=new int[size];
		 //here rear and front -1 means queue is empty
		 this.rear=-1;
		 this.front=-1;
		}
		
		//check isEmpty
		public  boolean isEmpty()
		{
			return rear==-1 && front ==-1;
		}
		
		//check is full
		public  boolean isFull()
		{
			return (rear+1)%size==front;
		}
		
		//enqueue (insert element in the queue)
		public  void add(int data)
		{
			if(isFull())
			{
				System.out.println("Queue is full..");
				return;
			}
			//add first eleemnt
			if(front ==-1)
			{
				front=0;
			}
			rear=(rear+1)%size;
			arr[rear]=data;
		}
		
		//dequeue delete data from queue
		public  int remove()
		{
			if(isEmpty())
			{
				System.out.println("Queue is Empty..");
				return -1;
			}
			int result=arr[front];
			if(rear==front)
			{
				rear=front=-1;
			}
			else
			{
				front=(front+1)%size;
			}
			return result;
		}
		
		//peek the element
		public  int peek()
		{
			if(isEmpty())
			{
				System.out.println("Queue is Empty...");
				return -1;
			}
			return arr[front];
		}
	

	public static void main(String[] args) {
		Queue q=new Queue(6);
		q.add(10);
		q.add(20);
		q.add(30);
		q.add(40);
		q.add(50);
		q.add(60);
		
		//remove the element
		System.out.println("remove first element:"+q.remove());
		//then add element
		q.add(70);
		//remove
		System.out.println("remove first element:"+q.remove());
		//add
		q.add(80);
		
		
		
		//peek and pop the element
		while(!q.isEmpty())
		{
			System.out.println(q.peek());
			q.remove();
		}
		
	}

}
