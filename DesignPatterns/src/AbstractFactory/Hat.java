package AbstractFactory;

/*
 * File: 			 Hat.java
 * Description:  	 Abstract interface used to create, for example:
 * 							* CheapHat.java
 * 							* ExpensiveHat.java
 * 
 * Author:           Thomas Avant
 * Creation Date:    06/05/2026
 * 
 * Version History:
 * v1.0              First recorded version of the hat class
 */

public abstract class Hat {
	
	abstract double getPrice();
	
	abstract void setPrice(double price);
	
	abstract void putOn();
}
