package Command;

public class AddItem extends Command{

	public AddItem(Inventory inv) {
		super(inv);
	}

	@Override
	public boolean execute() {
		Item[] inventory = this.inventory.getInventory();
		int i = 0;
		while(i < inventory.length) {
			if(inventory[i]==null) {
				inventory[i] = this.inventory.getNewItem();
				if(inventory[this.inventory.getCurIndex()] == null) {
					this.inventory.setCurIndex(i);
				}
				return true;
			}
			i++;
		}
		return false;
	}

}
