package Day2Assignment;

public class ResizableArrayStack<T> {
	//generic Array stack
	
	private T[] array;
	private int top;
	
	//constructor
	@SuppressWarnings("unchecked")
	public ResizableArrayStack()
	{
		array=(T[]) new Object[2];//initial capacity 2
		top=0; //number of element in the stack
	}
	
	//check if stack is empty
	public boolean isEmpty()
	{
		return top==0;
	}
	
	//return the number of element in the stack
	public int size()
	{
		return top;
	}
	
	//resize the array
	private void resize(int capacity)
	{
		
		T[] temp=(T[]) new Object[capacity];
		for(int i=0; i<top; i++)
		{
			temp[i]=array[i];
		}
		array=temp;
	}
	
	//push element
	public void push(T item)
	{
		if(top == array.length)
		{
			resize(2*array.length);
		}
		array[top++]=item;
	}
	
	//pop an element from the top
	
	public T pop()
	{
		if(isEmpty())
		{
			throw new IllegalStateException("stack is empty");
		}
		return array[--top];
	}
	
	//peek the element
	public T peek()
	{

		if(isEmpty())
		{
			throw new IllegalStateException("stack is empty");
		}
		return array[top-1];
		
	}

	public static void main(String[] args) {
		ResizableArrayStack<Integer> stack=new ResizableArrayStack<Integer>();
		stack.push(1);
		stack.push(2);
		stack.push(12);
		stack.push(31);
		
		System.out.println("size="+stack.size());
		
		while(!stack.isEmpty())
		{
			System.out.print(stack.peek()+",");
			stack.pop();
		}

	}

}
