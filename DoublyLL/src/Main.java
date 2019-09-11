
public class Main {

	public static void main(String[] args) {
		
		// Test 1
		DDList dList = new DDList(6);
		// adding to the end of the list
		dList.insertItem(11);
		dList.insertItem(5);
		dList.insertItem(25);
		dList.printList();
		
		System.out.println();
		dList.deleteItem(25);
		dList.printList();
		
		// Try with tail
		// Try with circular linked list
		// if address of head is equal to address of tail
		// then you have reached the last node
		
		
	}

}
