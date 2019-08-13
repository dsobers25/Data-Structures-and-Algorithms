package stackpractice;

public class Child {
	private String firstName;
	private String lastName;
	Child(String f, String l) {
		this.firstName = f;
		this.lastName = l;
	}
	public String toString() {
		return "My name is " + this.firstName + " " + this.lastName;
	}
}
