package Factory;

/*
 * File: 			 Rectangle.java
 * Description:  	 Rectangle class for the factory design pattern. Inherits from
 *                   the Shape superclass.
 * 
 * Author:           Thomas Avant
 * Creation Date:    06/05/2026
 * 
 * Version History:
 * v1.0              First recorded version
 */

public class Rectangle extends Shape {
	
	private double width;
	private double height;
	
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	@Override
	public double getArea() {
		double area = width * height;
		System.out.println(String.format("My area is %.2g",area));
		return area;
	}

	@Override
	public void getDimensions() {
		String dims = this.toString();
		System.out.println(dims);
	}
	
	public String toString() {
		return String.format("I am a rectangle and my width is %.2g and my height is %.2g",this.width,this.height);
	}
}
