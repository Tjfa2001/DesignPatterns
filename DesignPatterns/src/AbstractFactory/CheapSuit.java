package AbstractFactory;

/*
 * File: 			 CheapSuit.java
 * Description:  	 A cheap suit which extends the Suit interface
 * 
 * Author:           Thomas Avant
 * Creation Date:    06/05/2026
 * 
 * Version History:
 * v1.0              First recorded version of the cheap suit class
 */

public class CheapSuit extends Suit{
	
	private double price;
	
	public CheapSuit() {
		// Sets price to 10 for simplicity
		setPrice(10);
	}
	
	@Override
	double getPrice() {
		return this.price;
	}

	@Override
	void setPrice(double price) {
		this.price = price;
	}

	@Override
	void putOn() {
		System.out.println("I'm a cheap suit... I'm not very comfy or smart :(");
	}

}
