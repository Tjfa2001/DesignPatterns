package Adapter;

public class AdapterMain {

	public static void main(String[] args) {
		
		Printer printer = new FancyPrinterAdapter();
		
		printer.print("Demonstration of the adapter pattern");

	}

}
