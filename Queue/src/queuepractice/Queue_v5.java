package queuepractice;

public class Queue_v5 implements QueueDoubleInterface{
	private int total;
	private int size;
	private int front;
	private int rear;
	private double[] q;
	
	Queue_v5() {
		total = 0;
		size = 100;
		front = 0;
		rear = 0;
		q = new double[size];
	}
	
	public Queue_v5(int s) {
		this.total = 0;
		this.size = s;
		this.front = 0;
		this.rear = 0;
		this.q = new double[this.size];
	}
	
	@Override
	public boolean isFull() {
		return (total == size);
	}
	
	@Override
	public boolean isEmpty() {
		return (total == 0);
	}
	
	@Override
	public boolean enqueue(double item) {
		if(!isFull()) {
			total++;
			q[rear] = item;
			rear++;
			return true;
		} else {
			System.out.print("Queu is Full. Enqueue could not be executed. Default value is: ");
			return false;
		}
	}
	@Override
	public double dequeue() {
		if(!isEmpty()) {
			double item = q[front];
			front++;
			total--;
			return item;
		} else {
			System.out.print("Queue is Empty. Dequeue could not be executed. Default value is: ");
			return 0.0;
		}
	}
}
