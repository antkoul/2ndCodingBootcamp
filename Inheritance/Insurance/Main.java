package Insurance;

import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
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
		int selection=scanner.nextInt();
		while(selection!=0){
			switch(selection){
				case 1: 
					Health.printAllHealthInsurance();
					Life.printAllLifeInsurance();
					System.out.println();
					break;
				case 2:
					System.out.println("Enter customer Code");
					int y=scanner.nextInt();
					Life.printLifeInsuranceByCustomerCode(y);
					Health.printHealthInsuranceByCustomerCode(y);
					System.out.println();
					break;
				case 3:
					System.out.println("Enter insurance code");
					int z=scanner.nextInt();
					Life.printLifeInsuranceByInsuranceID(z);
					Health.printLHealthInsuranceByInsuranceID(z); 
					System.out.println();
					break;
				default:	
					break;
			}
			System.out.println("*****MENU*****");
			System.out.println("1. Print all Insurances");
			System.out.println("2. Search insurances by customer code");
			System.out.println("3. Search insurances by insurance code");
			selection=scanner.nextInt();
		}
		System.out.println("Program over");
		scanner.close();
        	
		//System.out.println(life1.toString());
		//System.out.println(health3.toString());
	}

}
