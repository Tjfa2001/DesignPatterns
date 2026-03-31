package ChainOfResponsibility;

public class LengthHandler extends Handler {

	@Override
	public boolean check(String password) {
		if(password.length()<5) {
			System.out.println("Password must be at least 5 characters long");
			return false;
		}
		return checkNext(password);
	}
	
	

}
