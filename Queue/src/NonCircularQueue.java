
public class NonCircularQueue {
	private int[] q;
	private int size;
	private int total;
	private int front;
	private int rear;
	
	public NonCircularQueue() {
		size = 100;
		total = 0;
		front  = 0;
		rear = 0;
		q = new int[size];
	}
	public NonCircularQueue(int size) {
		this.size = size;
		total = 0;
		front = 0;
		rear = 0;
		q = new int[this.size];
	}
	public boolean enqueue(int item) {
		if(isFull()) {
			return false;
		} else {
			total++;
			q[rear] = item;
			rear++;
			return true;
		}
	}
	public int dequeue() {
		int item = q[front];
		total--;
		front++;
		if(item == 0) {
			System.out.print("Queue is Empty. dequeue could not be executed. Default value is: ");
		}
		return item;
	}
	public boolean isFull() {
		if(size == total) {
			return true;
		} else {
			return false;
		}
	}
	
	public void showAll() {
		int f = front;
		if(total != 0) {
			for(int i = 0; i < total; i++) {
				System.out.println(" " + q[f]);
				f = (f + 1) % size;
			}
		}
	}
}
