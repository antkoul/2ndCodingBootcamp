package Insurance;

public abstract class Insurance {
	//Variables
	private static int counter=0;
	private int insuranceID;
	private int duration;
	Customer customer;
	static Insurance[] insuranceDB=new Insurance[30];
	public abstract double cost();
	
	//Constructor
	public Insurance(int duration,Customer customer){
		this.duration=duration;
		this.customer=customer;
		counter++;
		insuranceID=counter;
		insuranceDB[counter-1]=this;
	}
	
	//Getters-Setters
	public int getInsuranceID() {
		return insuranceID;
	}
	public void setInsuranceID(int insuranceID) {
		this.insuranceID = insuranceID;
	}
	
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	
	
	//Methods
	public String toString(){
		return "insuranceID: "+this.insuranceID+", duration: "+this.duration+", "+this.customer.toString();
	}
	

	
	public static void printAllInsurances(){
		for(int i=0;i<insuranceDB.length;i++){
			if(Insurance.insuranceDB[i]!=null){  
				System.out.println(insuranceDB[i].toString());
			}
		}
	}
	
	public static void printInsuranceByInsuranceID(int x){
		System.out.println(insuranceDB[x].toString());
	}
	
	public static void printInsuranceByCustomer(int x){
		for(int i=0;i<insuranceDB.length;i++){
			if(insuranceDB[i].getCustomer().getcustomerCode()==x){
				System.out.println(insuranceDB[i].toString());
			}
		}
	}

}
