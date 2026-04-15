package Command;

import java.util.Scanner;

public class CommandMain {

	public static void main(String[] args) {
		
		// Creates an inventory of the capacity passed to the main function or 5 by default
		int capacity = (args.length == 0) ? 5 : Integer.valueOf(args[0]);
		Inventory inventory = new Inventory(capacity);
		inventory.init();
		
		
		// Main user input
		try(Scanner scanner = new Scanner(System.in)){
			
			String input = "";
			
			// Only exit the loop when the user inputs a "Q"
			while(!input.toUpperCase().equals("Q")) {
				
				// Displays options
				System.out.println("Press Q to quit, A to add an item, D to drop an item, U to use an item, L to move selector to left, R to move selector to right");
				
				// Displays the inventory
				System.out.println(inventory.toString());
				System.out.println(inventory.invArrows());
				System.out.println();
				
				// Reads the user's input
				input = scanner.nextLine();
				
				switch(input.toUpperCase()) {
					// Add an item
					case "A":
						String choice = "";
						while(!choice.toUpperCase().equals("F")&&!choice.toUpperCase().equals("S")&&!choice.toUpperCase().equals("B")) {
							System.out.println("Would you like to add a firework (F), a sword (S) or a book (B)?");
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
							case "B":
								newI = new Book();
								break;
							default:
								newI = new Firework();
								break;
						}
						
						// Adds the chosen item to the inventory
						inventory.setNewItem(newI);
						inventory.addItem();
						break;
					// Drop an item	
					case "D":
						inventory.dropItem();
						break;
					// Use the item
					case "U":
						inventory.useItem();
						break;
					// Move the cursor to the left
					case "L":
						inventory.left();
						break;
					// Move the cursor to the right
					case "R":
						inventory.right();
						break;
					// Quit the application
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
