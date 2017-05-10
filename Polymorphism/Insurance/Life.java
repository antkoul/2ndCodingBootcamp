package Insurance;

public class Life extends Insurance{
	//Variables
	private int investAmount;
	
	//Constructor
	public Life(int duration,Customer customer,int investAmount){		
		super(duration,customer);
		this.investAmount=investAmount;	
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
		return "Life Type Insurance"+", "+super.toString()+", Invest Amount: "+this.investAmount;
	}
	
	public double cost(){
		return 5*super.getDuration()+5*this.investAmount/100;
	}

}
