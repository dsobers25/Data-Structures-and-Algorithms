package queuepractice;
public interface QueueDoubleInterface {
	public boolean isFull();
	public boolean isEmpty();
	public double dequeue();
	public boolean enqueue(double item);
}