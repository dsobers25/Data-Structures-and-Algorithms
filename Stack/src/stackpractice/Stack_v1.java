package stackpractice;

public class Stack_v1 implements StackInterface{
	private int top;
	private int size;
	private int[] stack;
	
	Stack_v1() {
		top = -1;
		size = 25;
		stack = new int[size];
	}
	
	Stack_v1(int s) {
		top = -1;
		this.size = s;
		stack = new int[this.size];
	}
	
	public boolean push(int item) {
		if(!isFull()) {
			top++;
			stack[top] = item;
			return true;
		} else {
			System.out.println("Stack is Full. Push can not be executed.");
			return false;
		}
	}
	
	public int pop() {
		if(!isEmpty()) {
			return stack[top--];
		} else {
			System.out.print("Stack is Empty. Pop can not be executed. Defalut Return is: ");
			return 0;
		}
	}
	
	public boolean isFull() {
		return (top == this.size -1);
	}
	
	public boolean isEmpty() {
		return (top == -1);
	}

}
