package Command;

public class UseItem extends Command {
	
	public UseItem(Inventory inv) {
		super(inv);
	}

	public boolean execute() {
		return true;
	}
}
