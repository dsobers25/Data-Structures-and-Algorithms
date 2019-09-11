public class PersonLinkedList {
	private Node head;
	public PersonLinkedList(Person person) {
		head = new Node();
		head.person = person;
		head.link = null;
	}
	
	public boolean insertItemFirst(Person person) {
		// create a new node
		Node n = new Node();
		// assign the value of the new node to the
		// integer passed to inserItem()
		n.person = person;
		// assign the reference variable to the head
		n.link = head;
		// and change the head to the new node
		head = n;
		return true;
	}
	
	public boolean insertItemLast(Person person) {
		// create a new node
		Node n = new Node();
		// create another new node
		Node new_node = new Node();
		// assign new_node to head
		new_node = head;
		// loop through 
		while(new_node.link != null) {
			new_node = new_node.link;
		}
		n.person = person;
		n.link = null;
		new_node.link = n;
		return true;
	}
	
	// bubble sort alorithm with linked list
//	public void sortList() {
//		int c = 0;
//		Node a = head.link;
//		while(a.link != null) {
//			Node b = head.link;
//			while(b.link != null) {
//				if(b.person < b.link.person) {
//					c = b.person;
//					b.person = b.link.person;
//					b.link.person = c;
//				}
//				b = b.link;
//			}
//			a =  a.link;
//		}
//	}
	
	class Node {
		private Person person;
		private Node link;
	}
	
	public void printList() {
		// calling the second node
		Node z = head;
		while(z != null) {
			System.out.println(z.person.toString());
			z = z.link;
		}
	}
	
	public boolean deleteItem(String name) {
		if(name.equals(head.person.getName())) {
			head.link = head.link.link;
			return true;
		} else {
			Node x = head;
			Node y = head.link;
			while((y != null) && !(y.person.getName().equals(name))) {
					x = y;
					y = y.link;
			}
			if(y != null) {
				x.link = y.link;
				return true;
			} else {
				return false;
			}
		}
	}

}
