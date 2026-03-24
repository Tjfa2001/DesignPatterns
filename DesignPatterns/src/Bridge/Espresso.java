package Bridge;

public class Espresso implements BrewingMethod{

	@Override
	public void brew() {
		System.out.println("Thank you for ordering an espresso... just brewing it up");
	}

}
