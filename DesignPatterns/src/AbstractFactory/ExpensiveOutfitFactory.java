package AbstractFactory;

/*
 * File: 			 ExpensiveOutfitFactory.java
 * Description:  	 Factory to make expensive outfit components, such as hats and suits.
 * 					 Extends from the OutfitFactory class.
 * 
 * Author:           Thomas Avant
 * Creation Date:    06/05/2026
 * 
 * Version History:
 * v1.0              First recorded version of the expensive outfit factory class
 */

public class ExpensiveOutfitFactory extends OutfitFactory{

	@Override
	public Hat makeHat() {
		return new ExpensiveHat();
	}

	@Override
	public Suit makeSuit() {
		return new ExpensiveSuit();
	}

}
