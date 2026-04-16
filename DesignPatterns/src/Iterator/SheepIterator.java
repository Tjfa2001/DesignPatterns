package Iterator;

public class SheepIterator implements Iterator{
	
	private Sheep[] sheep;
	private int cur = 0;
	
	public SheepIterator(Sheep[] sheep) {
		this.sheep = sheep;
	}
	
	@Override
	public Sheep getNext() {
		return this.sheep[this.cur++];
	}

	@Override
	public Boolean hasMore() {
		return this.cur < this.sheep.length;
	}
	
}
