package AbstractFactory;

/*
 * File: 			 ExpensiveHat.java
 * Description:  	 An expensive hat which extends the Hat interface
 * 
 * Author:           Thomas Avant
 * Creation Date:    06/05/2026
 * 
 * Version History:
 * v1.0              First recorded version of the expensive hat class
 */

public class ExpensiveHat extends Hat{
	
	private double price;
	
	public ExpensiveHat() {
		// Sets price to 250 for simplicity
		setPrice(250);
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
		System.out.println("I am an expensive hat and I look very good ;)");
	}

}
