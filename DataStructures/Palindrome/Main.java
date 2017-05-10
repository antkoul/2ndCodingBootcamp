package Palindrome;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Insert the word to test:");
		String word=scanner.nextLine();
		StringBuilder sb= new StringBuilder(word);
		String reverseString =sb.reverse().toString();		
		if(reverseString.equals(word)){
			System.out.println("ok");
		}else{
			System.out.println("problem");			
		}
		scanner.close();
	}

}
