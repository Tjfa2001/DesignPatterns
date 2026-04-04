package Command;

public class CommandMain {

	public static void main(String[] args) {

		int capacity = (args.length == 0) ? 5 : Integer.valueOf(args[0]);
		
		Inventory inventory = new Inventory(capacity);
		
		inventory.init();

	}

}
