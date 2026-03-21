package AbstractFactory;

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
