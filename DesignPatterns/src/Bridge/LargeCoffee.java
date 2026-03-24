package Bridge;

public class LargeCoffee extends CoffeeOrder {

	BrewingMethod method;
	String size;
	
	public LargeCoffee(BrewingMethod method) {
		this.method = method;
		this.size = "large";
	}
	
	@Override
	public void order() {
		this.method.brew();
	}
	
	@Override
	public void drink() {
		order();
		System.out.println(String.format("Wow! I quite like this %s %s",this.size,this.method.getClass().getSimpleName().toLowerCase()));
	}

}
