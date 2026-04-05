package Command;

public class DropItem extends Command {

	public DropItem(Inventory inv) {
		super(inv);
	}

	@Override
	public boolean execute() {
		System.out.println("Dropping item");
		int cur_index = this.inventory.getCurIndex();
		if(inventory.getInventory()[cur_index] == null) {
			return false;
		} else {
			inventory.getInventory()[cur_index] = null;
			inventory.left();
		}
		return true;
	}

}
