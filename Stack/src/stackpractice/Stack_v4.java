package stackpractice;

public class Stack_v4 implements StackInterfaceWithString{
	int top;
	int size;
	String[] stack;
	
	Stack_v4() {
		top = -1;
		size = 20;
		stack = new String[size];
	}
	
	Stack_v4(int s) {
		top = -1;
		this.size = s;
		stack = new String[this.size];
	}
	
	public boolean push(String str) {
		if(!isFull()) {
			top++;
			stack[top] = str;
			return true;
		} else {
			System.out.print("Stack is full. Push could not be executed. Value returned is: ");
			return false;
		}
	}
	
	public String pop() {
		if(!isEmpty()) {
			return stack[top--];
		} else {
			System.out.print("Stack is empty. Pop could not be executed. Value returned is: ");
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
