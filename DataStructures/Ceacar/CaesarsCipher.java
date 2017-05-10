package Ceacar;

public class CaesarsCipher {
	
	public static String cipher(String message, int numOfShifts){
		StringBuilder sb = new StringBuilder(message);
		StringBuilder sb2= new StringBuilder();
		
		for(int i=0;i<sb.length();i++){
			sb2.append((char)(sb.charAt(i)+numOfShifts));
		}
		return sb2.toString();
		//System.out.println((char)('A'+1));
	}
	
	
	public static String decipher(String cipherText, int numOfShifts){
		StringBuilder sb = new StringBuilder(cipherText);
		StringBuilder sb2= new StringBuilder();
		
		for(int i=0;i<sb.length();i++){
			sb2.append((char)(sb.charAt(i)-numOfShifts));
		}
		return sb2.toString();
	}
	

}
