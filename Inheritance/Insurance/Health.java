package Insurance;

public class Health extends Insurance{
	//Variables
	private int medicalExpense;
	private static int healthCounter=0;
	private int healthID;	
	static Health[] healthDB=new Health[10];
	
	//Constructor
	public Health(int duration,Customer customer,int medicalExpense){
		super(duration,customer);		
		this.medicalExpense=medicalExpense;
		healthCounter++;
		healthID=healthCounter;
		healthDB[healthID-1]=this;
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
	
	public double lifeCost(){
		if(customer.getSex()==0){
			return super.insurance_cost()+7*super.getDuration()+50+2.5*this.medicalExpense;
		}else{
			return super.insurance_cost()+7*super.getDuration()+2.5*this.medicalExpense;
		}
	}

	public static void printAllHealthInsurance(){
		for (int i=0;i<healthDB.length;i++){
			System.out.println(healthDB[i].toString());
		}
	}

	public static void printHealthInsuranceByCustomerCode(int x){
		for (int i=0;i<healthDB.length;i++){
			if(healthDB[i].getCustomer().getcustomerCode()==x){
				System.out.println(healthDB[i].toString());
			}
		}
	}
	
	public static void printLHealthInsuranceByInsuranceID(int x){
		for (int i=0;i<healthDB.length;i++){
			if(healthDB[i].getInsuranceID()==x){
				System.out.println(healthDB[i].toString());
			}	
		}	
	}
}
