package Iterator;

public class IteratorMain {

	public static void main(String[] args) {
		
		Sheep sheep1 = new Sheep("Angus",5);
		Sheep sheep2 = new Sheep("Thomas",24);
		Sheep sheep3 = new Sheep("Patrick",1);
		Sheep sheep4 = new Sheep("Briana",24);
		Sheep sheep5 = new Sheep("Boobada",10);
		
		Sheep[] sheeps = {sheep1,sheep2,sheep3,sheep4,sheep5};
		
		Flock meadow = new Meadow(sheeps);
		Iterator iter = meadow.createSheepIterator();
		
		while(iter.hasMore()) {
			System.out.println(iter.getNext());
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}	

	}

}
