package queuepractice;

public interface QueueInterface2 {
	public boolean enqueue(PersonQueue2 p);
	public PersonQueue2 dequeue();
	public boolean isFull();
	public boolean isEmpty();

}
