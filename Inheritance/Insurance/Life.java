package Insurance;

public class Life extends Insurance{
	//Variables
	private int investAmount;
	private static int lifeCounter=0;
	private int lifeID;
	static Life[] lifeDB=new Life[10];
	
	//Constructor
	public Life(int duration,Customer customer,int investAmount){		
		super(duration,customer);
		this.investAmount=investAmount;	
		lifeCounter++;
		lifeID=lifeCounter;
		lifeDB[lifeID-1]=this;
	}
	
	
	//Getters-Setters
	public int getInvestAmount() {
		return investAmount;
	}
	public void setInvestAmount(int investAmount) {
		this.investAmount = investAmount;
	}
	
	//Methods
	@Override
	public String toString(){
		return "Life Type Insurance"+", LifeID: "+this.lifeID+" "+super.toString()+", Invest Amount: "+this.investAmount;
	}
	
	public int lifeCost(){
		return super.insurance_cost()+5*super.getDuration()+5*this.investAmount/100;
	}
	
	public static void printAllLifeInsurance(){
		for (int i=0;i<lifeDB.length;i++){
			System.out.println(lifeDB[i].toString());
		}
	}
	
	public static void printLifeInsuranceByCustomerCode(int x){
		for (int i=0;i<lifeDB.length;i++){
			if(lifeDB[i].getCustomer().getcustomerCode()==x){
				System.out.println(lifeDB[i].toString());
			}
		}
	}
	
	public static void printLifeInsuranceByInsuranceID(int x){
		for (int i=0;i<lifeDB.length;i++){
			if(lifeDB[i].getInsuranceID()==x){
				System.out.println(lifeDB[i].toString());
			}	
		}	
	}

}
