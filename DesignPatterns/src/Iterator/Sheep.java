package Iterator;

public class Sheep {
	
	private String name;
	private int age;
	
	public Sheep(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public String toString() {
		return String.format("My name is %s and I am %d", this.name, this.age);
	}
}
