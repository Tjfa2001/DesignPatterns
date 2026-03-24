package Bridge;

public class SmallCoffee extends CoffeeOrder {
	
	BrewingMethod method;
	String size;
	
	public SmallCoffee(BrewingMethod method) {
		this.method = method;
		this.size = "small";
	}
	
	@Override
	public void order() {
		this.method.brew();
	}
	
	@Override
	public void drink() {
		order();
		System.out.println(String.format("Mmm I like this %s %s",this.size, this.method.getClass().getSimpleName().toLowerCase()));
	}

}
