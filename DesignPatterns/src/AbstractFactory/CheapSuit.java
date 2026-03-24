package AbstractFactory;

public class CheapSuit extends Suit{
	
	private double price;
	
	public CheapSuit() {
		setPrice(10);
	}
	
	@Override
	double getPrice() {
		return this.price;
	}

	@Override
	void setPrice(double price) {
		this.price = price;
	}

	@Override
	void putOn() {
		System.out.println("I'm a cheap suit... I'm not very comfy or smart :(");
	}

}
