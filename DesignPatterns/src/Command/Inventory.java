package Command;

public class Inventory {
	
	private int capacity;
	private Item[] items;
	
	public Inventory(int capacity) {
		this.capacity = capacity;
	}
	
	public boolean init() {
		items = new Item[this.capacity];
		System.out.println(String.format("New inventory with capacity %d created",this.capacity));
		return true;
	}
	
}
