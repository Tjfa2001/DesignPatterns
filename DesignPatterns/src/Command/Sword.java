package Command;

public class Sword extends Item {
	
	@Override
	public String toString() {
		return "Sword";
	}
	
	public void useItem() {
		System.out.println("Swish!");
	}
}
