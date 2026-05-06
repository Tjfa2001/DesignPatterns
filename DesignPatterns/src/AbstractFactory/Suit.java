package AbstractFactory;

/*
 * File: 			 Suit.java
 * Description:  	 Abstract interface used to create, for example:
 * 							* CheapSuit.java
 * 							* ExpensiveSuit.java
 * 
 * Author:           Thomas Avant
 * Creation Date:    06/05/2026
 * 
 * Version History:
 * v1.0              First recorded version of the suit class
 */

public abstract class Suit {
	
	abstract double getPrice();
	
	abstract void setPrice(double price);
	
	abstract void putOn();
}
