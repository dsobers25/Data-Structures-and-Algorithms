
public class Personq {
	private Person[] q;
	private int size;
	private int total;
	private int front;
	private int rear;
	
	public Personq() {
		size = 100;
		total = 0;
		front  = 0;
		rear = 0;
		q = new Person[size];
	}
	public Personq(int size) {
		this.size = size;
		total = 0;
		front = 0;
		rear = 0;
		q = new Person[this.size];
	}
	public boolean enque(Person item) {
		if(isFull()) {
			return false;
		} else {
			total++;
			q[rear] = item;
			rear = (rear + 1) % size;
			return true;
		}
	}
	public Person dequeue() {
		Person item = q[front];
		total--;
		front = (front + 1) % size;
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
				System.out.println(" " + q[f].toString());
				f = (f + 1) % size;
			}
		}
	}
}
