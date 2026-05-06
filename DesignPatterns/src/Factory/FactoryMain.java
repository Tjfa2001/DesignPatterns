package Factory;

import java.util.Scanner;

/*
 * File: 			 FactoryMain.java
 * Description:  	 Main class for the factory design pattern
 * 
 * Author:           Thomas Avant
 * Creation Date:    06/05/2026
 * 
 * Version History:
 * v1.0              First recorded version of the factory class
 */

public class FactoryMain {

	public static void main(String[] args) throws Exception {
		
		int numSides;
		Shape shape = null;
		
		// For simplicity, assumed that possible inputs are 3 and 4 only
		System.out.println("How many sides do you have?");
		Scanner scanner = new Scanner(System.in);
		
		numSides = scanner.nextInt();
		scanner.close();
		System.out.println(String.format("You have stated %d sides",numSides));
		
		// Dimensions set for simplicity
		if(numSides == 3) {
			shape = new Triangle(5,6);
		} else if (numSides == 4) {
			shape = new Rectangle(5,5);
		} else {
			throw new Exception("Unexpected input (3 or 4 expected)");
		}

		shape.getDimensions();
		shape.getArea();
	}

}
