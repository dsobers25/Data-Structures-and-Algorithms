
public class Main {

	public static void main(String[] args) {
		IntStack intStack = new IntStack();
//		if (!intStack.isFull()) {
//			intStack.push(2);
//			intStack.push(8);
//			intStack.push(9);
//			intStack.push(5);
//			intStack.push(7);
//		}
//		
//		System.out.println(intStack.pop());
//		System.out.println(intStack.pop());
//		System.out.println(intStack.pop());
//		System.out.println(intStack.pop());
//		System.out.println(intStack.pop());
		
		Person person1 = new Person("Deron", "001");
		
		Person person2 = new Person("Darren", "002");
		
		PersonStack stack = new PersonStack();
		
		stack.push(person1);
		stack.push(person2);
		
		// first in last out
		System.out.println(stack.pop().toString());
		System.out.println(stack.pop().toString());

	}

}
