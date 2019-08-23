package queuepractice;

public class Queue_v1 implements QueueInterface1{
	private int q[];
	private int size;
	private int total;
	private int front;
	private int rear;
	
	Queue_v1() {
		size = 10;
		total = 0;
		front = 0;
		rear = 0;
		q = new int[size];
	}
	
	public Queue_v1(int s) {
		this.size = s;
		total = 0;
		front = 0;
		rear = 0;
		q = new int[this.size];
	}
	
	public boolean enqueue(int item) {
		if(isFull()) {
			System.out.print("Queue is full. Enqueue could not be executed");
			return false;
		} else {
			total++;
			q[rear] = item;
			rear++;
			return true;
		}
	}
	
	public int dequeue() {
		if(isEmpty()) {
			System.out.print("Queue is Empty. Dequeue could not be executed. Default value is: ");
			return total;
		} else {
			int item = q[front];
			total--;
			front++;
			return item;
		}
	}
	
	public boolean isEmpty() {
		return (total == 0);
	}
	public boolean isFull() {
		return (size == total);
	}

	public void traverseQ2() {
		int f = front;
		if(!isEmpty()) {
			for(int i = 0; i < total; i++) {
				if (i == 0) {
					System.out.print("Remaining elements: ");					
				}
				System.out.print(q[f] + " ");
				f++;
			}
		}
		
	}
	

}
