package AbstractFactory;

/*
 * File: 			 ExpensiveSuit.java
 * Description:  	 An expensive suit which extends the Suit interface
 * 
 * Author:           Thomas Avant
 * Creation Date:    06/05/2026
 * 
 * Version History:
 * v1.0              First recorded version of the expensive suit class
 */

public class ExpensiveSuit extends Suit{
	
	private double price;
	
	public ExpensiveSuit() {
		// Sets price to 1000 for simplicity
		setPrice(1000);
	}
	
	@Override
	public double getPrice() {
		return this.price;
	}

	@Override
	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public void putOn() {
		System.out.println("I am an expensive suit. You look very smart now");
	}
	
}
