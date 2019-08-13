package stackpractice;

public class Stack_v2 implements StackObjInterface{
	private int top;
	private int size;
	private Person[] peopleStack;
	
	Stack_v2() {
		top = -1;
		size = 25;
		peopleStack = new Person[size];		
	}
	
	Stack_v2(int s) {
		top = -1;
		this.size = 25;
		peopleStack = new Person[this.size];		
	}
	
	public boolean push(String n) {
		if(!isFull()) {
			top++;
			peopleStack[top] = new Person(n);
			return true;
		} else {
			System.out.println("Stack is full. Push could not be executed.");
			return false;
		}
	}
	
	public String pop() {
		if(!isEmpty()) {
			return peopleStack[top--].toString();
		} else {
			return "Stack is Empty";
		}
	}
	
	public boolean isFull() {
		return (top == this.size - 1);
	}
	
	public boolean isEmpty() {
		return (top == -1);
	}
	
	
}
