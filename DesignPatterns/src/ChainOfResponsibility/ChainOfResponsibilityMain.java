package ChainOfResponsibility;

public class ChainOfResponsibilityMain {

	public static void main(String[] args) {
		Handler handler1 = new LengthHandler(5);
		Handler handler2 = new CaseHandler(Case.Upper);
		Handler handler3 = new NumberHandler();
		
		Handler handler = Handler.joinUp(handler1, handler2, handler3);
		
		String[] passwords = new String[4];
		passwords[0] = "ThisPasswordIsNotAllowed4";
		passwords[1] = "123";
		passwords[2] = "Anotherbadpa4sword";
		passwords[3] = "corr3ctp4ssword";
		
		for(String pw: passwords) {
			System.out.println(String.format("Testing password: %s",pw));
			handler.check(pw);
			System.out.println();
		}
		
	}

}
