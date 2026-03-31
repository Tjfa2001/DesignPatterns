package ChainOfResponsibility;

public class CaseHandler extends Handler {

	@Override
	public boolean check(String password) {
		if(!password.toLowerCase().equals(password)) {
			System.out.println("Password must be entirely in lower case");
			return false;
		}
		return checkNext(password);
	}
	
}
