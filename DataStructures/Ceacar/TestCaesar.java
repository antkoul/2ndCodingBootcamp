package Ceacar;
import java.util.Scanner;
public class TestCaesar {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		//Cipher
		System.out.println("Insert msg to cipher");
		String myInput=scanner.nextLine();
		System.out.println("Insert numbers of shifts ");
		int numOfShifts=scanner.nextInt();	
		System.out.println(CaesarsCipher.cipher(myInput,numOfShifts));
		
		//decipher
		System.out.println("Insert msg to decipher");
		scanner.nextLine();
		myInput=scanner.nextLine();
		System.out.println("Insert numbers of shifts ");
		numOfShifts=scanner.nextInt();	
		System.out.println(CaesarsCipher.decipher(myInput,numOfShifts));
		
		scanner.close();
		
	}

}
