package Library;

public class Library {
	//Constants
	private BookList bookList;
	private TransactionHistory transactionHistory;

	//Constractor
	public Library(BookList bookList) {
		this.bookList = bookList;
	}

	//Getters-Setters
	public BookList getBookList() {
		return bookList;
	}
	public void setBookList(BookList bookList) {
		this.bookList = bookList;
	}
	public TransactionHistory getTransactionHistory() {
		return transactionHistory;
	}
	public void setTransactionHistory(TransactionHistory transactionHistory) {
		this.transactionHistory = transactionHistory;
	}
	
	
	//Methods
	
	public void printAllTransactionHistory(){
		int size=transactionHistory.getTransactionHistory().size();
		for(int i=0;i<size;i++){
			this.transactionHistory.getTransactionFromHistory(i);
		}
	}
	
	/*
	public String printAllTransactionHistory(){
		return this.transactionHistory.toString();
	}*/

}
