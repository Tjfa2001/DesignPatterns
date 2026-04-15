package Command;

public class Book extends Item {
	
	@Override
	public String toString() {
		return "Book";
	}
	
	public void useItem() {
		System.out.println("Hmmm mmmm quite interesting... hmm");
	}

}
