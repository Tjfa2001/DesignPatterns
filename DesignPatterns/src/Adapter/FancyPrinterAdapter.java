package Adapter;

public class FancyPrinterAdapter implements Printer {
	
	
	private FancyPrinter fancyPrinter;

	public FancyPrinterAdapter() {
		this.fancyPrinter = new FancyPrinter();
	}
	
	@Override
	public void print(String message) {
		this.fancyPrinter.display(message);
	}

}
