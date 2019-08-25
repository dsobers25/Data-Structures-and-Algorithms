package queuepractice;
public interface QueueStringInterface {
	public boolean isFull();
	public boolean isEmpty();
	public String dequeue();
	public void enqueue(String item);
}