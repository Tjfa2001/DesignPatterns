package Factory;

/*
 * File: 			 Triangle.java
 * Description:  	 Triangle class for the factory design pattern. Inherits from
 *                   the Shape superclass.
 * 
 * Author:           Thomas Avant
 * Creation Date:    06/05/2026
 * 
 * Version History:
 * v1.0              First recorded version
 */

class Triangle extends Shape{
	
	private double base;
	private double height;
	
	public Triangle(double base, double height) {
		this.base = base;
		this.height = height;
	}
	
	@Override
	public double getArea() {
		double area = 0.5 * this.base * this.height;
		System.out.println(String.format("My area is %.2g",area));
		return area; 
	}

	@Override
	public void getDimensions() {
		String dims = this.toString();
		System.out.println(dims);
	}
	
	public String toString() {
		return String.format("I am a triangle and my base is %.2g and my height is %.2g",this.base,this.height);
	}


}
