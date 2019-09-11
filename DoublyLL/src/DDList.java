
public class DDList {
	private Node head;
	public DDList(int item) {
		head = new Node();
		head.value = item;
		head.prev = null;
		head.next = null;
	}
	
	public boolean insertItem(int item) {
		// create a new node
		Node n = new Node();
		// assign the value of the new node to the
		// integer passed to inserItem()
		n.value = item;
		n.prev = null;
		head.prev = n;
		n.next = head;
		head = n;
		return true;
	}
	
	class Node {
		private int value;
		private Node prev;
		private Node next;
	}
	
	public void printList() {
		Node z = head;
		while(z != null) {
			System.out.println(z.value);
			z = z.next;
		}
	}
	
	public boolean deleteItem(int item) {
		if(head.value == item) {
			head = head.next;
			return true;
		} else {
			Node x = head;
			Node y = head.next;
			while(true) {
				if(y == null || y.value == item) {
					break;
				} else {
					x = y;
					y = y.next;
				}
			}
			if(y != null) {
				x.next = y.next;
				return true;
			} else {
				return false;
			}
		}
	}

}
