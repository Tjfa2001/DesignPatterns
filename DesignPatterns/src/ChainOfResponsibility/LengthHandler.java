package ChainOfResponsibility;

public class LengthHandler extends Handler {
	
	/* Checks whether the password is a sufficient length or not */
	
	private int min_length;
	
	public LengthHandler(int min_length) {
		this.min_length = min_length;
	}
	
	@Override
	public boolean check(String password) {
		
		if(password.length() < this.min_length) {
			
			System.out.println(String.format("\tPassword must be at least %d characters long",this.min_length));
			return false;
		}
		
		System.out.println("\tMet length requirement");
		return checkNext(password);
	
	}
}