package Command;

import java.util.Scanner;

public class CommandMain {

	public static void main(String[] args) {

		int capacity = (args.length == 0) ? 5 : Integer.valueOf(args[0]);
		
		Inventory inventory = new Inventory(capacity);
		
		inventory.init();
		
		try(Scanner scanner = new Scanner(System.in)){
			String input = "";
			while(!input.toUpperCase().equals("Q")) {
				
				System.out.println("Press Q to quit, A to add an item, D to drop an item, U to use an item, L to move selector to left, R to move selector to right");
				System.out.println(String.format("Current Item Selected: %d", inventory.getCurIndex()));
				System.out.println(inventory.toString());
				System.out.println();
				
				input = scanner.nextLine();
				
				switch(input.toUpperCase()) {
					case "A":
						String choice = "";
						while(!choice.toUpperCase().equals("F")&&!choice.toUpperCase().equals("S")) {
							System.out.println("Would you like to add a firework (F) or a sword (S)?");
							choice = scanner.nextLine();
						}
						
						Item newI = null;
						
						switch(choice.toUpperCase()) {	
							case "F":
								newI = new Firework();
								break;
							case "S":
								newI = new Sword();
								break;
							default:
								newI = new Firework();
								break;
						}
						inventory.setNewItem(newI);
						inventory.addItem();
					
						break;
					case "D":
						inventory.dropItem();
						break;
					case "U":
						inventory.useItem();
						break;
					case "L":
						inventory.left();
						break;
					case "R":
						inventory.right();
						break;
					case "Q":
						System.out.println("Exiting");
						break;
					default:
						break;
					
				}
			}
		};	
	}
}
