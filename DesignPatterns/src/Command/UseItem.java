package Command;

public class UseItem extends Command {
	
	public UseItem(Inventory inv) {
		super(inv);
	}

	public boolean execute() {
		int i = this.inventory.getCurIndex();
		Item[] inv = this.inventory.getInventory();
		Item item_to_use = inv[i];
		item_to_use.useItem();
		return true;
	}
}
