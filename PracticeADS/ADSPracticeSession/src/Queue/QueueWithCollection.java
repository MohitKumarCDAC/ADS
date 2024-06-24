package Queue;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class QueueWithCollection {

	public static void main(String[] args) {
	Queue<Integer> queue=new LinkedList<Integer>();
//	Queue<Integer> queue=new ArrayDeque<Integer>()
	
	queue.add(1);
	queue.add(3);
	queue.add(2);
	System.out.println(queue);
	
	//and now pop the queue data
	while(!queue.isEmpty())
	{
		System.out.println(queue.peek());
		queue.remove();
	}

	}

}
