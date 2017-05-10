package Library;
//import java.util.Scanner;
public class Librarian {
	//Variables
	Library library;
	TransactionQueue transactionQueue;
	
	//Constructors
	public Librarian(Library library){
		this.library=library;
	}
	
	//Getters - Setters
	public Library getLibrary() {
		return library;
	}
	public void setLibrary(Library library) {
		this.library = library;
	}
	public TransactionQueue getTransactionQueue() {
		return transactionQueue;
	}
	public void setTransactionQueue(TransactionQueue transactionQueue) {
		this.transactionQueue = transactionQueue;
	}
	
	//Methods
	public void executePendingTransactions(){
		int size=transactionQueue.getSize();
		for(int i=0;i<size;i++){    		//allazei sinexos o timi tou size tou transactionQueue bavontas kai vgazontas stoixeia apo ti stoiva
			Transaction tempTransaction=this.transactionQueue.removeTransaction();
			tempTransaction.setServedDate();
			this.library.getTransactionHistory().addTransactionToHistory(tempTransaction);
			System.out.println("Transaction Executed");
		}
	}
	
	public void rentPhysicalCopy(String title){
		Book tempBook= this.library.getBookList().returnBook(title);
		if(tempBook!=null){
			if(tempBook.getAvailableCopies()>0){
				tempBook.setTimesRented(tempBook.getAvailableCopies()+1);
				tempBook.setAvailableCopies(tempBook.getAvailableCopies()-1);
				transactionQueue.addTransaction(new Transaction(tempBook));
			}
		}
	}
	
	public void printAllPendingTransactions(){
		int size=transactionQueue.getSize();
			for(int i=0;i<size;i++){
				this.transactionQueue.toString();
			}
	}
	
	public void findMeAvailableBooks(){
		this.library.getBookList().printAvailableBooks();
	}
	
	public void findMeBook(String title){
		this.library.getBookList().printBookDetails(title);
	}
	
	public void findMeBooksFromAuthor(String name){
		this.library.getBookList().printBooksFromAuthor(name);
	}
	
	public void findMostPopularBook(){
		this.library.getBookList().printTheMostPopularBook();
	}
	
	/*
	
	public void showOptions() {
		String message = "Welcome to the Bootcamp library.\n" + 
		"How do you want to proceed?\n" + 
		"1. Show all available books\n" + 
		"2. Search for a book (by book title)\n" + 
		"3. Display books from a specific author\n" + 
		"4. Show me the most popular book\n" + 
		// fill-in your own code!
		"q. Quit\n" + 
		"> ";
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.println(message);
			String input = sc.nextLine();
			switch(input) {
				case "1" : 
					this.findMeAvailableBooks();
					break;
				case "2" :
					System.out.println("Enter book title: \n");
					String title = sc.nextLine();
					this.findMeBook(title);
					break;
				case "3" :
					System.out.println("Enter book title: \n");
					String author = sc.nextLine();
					this.findMeBooksFromAuthor(author);
					break;
				case "4" :
					this.findMostPopularBook();
					break;
				// fill-in your own code!
				case "q" :
					System.out.println("Thank you for visiting our Library! Goodbye.");
					sc.close();
					return;
				default : 
					System.out.println("Invalid input. Try again.");
					break;
			}
		}*/
	



}
