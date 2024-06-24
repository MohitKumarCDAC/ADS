package Queue;

public interface Queue {
		boolean isEmpty();
		boolean isFull();
		void add(int data);
		int remove();
		int peek();
}
