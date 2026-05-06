package Factory;

/*
 * File: 			 Shape.java
 * Description:  	 Shape class for the factory design pattern. This is inherited
 *                   by:
 *                   		* Rectangle.java
 *                   		* Triangle.java 
 * 
 * Author:           Thomas Avant
 * Creation Date:    06/05/2026
 * 
 * Version History:
 * v1.0              First recorded version
 */

abstract class Shape {
	
	public abstract double getArea();
	
	public abstract void getDimensions();
	
}
