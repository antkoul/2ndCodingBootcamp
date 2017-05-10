package Shapes;

public class ResizableCircle extends Circle implements Resizable{
	//
	double percentage;
	
	
	//Getters-Setters
	public double getPercentage() {
		return percentage;
	}
	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}

	//Constructor
	ResizableCircle(double radius, double percentage) {
		super(radius);
		this.percentage = percentage;
	}

	//methods
	public double resize(){
		return super.radius=super.radius+super.radius*(this.percentage/100);
	}
	
	
	public static void main(String[] args) {	
		ResizableCircle rc=new ResizableCircle(5.0,10.0);
		System.out.println("Initial radius: "+rc.getRadius());
		System.out.println("Radius after resize: "+rc.resize());
		System.out.println("Area after resize: "+rc.getArea());
		
	}
	
}
