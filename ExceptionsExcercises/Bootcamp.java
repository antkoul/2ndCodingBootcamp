
public class Bootcamp {
	
	
	public static void welcome(double x) throws DigitException,AnotherDigitException{
		if(x>25){
			throw new DigitException();
		}else{
			throw new AnotherDigitException();
		}
	}
	
	
	 public static int bye(){
	 	try{
		 welcome(299.7);
		 return 1;
	 	}catch(DigitException e){
	 		return 605;
	 	}catch(AnotherDigitException e){
	 		return 230;
	 	}
	 }
	 
	 
	
}
