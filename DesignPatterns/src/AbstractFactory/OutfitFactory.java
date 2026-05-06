package AbstractFactory;

/*
 * File: 			 AbstractFactory.java
 * Description:  	 Abstract interface used to create, for example:
 * 							* CheapOutfitFactory.java
 * 							* ExpensiveOutfitFactory.java
 * 
 * Author:           Thomas Avant
 * Creation Date:    06/05/2026
 * 
 * Version History:
 * v1.0              First recorded version of the outfit factory class
 */

public abstract class OutfitFactory {
	
	abstract Hat makeHat();
	
	abstract Suit makeSuit();
	
}
