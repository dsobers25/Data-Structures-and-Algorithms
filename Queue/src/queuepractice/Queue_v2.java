package queuepractice;

public class Queue_v2 implements QueueInterface1{
	private int total;
	private int front;
	private int rear;
	private int size;
	private int[] q;
	
	public Queue_v2() {
		total = 0;
		front = 0;
		rear = 0;
		size = 100;
		q = new int[size];
	}
	public Queue_v2(int s) {
		total = 0;
		front = 0;
		rear = 0;
		this.size = s;
		q = new int[this.size];
	}
	
	public boolean enqueue(int item) {
		if(!isFull()) {
			total++;
			q[rear] = item;
			rear = (rear + 1) % size;
			return true;
		} else {
			System.out.println("Queue is Full. Enqueue could not be executed.");
			return false;
		}
	}
	
	public int dequeue() {
		if(!isEmpty()) {
			int item = q[front];
			total--;
			front = (front + 1) % size;
			return item;
		} else {
			System.out.print("\nQueue is Empty. Dequeue could not be executed. Default value is: ");
			return 0;
		}
			
	}
	public boolean isFull() {
		return (size == total);
	}
	
	public boolean isEmpty() {
		return (total == 0);
	}
	public void showAll() {
		if(!isEmpty()) {
			int f = front;
			for(int i = 0; i < size; i++) {
				if(q[f] != 0) {
					System.out.print(q[f] + " ");
					f++;					
				}
			}
		} else {
			System.out.println("Queue is Empty.");
		}
	}
	
}
