package ChainOfResponsibility;

public abstract class Handler {
	
	private Handler next;
	
	public void setNext(Handler next) {
		this.next = next;
	}
	
	static Handler joinUp(Handler first, Handler... rest) {
		Handler head = first;
		for(Handler next: rest) {
			head.setNext(next);
			head = head.next;
		}
		return first;
	}
	
	public abstract boolean check(String password);
	
	protected boolean checkNext(String password) {
		if(next==null) {
			System.out.println("\tPassed all checks! Yippee!");
			return true;
		} else {
			return next.check(password);
		}
	}
	
	protected int getNumHandlers() {
		int count = 1;
		Handler temp = this.next;
		while(temp != null) {
			count++;
			temp = temp.next;
		}
		return count;
	}
}
