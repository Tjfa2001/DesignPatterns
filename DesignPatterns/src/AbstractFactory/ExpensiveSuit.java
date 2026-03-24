package AbstractFactory;

public class ExpensiveSuit extends Suit{
	
	private double price;
	
	public ExpensiveSuit() {
		setPrice(1000);
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
		System.out.println("I am an expensive suit. You look very smart now");
	}
	
}
