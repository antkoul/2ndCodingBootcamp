package Insurance;

public class Health extends Insurance{
	//Variables
	private int medicalExpense;
	
	//Constructor
	public Health(int duration,Customer customer,int medicalExpense){
		super(duration,customer);		
		this.medicalExpense=medicalExpense;
	}
	
	
	//Getters-Setters
	public int getmedicalExpense() {
		return medicalExpense;
	}
	public void setmedicalExpense(int medicalExpense) {
		this.medicalExpense = medicalExpense;
	}
	
	//Methods
	@Override
	public String toString(){
		return "Health Type Insurance"+", "+super.toString()+", Medical Expense: "+this.medicalExpense;
	}
	
	public double cost(){
		if(customer.getSex()==0){
			return 80+7*super.getDuration()+50+2.5*this.medicalExpense/100;
		}else{
			return 80+7*super.getDuration()+2.5*this.medicalExpense/100;
		}
	}

}
