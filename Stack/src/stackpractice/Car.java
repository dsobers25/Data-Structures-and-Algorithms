package stackpractice;

public class Car {
	private String make;
	private String model;
	private int year;
	
	Car(String ma, String mo, int yr) {
		this.make = ma;
		this.model = mo;
		this.year = yr;
	}
	
	public String toString() {
		return "This car is a " + this.year + " " + make + " " + model;
	}
}
