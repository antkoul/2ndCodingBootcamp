package CompareObj;

public class Shape implements Agreeable{
	private int width;
	private int height;
	
	//Constructors
	Shape(){}
	Shape(int width,int height){
		this.width=width;
		this.height=height;
	}
	
	//methods
	public int calcArea(){
		return this.width*this.height;
	}
	
	public void isSmallerThan(Agreeable other){
		Shape castShape=(Shape)other;
		if(this.calcArea()>castShape.calcArea()){
			System.out.println("The biggest shape is: "+this.toString());
		}else{
			System.out.println("The biggest shape is: "+other.toString());
		}
	}
	
	public static void main(String[] args) {			
		Shape sh1=new Shape(2,3);
		System.out.println("First shape: "+sh1.toString());
		Agreeable sh2=new Shape(3,4);
		System.out.println("Second shape: "+sh2.toString());
		
		sh1.isSmallerThan(sh2);
	}
}
