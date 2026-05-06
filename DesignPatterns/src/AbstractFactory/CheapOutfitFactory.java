package AbstractFactory;

/*
 * File: 			 CheapOutfitFactory.java
 * Description:  	 Factory to make expensive outfit components, such as hats and suits.
 * 					 Extends from the CheapFactory class.
 * 
 * Author:           Thomas Avant
 * Creation Date:    06/05/2026
 * 
 * Version History:
 * v1.0              First recorded version of the cheap outfit factory class
 */

public class CheapOutfitFactory extends OutfitFactory{

	@Override
	public Hat makeHat() {
		return new CheapHat();
	}

	@Override
	public Suit makeSuit() {
		return new CheapSuit();
	}

}
