package Adapter;

public class FancyPrinter {
	
	public FancyPrinter() {
		
	}
	
	// In theory, legacy code that cannot be altered or similar
	public void display(String message) {
		System.out.println(String.format("I am a fancy printer: %s",message));
	}
}
