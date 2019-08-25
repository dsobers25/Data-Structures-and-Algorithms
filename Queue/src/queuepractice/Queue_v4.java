package queuepractice;


public class Queue_v4 implements QueueStringInterface{
	private int front;
	private int rear;
	private int total;
	private int size;
	private String[] queue;
	
	Queue_v4() {
		front = 0;
		rear = 0;
		total = 0;
		size = 10;
		queue = new String[size];
	}
	
	public Queue_v4(int s) {
		this.front = 0;
		this.rear = 0;
		this.total = 0;
		this.size = s;
		queue = new String[this.size];
	}
	
	public boolean isFull() {
		return (total == size);
	}
	
	public boolean isEmpty() {
		return (total == 0);
	}
	
	public void enqueue(String item) {
		if(!isFull()) {
			total++;
			queue[rear] = item;
			rear++;
		} else {
			System.out.println("Queue is Full. Enqueue could not be executed.");
		}
	}
	
	public String dequeue() {
		if(!isEmpty()) {
			String item = queue[front];
			total--;
			front++;
			return item;
		} else {
			System.out.print("Queue is Empty. Dequeue could not be executed. Default value == ");
			return null;
		}
	}

}
