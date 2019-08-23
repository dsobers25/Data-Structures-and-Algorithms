package queuepractice;

public class Queue_v3 implements QueueInterface2{
	private int size;
	private int front;
	private int rear;
	private int total;
	private PersonQueue2[] q;
	
	Queue_v3() {
		size = 10;
		front = 0;
		rear = 0;
		total = 0;
		q = new PersonQueue2[size];
	}
	
	public Queue_v3(int s) {
		this.size = s;
		front = 0;
		rear = 0;
		total = 0;
		q = new PersonQueue2[this.size];
	}
	
	public boolean isEmpty() {
		return (total == 0);
	}
	
	public boolean isFull() {
		return (size == total);
	}
	
	public boolean enqueue(PersonQueue2 p) {
		if(!isFull()) {
			total++;
			q[rear] = p;
			rear++;
			return true;
		} else {
			System.out.println("Queue is Full.");
			return false;
		}
	}
	
	public PersonQueue2 dequeue() {
		if(!isEmpty()) {
			PersonQueue2 fp = q[front];
			front++;
			total--;
			return fp;
		} else {
			System.out.print("Queue is Empty. Default value is: ");
			return null;
		}
	}

}
