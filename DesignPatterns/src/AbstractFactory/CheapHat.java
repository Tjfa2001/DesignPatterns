package AbstractFactory;

/*
 * File: 			 CheapHat.java
 * Description:  	 A cheap hat which extends the Hat interface
 * 
 * Author:           Thomas Avant
 * Creation Date:    06/05/2026
 * 
 * Version History:
 * v1.0              First recorded version of the cheap hat class
 */

public class CheapHat extends Hat{
	
	private double price;
	
	public CheapHat() {
		// Set price to 5 for simplicity
		setPrice(5);
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
	void putOn() {
		System.out.println("I'm a cheap hat that has just been put on... don't let other people see me!");
	}

}
