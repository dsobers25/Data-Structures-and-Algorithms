package stackpractice;

public class Main {

	public static void main(String[] args) {
		// Test one
//		Stack_v1  stacky = new Stack_v1(99);
//		
//		stacky.push(1);
//		stacky.push(2);
//		stacky.push(3);
//		stacky.push(4);
//		
//		System.out.println(stacky.pop());
//		System.out.println(stacky.pop());
//		System.out.println(stacky.pop());
//		System.out.println(stacky.pop());
//		System.out.println(stacky.pop());
		
		
		// Test two
//		Stack_v2 s = new Stack_v2(20);
//		
//		s.push("James");
//		s.push("Deron");
//		s.push("Ross");
//		s.push("Tony");
//		s.push("Terrance");
//		s.push("Alfred");
//		
//		System.out.println(s.pop());
//		System.out.println(s.pop());
//		System.out.println(s.pop());
//		System.out.println(s.pop());
//		System.out.println(s.pop());
//		System.out.println(s.pop());
//		System.out.println(s.pop());
//		System.out.println(s.pop());
		
		// Test three
//		Stack_v3 busStack = new Stack_v3(30);
//		
//		busStack.push("Deron", "Sobers");
//		busStack.push("Glenn", "Brown");
//		busStack.push("Unitra", "Williams");
//		busStack.push("Emerald", "Sobers");
//		busStack.push("A'Tori", "Sobers");
//		
//		System.out.println(busStack.pop());
//		System.out.println(busStack.pop());
//		System.out.println(busStack.pop());
//		System.out.println(busStack.pop());
//		System.out.println(busStack.pop());
//		System.out.println(busStack.pop());
		
		// Test four
//		Stack_v4 groceryList = new Stack_v4(25);
//		
//		groceryList.push("apples");
//		groceryList.push("bananas");
//		groceryList.push("grapes");
//		groceryList.push("brocoli");
//		groceryList.push("oatmeal");
//		
//		System.out.println(groceryList.pop());
//		System.out.println(groceryList.pop());
//		System.out.println(groceryList.pop());
//		System.out.println(groceryList.pop());
//		System.out.println(groceryList.pop());
//		System.out.println(groceryList.pop());
		
		// Test five
		Stack_v5 garage = new Stack_v5(50);
		
		Car myCar = new Car("Ford", "Fusion", 2008);
		Car toriCar = new Car("Honda", "Civic", 2013);
		Car oldCar = new Car("Honda", "Accord", 2001);
		Car dreamCar = new Car("Tesla", "X", 2019);
		
		garage.push(myCar);
		garage.push(toriCar);
		garage.push(oldCar);
		garage.push(dreamCar);
		
		System.out.println(garage.pop());
		System.out.println(garage.pop());
		System.out.println(garage.pop());
		System.out.println(garage.pop());
		System.out.println(garage.pop());
		
		
		
		

	}

}
