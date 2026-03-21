
package Factory;

import java.util.Scanner;

public class FactoryMain {

	public static void main(String[] args) {
		int sides;
		Shape shape = null;
		
		System.out.println("How many sides do you have?");
		Scanner scanner = new Scanner(System.in);
		
		sides = scanner.nextInt();
		scanner.close();
		System.out.println(String.format("You have stated %d sides",sides));
		
		if(sides == 3) {
			shape = new Triangle(5,6);
		} else if (sides == 4) {
			shape = new Rectangle(5,5);
		}

		shape.getDimensions();
		shape.getArea();
	}

}
