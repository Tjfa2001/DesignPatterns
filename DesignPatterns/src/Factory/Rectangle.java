package Factory;

public class Rectangle extends Shape {
	
	double width;
	double height;
	
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
		return String.format("I am a %s and my width is %.2g and my height is %.2g","rectangle",this.width,this.height);
	}
}
