package AbstractFactory;

public class ExpensiveHat extends Hat{
	
	private double price;
	
	public ExpensiveHat() {
		setPrice(250);
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
	public void putOn() {
		System.out.println("I am an expensive hat and I look very good ;)");
	}

}
