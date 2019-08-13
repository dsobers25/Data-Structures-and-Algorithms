package stackpractice;

// children getting on a school bus

public class Stack_v3 implements StackObjInterface2{
	private int top;
	private int size;
	private Child[] childrenBus;
	
	Stack_v3() {
		top = -1;
		size = 20;
		childrenBus = new Child[size];
	}
	
	Stack_v3(int s) {
		top = -1;
		this.size = s;
		childrenBus = new Child[this.size];
	}
	
	public boolean push(String fN, String lN) {
		if(!isFull()) {
			top++;
			childrenBus[top] = new Child(fN,lN);
			return true;
		} else {
			System.out.println("Stack is full. Push could not be executed.");
			return false;
		}
	}
	public String pop() {
		if(!isEmpty()) {
			return childrenBus[top--].toString();
		} else {
			System.out.println("Stack is Empty. Pop could not be executed.");
			return null;
		}
	}
	public boolean isFull() {
		return (top == this.size - 1);
	}
	public boolean isEmpty() {
		return (top == -1);
	}
	
	
}
