package Command;

import java.util.Arrays;

public class Inventory {
	
	private int capacity;
	private Item[] items;
	private Command add;
	private Command use;
	private Command drop;
	private int cur_index;
	private Item new_item;
	
	public Inventory(int capacity) {
		this.capacity = capacity;
		this.add = new AddItem(this);
		this.drop = new DropItem(this);
		this.use = new UseItem(this);
		this.cur_index = 0;
	}
	
	public boolean init() {
		items = new Item[this.capacity];
		System.out.println(String.format("New inventory with capacity %d created",this.capacity));
		return true;
	}
	
	public void addItem() {
		add.execute();
	}
	
	public void dropItem() {
		drop.execute();
	}
	
	public void useItem() {
		use.execute();
	}
	
	public void left() {
		int new_index = Math.floorMod((this.cur_index - 1),this.capacity);
		this.cur_index = new_index;
	}
	
	public void right() {
		int new_index = Math.floorMod((this.cur_index + 1),this.capacity);
		this.cur_index = new_index;
	}
	
	public Item[] getInventory() {
		return this.items;
	}
	
	public String toString() {
		return Arrays.toString(this.items);
	}
	
	public Item getNewItem() {
		return this.new_item;
	}
	
	public void setNewItem(Item new_item) {
		this.new_item = new_item;
	}
	
	public int getCurIndex() {
		return this.cur_index;
	}
	
	public void setCurIndex(int cur_index) {
		this.cur_index = cur_index;
	}
}
