package GenericLinkList;

public class LinkListTest {

	public static void main(String[] args) {
		//create instance of LinkList class
		LinkList<Integer> list=new LinkList<>();
		
		list.addFirst(10);
		list.addFirst(20);
		list.addFirst(30);
		
		list.printList();
		
		list.addLast(40);
		list.printList();
		System.out.println("size of list="+list.size());
		
		System.out.println("--------delete----------");
		
		list.deleteFirst();
		list.deleteLast();
		
		list.printList();
		
		System.out.println("size of list="+list.size());
		
		System.out.println("String Operation on List.....");
		//create instance of string type
		LinkList<String> listStr=new LinkList<String>();
		listStr.addFirst("deepak");
		listStr.addLast("mohit");
		listStr.addLast("kunal");
		listStr.addFirst("Nishant");
		
		listStr.printList();
		
		System.out.println("------delete----------");
		
		listStr.deleteFirst();
		listStr.deleteLast();
		
		listStr.printList();
		
		System.out.println("size of list="+listStr.size());

	}

}
