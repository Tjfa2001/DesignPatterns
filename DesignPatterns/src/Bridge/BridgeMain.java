package Bridge;

public class BridgeMain {

	public static void main(String[] args) {
		
		System.out.println("Ordering a small espresso: \n");
		
		Espresso esp = new Espresso();
		
		CoffeeOrder smallEspresso = new SmallCoffee(esp);
		
		smallEspresso.drink();
		
		System.out.println("\nOrdering a large latte: \n");
		
		Latte latte = new Latte();
		
		CoffeeOrder largeEspresso = new LargeCoffee(latte);
		
		largeEspresso.drink();
	}

}
