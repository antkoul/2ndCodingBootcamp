package Library;

import java.util.Date;

public class Transaction {
	//Variables
	private Book book;
	private Date requestDate;
	private Date servedDate;
	private static int tsansactionCounter;
	private final int tsansactionID;
	
	public Transaction(Book book) {
		this.book = book;
		this.requestDate = new Date();
		this.servedDate=new Date();
		tsansactionCounter++;
		tsansactionID = tsansactionCounter;
	}
	
	

	public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}

	public Date getRequestDate() {
		return requestDate;
	}

	public Date getServedDate() {
		return servedDate;
	}

	public static int getTsansactionCounter() {
		return tsansactionCounter;
	}

	public int getTsansactionID() {
		return tsansactionID;
	}

	public void setServedDate() {
		this.servedDate = new Date();
	}
	
	public String toString(){
		return "Transaction ID"+this.tsansactionID+", Book:"+this.book.toString()+", Request Date:"+this.requestDate+", Served date:"+this.servedDate;
	}
}
