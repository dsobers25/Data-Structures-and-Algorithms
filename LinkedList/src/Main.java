
public class Main {

	public static void main(String[] args) {
		// this linked list is created with a head node by
		// the constructor
//		IntLinkedList list = new IntLinkedList(8);
//		list.insertItem(3);
//		list.insertItem(83);
//		list.insertItem(9);
//		
//		list.printList();
//		
//		System.out.println("************ Removing item 83 from Linked List ************");
//		
//		list.deleteItem(83);
//		list.printList();
		
		// this linked list is empty at its creation and
		// must have nodes added onto it
		IntLinkedList_v2 list2 = new IntLinkedList_v2();
		list2.insertItemLast(9);
		list2.insertItemLast(7);
		list2.insertItemLast(54);
		list2.insertItemLast(2);
		
		list2.printList();
		System.out.println("************ Removing item 54 from Linked List ************");
		list2.deleteItem(54);
		list2.printList();
	}

}
