package stackpractice;

public class Stack_v5 {
	int top;
	int size;
	Car[] stack;
	
	Stack_v5() {
		top = -1;
		size = 20;
		stack = new Car[size];
	}
	
	Stack_v5(int s) {
		top = -1;
		this.size = s;
		stack = new Car[this.size];
	}
	
	public String pop() {
		if(!isEmpty()) {
			return stack[top--].toString();
		} else {
			System.out.print("Stack is Empty. Pop could not be executed. Value returned is: ");
			return null;
		}
	}
	
	public boolean push(Car c) {
		if(!isFull()) {
			top++;
			stack[top] = c;
			return true;
		} else {
			System.out.print("Stack is Full. Push could not be executed. Value returned is: ");
			return false;
		}
	}
	
	public boolean isFull() {
		return (top == this.size - 1);
	}
	
	public boolean isEmpty() {
		return (top == -1);
	}

}
