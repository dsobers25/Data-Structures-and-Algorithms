package queuepractice;

public class PersonQueue2 {
	private String name;
	private int age;
	private String favColor;
	
	public PersonQueue2(String n, int a, String f) {
		this.name = n;
		this.age = a;
		this.favColor = f;
	}
	
	@Override
	public String toString() {
		return "Name: " + this.name + " Age: " + this.age + " Favorite Color: " + this.favColor;
	}
}
