
public class Main {

	public static void main(String[] args) {
//		IntQ q = new IntQ(4);
//		q.enque(4);
//		q.enque(6);
//		q.enque(3);
//		q.enque(9);
//		q.dequeue();
//		q.dequeue();
//		q.dequeue();
//		q.dequeue();
////		q.dequeue();
////		q.dequeue();
//		q.enque(2838981);
//		q.enque(2838982);
//		q.enque(2838983);
//		
//		q.showAll();
//		
//		// first in first out
////		System.out.println(q.dequeue());
////		System.out.println(q.dequeue());
		
		Personq q = new Personq();
		q.enque(new Person("Deron", "123"));
		q.enque(new Person("Tori", "456"));
//		q.dequeue();
		q.showAll();
		
	}

}
