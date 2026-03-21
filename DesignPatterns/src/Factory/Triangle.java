package Factory;

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
		return String.format("I am a %s and my base is %.2g and my height is %.2g","triangle",this.base,this.height);
	}


}
