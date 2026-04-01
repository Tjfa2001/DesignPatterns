package ChainOfResponsibility;

public class CaseHandler extends Handler {
	
	
	/* Checking that the case matches what is intended */
	
	private Case wordCase;
	
	public CaseHandler(Case wordCase) {
		this.wordCase = wordCase;
	}
	
	@Override
	public boolean check(String password) {
		
		String to_compare;
		
		switch(this.wordCase) {
			case Upper:
				to_compare = password.toUpperCase();
				break;
			case Lower:
				to_compare = password.toLowerCase();
				break;
			case Either:
				to_compare = password;
				break;
			default:
				to_compare = password;
				break;
		}
			
		if(!to_compare.equals(password)) {
			
			System.out.println(String.format("\tPassword must be entirely in %s case",this.wordCase.name().toLowerCase()));
			return false;
		}
		
		System.out.println("\tMet case requirement");
		return checkNext(password);
	}
	
}
