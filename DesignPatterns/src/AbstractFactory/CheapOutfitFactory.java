package AbstractFactory;

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
