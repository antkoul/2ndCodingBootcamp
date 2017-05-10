package Library;

import java.util.LinkedList;

public class TransactionQueue {	
	//Variables
	private LinkedList<Transaction> transactionQueue;
	
	//Constructors
	TransactionQueue(){
		this.transactionQueue=new LinkedList<Transaction>();
	}
	
	//Getters - Setters
	public LinkedList<Transaction> getTransactionQueue(){
		return transactionQueue;
	}
	
	//methods
	public void addTransaction(Transaction transaction){
		this.transactionQueue.addLast(transaction);
	}
	
	public Transaction removeTransaction(){
		return this.transactionQueue.removeFirst();
	}
	
	public int getSize(){
		return transactionQueue.size();
	}
}
