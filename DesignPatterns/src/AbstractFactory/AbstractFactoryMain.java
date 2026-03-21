package AbstractFactory;

import java.util.Scanner;

public class AbstractFactoryMain {

	public static void main(String[] args) {
		
		// Initialise a scanner to take user input from the command line
		Scanner scanner = new Scanner(System.in);
		
		// Find out whether the person is rich or poor (inferred)
		System.out.println("Are you rich? [Y/N]");
		String response = scanner.next();
		scanner.close();
		
		OutfitFactory factory = null;
		
		// Checks what the user has input
		if(response.toUpperCase().equals("Y")) {
			
			factory = new ExpensiveOutfitFactory();
			
		} else if (response.toUpperCase().equals("N")) {
			
			factory = new CheapOutfitFactory();
			
		} else {
			// If the input was not y, Y, n or N, exit with status 1 
		    System.exit(1);
		}
		
		// Make hat and suit
		Hat hat = factory.makeHat();
		Suit suit = factory.makeSuit();
		
		// Put the outfit together
		hat.putOn();
		suit.putOn();
		
		// Retrieve the cost of the entire outfit
		double totalCost = hat.getPrice() + suit.getPrice();
		
		System.out.println(String.format("The cost of your outfit is £%,.2f", totalCost));
	}

}
