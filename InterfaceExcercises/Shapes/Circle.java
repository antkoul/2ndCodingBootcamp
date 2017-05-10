package Shapes;

public class Circle implements Shape{
	//variables
	protected double radius;
	
	//Getters-Setters
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}

	//Constructor
	public Circle(double radius){
		this.radius=radius;
	}
	
	//methods
	public double getParameter(){
		return 2*3.14*this.radius;
	}
	
	public double getArea(){
		return 3.14*this.radius*this.radius;
	}
}
