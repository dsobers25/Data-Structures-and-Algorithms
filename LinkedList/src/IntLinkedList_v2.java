public class IntLinkedList_v2 {
	private Node head;
	public IntLinkedList_v2() {
		head = new Node();
		head.value = 0;
		head.link = null;
	}
	
	public boolean insertItemFirst(int item) {
		Node n = new Node();
		n.value = item;
		n.link = head;
		head = n;
		return true;
	}
	
	public boolean insertItemLast(int item) {
		Node n = new Node();
		Node new_node = new Node();
		new_node = head;
		while(new_node.link != null) {
			new_node = new_node.link;
		}
		n.value = item;
		n.link = null;
		new_node.link = n;
		return true;
	}
	
	class Node {
		private int value;
		private Node link;
	}
	
	public void printList() {
		// calling the second node
		Node z = head.link;
		while(z != null) {
			System.out.println(z.value);
			z = z.link;
		}
	}
	
	public boolean deleteItem(int item) {
		if(head.link.value == item) {
			head.link = head.link.link;
			return true;
		} else {
			Node x = head;
			Node y = head.link;
			while(true) {
				if(y == null || y.value == item) {
					break;
				} else {
					x = y;
					y = y.link;
				}
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
