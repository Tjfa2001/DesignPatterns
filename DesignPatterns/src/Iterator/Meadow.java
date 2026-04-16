package Iterator;

public class Meadow implements Flock{
	
	private Sheep[] sheep;
	
	public Meadow(Sheep[] sheeps) {
		this.sheep = sheeps;
	}

	@Override
	public Iterator createSheepIterator() {
		return new SheepIterator(sheep);
	}

}
