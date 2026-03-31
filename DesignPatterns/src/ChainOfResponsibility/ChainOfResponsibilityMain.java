package ChainOfResponsibility;

public class ChainOfResponsibilityMain {

	public static void main(String[] args) {
		Handler handler1 = new LengthHandler();
		Handler handler2 = new CaseHandler();
		Handler handler3 = new NumberHandler();
		
		Handler handler = Handler.joinUp(handler1, handler2, handler3);
		
		boolean pass = handler.check("abcd56f");
		System.out.println(pass);
		
		System.out.println(handler.getNumHandlers());
		
		
	}

}
