package AbstractFactory;

public class CheapHat extends Hat{
	
	private double price;
	
	public CheapHat() {
		setPrice(5);
	}
	
	@Override
	public double getPrice() {
		return this.price;
	}

	@Override
	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	void putOn() {
		System.out.println("I'm a cheap hat that has just been put on... don't let other people see me!");
	}

}
