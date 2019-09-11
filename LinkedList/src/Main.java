
public class Main {

	public static void main(String[] args) {
		// Test 1
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
		
		
		// Test 2
		// this linked list is empty at its creation and
		// must have nodes added onto it
//		IntLinkedList_v2 list2 = new IntLinkedList_v2();
//		list2.insertItemLast(2);
//		list2.insertItemLast(7);
//		list2.insertItemLast(9);
//		list2.printList();
//		list2.sortList();
//		System.out.println("After sorting list...");
//		list2.printList();
		
		// Test 3
		Person person1 = new Person("deron", "123");
		Person person2 = new Person("atori", "973");
		
		PersonLinkedList list = new PersonLinkedList(person1);
		list.insertItemLast(person2);
		list.printList();
		
		
	}

}
