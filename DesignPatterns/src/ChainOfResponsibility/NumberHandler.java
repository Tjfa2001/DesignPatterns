package ChainOfResponsibility;

import java.util.regex.*;

public class NumberHandler extends Handler {
	
	@Override
	public boolean check(String password) {
		Pattern pattern = Pattern.compile("[0-9]+");
		Matcher matcher = pattern.matcher(password);
		boolean match = matcher.find();
		
		if(match) {
			return true;
		}
		else {
			System.out.println("Passwords must contain a numerical character");
			return false;
		}
	}

}
