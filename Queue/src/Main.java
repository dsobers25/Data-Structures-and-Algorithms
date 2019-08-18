import queuepractice.Queue_v1;
import queuepractice.Queue_v2;

public class Main {

	public static void main(String[] args) {
		// Test 1
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
		// Test 2
//		Personq q = new Personq();
//		q.enque(new Person("Deron", "123"));
//		q.enque(new Person("Tori", "456"));
//		q.dequeue();
//		q.showAll();
		
		// Test 3
//		NonCircularQueue n = new NonCircularQueue();
//		
//		n.enqueue(78);
//		n.enqueue(9);
//		n.enqueue(7);
//		n.enqueue(8);
//		n.enqueue(33);
//
//	System.out.println(n.dequeue());
//	System.out.println(n.dequeue());
//	System.out.println(n.dequeue());
//	System.out.println(n.dequeue());
//	System.out.println(n.dequeue());
//	n.enqueue(1);
//	System.out.println(n.dequeue());
		
		// Test 4
//		Queue_v1 queue = new Queue_v1(7);
//		
//		queue.enqueue(8);
//		queue.enqueue(9238);
//		queue.enqueue(92);
//		queue.enqueue(1);
//		queue.enqueue(100);
//		queue.enqueue(5);
//		
//		System.out.println("******************* before dequeue *******************");
//		queue.traverseQ2();
//		System.out.println("\n******************* after dequeue *******************\n");
//		System.out.println("Dequeued Element: " + queue.dequeue());
//		queue.traverseQ2();
//		System.out.println("\nDequeued Elements: " + queue.dequeue() + " " + queue.dequeue());
//		queue.traverseQ2();
		
		// Test 5
		
		Queue_v2 queue = new Queue_v2(7);
		queue.enqueue(7);
		queue.enqueue(3);
		queue.enqueue(14);
		queue.enqueue(9);
		queue.enqueue(1000);
		queue.enqueue(78);
		
		System.out.println("\n******************* before dequeue *******************\n");
		queue.showAll();
		System.out.println();
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		System.out.println("\n******************* after dequeue *******************\n");
		queue.showAll();
	}

}
