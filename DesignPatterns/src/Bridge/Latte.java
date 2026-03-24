package Bridge;

public class Latte implements BrewingMethod{

	@Override
	public void brew() {
		System.out.println("Let me make your latte! Yum yum yum");
	}

}
