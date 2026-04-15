package Command;

public abstract class Command {
	
	public Inventory inventory;
	
	public Command(Inventory inv) {
		this.inventory = inv;
	}
	
	abstract boolean execute();
	
}