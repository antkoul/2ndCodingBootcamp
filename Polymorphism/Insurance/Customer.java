package Insurance;


public class Customer {
	//variables
	private static int code=0;
	private int customerCode;
	private String name;
	private int year;
	private int sex;	//0->male,   1->female
	static Customer[] customerDB=new Customer[30];
	
	//Constructors
	public Customer(String name, int year, int sex) {
		code++;		//counter twn antikeimenwn
		customerCode=code;	//Apothikevo ton trexon counter se mia metavliti stigmiotipou
		this.name = name;
		this.year = year;
		this.sex = sex;
		customerDB[code-1]=this;// Apothikevo to trexon stigmiotipo tis klassis (olokliro to antikeimeno) customer ston pinaka customerDB
	}


	
	//Getters-Setters
	public int getcustomerCode() {
		return customerCode;
	}
	public void setcustomerCode(int customerCode) {
		this.customerCode = customerCode;
	}	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}

	public int getSex() {
		return sex;
	}
	public void setSex(int sex) {
		this.sex = sex;
	}
	
	//Methods
	public String toString(){
		return "Customer's code:"+ this.customerCode + ", Name:"+this.name+", Year of birth:"+this.year+", Sex:"+this.sex+", Number of customers: "+code;
	}
	
	public static void printAllCustomers(){
		for(int i=0;i<customerDB.length;i++){
			if(customerDB[i]!=null){
				System.out.println(customerDB[i].toString());
			}
		}
	}
	
}

