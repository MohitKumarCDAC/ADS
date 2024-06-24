package LinkList;

import java.util.LinkedList;

public class LinkedListWithCollection {

	public static void main(String[] args) {
		LinkedList<String> list=new LinkedList<String>();
		//add at first(addFirst) or bydefault add
		list.addFirst("a");
		list.addFirst("is");
		list.addFirst("this");
		
		System.out.println(list);
		//add last
		list.addLast("list");
		list.addLast("Example");
		
		System.out.println(list);
		
		//print the list
		for(int i=0; i<list.size(); i++)
		{
			System.out.print(list.get(i)+"->");
		}
		System.out.println("null");
		
		System.out.println("-----delete list--------");
		//remove list node(list.removeLast,list.removeFirst)
		list.removeFirst();
		list.removeLast();
		System.out.println(list);
		
		//print the list
				for(int i=0; i<list.size(); i++)
				{
					System.out.print(list.get(i)+"->");
				}
				System.out.println("null");

	}

}
