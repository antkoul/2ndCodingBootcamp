package Insurance;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int code;
		int thereIs;
		int id;
		int duration;
		int expense;
		int amount;
		Customer tempCust;

		
		Customer cust1=new Customer("John",1981,0);
		Customer cust2=new Customer("Angelo",1982,0);
		Customer cust3=new Customer("Micky",1982,0);
		Customer cust4=new Customer("Mia",1983,1);
		Customer cust5=new Customer("Dezy",1984,1);
		Customer cust6=new Customer("Vasia",1984,1);
		Customer cust7=new Customer("Vasilis",1982,0);
		Customer cust8=new Customer("Kostas",1982,0);
		Customer cust9=new Customer("Kelly",1983,1);
		Customer cust10=new Customer("Maria",1984,1);

		
		Health health1=new Health(10,cust3,1000);
		Health health2=new Health(20,cust5,2000);
		Health health3=new Health(30,cust6,3000);
		Health health4=new Health(40,cust9,2000);
		Health health5=new Health(50,cust10,3000);	
		Health health6=new Health(10,cust1,1000);
		Health health7=new Health(20,cust2,2000);
		Health health8=new Health(30,cust4,3000);
		Health health9=new Health(40,cust7,2000);
		Health health10=new Health(50,cust8,3000);
		
		Life life1=new Life(10,cust1,1000);
		Life life2=new Life(20,cust2,2000);
		Life life3=new Life(30,cust4,3000);
		Life life4=new Life(40,cust7,2000);
		Life life5=new Life(50,cust8,3000);
		Life life6=new Life(10,cust3,1000);
		Life life7=new Life(20,cust5,2000);
		Life life8=new Life(30,cust6,3000);
		Life life9=new Life(40,cust9,2000);
		Life life10=new Life(50,cust10,3000);

		Scanner scanner = new Scanner(System.in);
		System.out.println("*****MENU*****");
		System.out.println("1. Print all Insurances");
		System.out.println("2. Search insurances by customer code");
		System.out.println("3. Search insurances by insurance code");
		System.out.println("4. Create new insurance");
		System.out.println("5. Create new Customer");
		System.out.println("6. Print all customers");
		System.out.println("0. To exit");
		int selection=scanner.nextInt();
		while(selection!=0){
			switch(selection){
				case 1:
					Insurance.printAllInsurances(); 
					System.out.println();
					break;
				case 2:
					System.out.println("Enter customer Code");
					int y=scanner.nextInt();
					Insurance.printInsuranceByCustomer(y);
					System.out.println();
					break;
				case 3:
					System.out.println("Enter insurance code");
					int z=scanner.nextInt();
					Insurance.printInsuranceByInsuranceID(z); 
					System.out.println();
					break;
				case 4:
					System.out.println("Enter:");
					System.out.println("1 to create a new Health insurance for an excisting customer");
					System.out.println("2 to create a new Life insurance for an excisting customer");				
					System.out.println("3 to create a new Health insurance for a new customer");
					System.out.println("4 to create a new Life insurance for a new customer");
					int choice=scanner.nextInt();
					while(choice!=1&&choice!=2&&choice!=3&&choice!=4&&choice!=5&&choice!=6){
						System.out.println("Enter:");
						System.out.println("1 to create a new Health insurance for an excisting customer");
						System.out.println("2 to create a new Life insurance for an excisting customer");				
						System.out.println("3 to create a new Health insurance for a new customer");
						System.out.println("4 to create a new Life insurance for a new customer");
						System.out.println();
						choice=scanner.nextInt();
					}
					switch(choice){
						
						/*case 1:
							System.out.println("Give the code of the existing customer");
							code=scanner.nextInt();
							thereIs=0;
							for(int i=0;i<Customer.customerDB.length;i++){
								if(Customer.customerDB[i]!=null&&Customer.customerDB[i].getcustomerCode()==code){
									thereIs=1;
								}
							}
							if(thereIs==1){
								System.out.println("These are this customer's insurances");
								for(int i=0;i<Insurance.insuranceDB.length;i++){
									if(Insurance.insuranceDB[i]!=null&&Insurance.insuranceDB[i].getCustomer().getcustomerCode()==code){  
										System.out.println(Insurance.insuranceDB[i].toString());
									}
								}
								System.out.println();
								System.out.println("Enter the insuranceID of the Health insurance you want to modify");
								id=scanner.nextInt();
								System.out.println("Enter the new duration for the Health insurance");
								duration=scanner.nextInt();	
								System.out.println("Enter the Health insurance's new medical expense");
								expense=scanner.nextInt();							
								for(int i=0;i<Insurance.insuranceDB.length;i++){
									if(Insurance.insuranceDB[i]!=null&&Insurance.insuranceDB[i].getCustomer().getcustomerCode()==code&&Insurance.insuranceDB[i].getInsuranceID()==id){  
										Insurance.insuranceDB[i].setDuration(duration);
										Insurance.insuranceDB[i].setmedicalExpense(expense);
									}
								}
								System.out.println("These are this customer's new insurances");
								for(int i=0;i<Insurance.insuranceDB.length;i++){
									if(Insurance.insuranceDB[i]!=null&&Insurance.insuranceDB[i].getCustomer().getcustomerCode()==code){  
										System.out.println(Insurance.insuranceDB[i].toString());
									}
								}
							}else{
								System.out.println("There is not a customer with this code");
							}
							break;
						case 2:
							System.out.println("Give the code of the existing customer");
							break;*/
						case 1:
							System.out.println("Give the code of the existing customer");
							code=scanner.nextInt();
							thereIs=0;
							for(int i=0;i<Customer.customerDB.length;i++){
								if(Customer.customerDB[i]!=null&&Customer.customerDB[i].getcustomerCode()==code){
									thereIs=1;
								}
							}
							if(thereIs==1){
								System.out.println("Enter the duration for the new Health insurance");
								duration=scanner.nextInt();	
								System.out.println("Enter the new Health insurance's medical expense");
								expense=scanner.nextInt();
								tempCust=Customer.customerDB[0];
								for(int i=0;i<Customer.customerDB.length;i++){
									if(Customer.customerDB[i]!=null&&Customer.customerDB[i].getcustomerCode()==code){
										tempCust=Customer.customerDB[i];
									}
								}
								new Health(duration,tempCust,expense);
							}else{
								System.out.println("There is not a customer with this code in the database");
								break;
							}	
							break;
						case 2:
							System.out.println("Give the code of the existing customer");
							code=scanner.nextInt();
							thereIs=0;
							for(int i=0;i<Customer.customerDB.length;i++){
								if(Customer.customerDB[i]!=null&&Customer.customerDB[i].getcustomerCode()==code){
									thereIs=1;
								}
							}
							if(thereIs==1){
								System.out.println("Enter the duration for the new Life insurance");
								duration=scanner.nextInt();	
								System.out.println("Enter the new Health insurance's invest Amount");
								expense=scanner.nextInt();
								tempCust=Customer.customerDB[0];
								for(int i=0;i<Customer.customerDB.length;i++){
									if(Customer.customerDB[i]!=null&&Customer.customerDB[i].getcustomerCode()==code){
										tempCust=Customer.customerDB[i];
									}
								}
								new Life(duration,tempCust,expense);
							}else{
								System.out.println("There is not a customer with this code in the database");
								break;
							}
							break;
						case 3:
							System.out.println("First you have to create the new customer");
							System.out.println("Enter Customer's name");
							scanner.nextLine();//When you call nextInt, the scanner reads the int, but it does not consume the '\n' character after it; nextLine does that. That is why you get an empty line instead of the string that you were expecting to get.
							String name=scanner.nextLine();
							System.out.println("Enter Customer's year of birth");
							int year=scanner.nextInt();
							System.out.println("Enter Customer's sex:0 for male-1 for female");
							int sex=scanner.nextInt();
							tempCust=new Customer(name,year,sex);
							System.out.println("Enter the new duration for the new Health insurance");
							duration=scanner.nextInt();	
							System.out.println("Enter the Health insurance's new medical expense");
							expense=scanner.nextInt();	
							new Health(duration,tempCust,expense);
							break;
						case 4:
							System.out.println("First you have to create the new customer");
							System.out.println("Enter Customer's name");
							scanner.nextLine();//When you call nextInt, the scanner reads the int, but it does not consume the '\n' character after it; nextLine does that. That is why you get an empty line instead of the string that you were expecting to get.
							name=scanner.nextLine();
							System.out.println("Enter Customer's year of birth");
							year=scanner.nextInt();
							System.out.println("Enter Customer's sex:0 for male-1 for female");
							sex=scanner.nextInt();
							tempCust=new Customer(name,year,sex);
							System.out.println("Enter the new duration for the new Life insurance");
							duration=scanner.nextInt();	
							System.out.println("Enter the Life insurance's new invest Amount");
							amount=scanner.nextInt();	
							new Life(duration,tempCust,amount);
							break;
					}
					break;
				case 5:
					System.out.println("Enter Customer's name");
					scanner.nextLine();//When you call nextInt, the scanner reads the int, but it does not consume the '\n' character after it; nextLine does that. That is why you get an empty line instead of the string that you were expecting to get.
					String name=scanner.nextLine();
					System.out.println("Enter Customer's year of birth");
					int year=scanner.nextInt();
					System.out.println("Enter Customer's sex:0 for male-1 for female");
					int sex=scanner.nextInt();
					new Customer(name,year,sex);
					break;
				case 6:
					System.out.println("Print all users");
					Customer.printAllCustomers();
					break;
			}
			System.out.println();
			System.out.println("*****MENU*****");
			System.out.println("1. Print all Insurances");
			System.out.println("2. Search insurances by customer code");
			System.out.println("3. Search insurances by insurance code");
			System.out.println("4. Create new insurance");
			System.out.println("5. Create new Customer");
			System.out.println("6. Print all customers");
			System.out.println("0. To exit");
			selection=scanner.nextInt();
		}

		System.out.println("Program over");
		scanner.close();
        	
		
	}

}
