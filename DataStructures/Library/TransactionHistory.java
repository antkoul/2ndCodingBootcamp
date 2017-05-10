package Library;

import java.util.ArrayList;

public class TransactionHistory {
	//Variables
	private ArrayList<Transaction> transactionHistory;
	
	//Constructor
	TransactionHistory(){
		this.transactionHistory=new ArrayList<Transaction>();
	}
	
	//Getters - Setters
	public ArrayList<Transaction> getTransactionHistory(){
		return transactionHistory;
	}
	
	//Methods
	
	/*
	@Override
	public String toString(){
		return " ";
	}*/
	
	public void addTransactionToHistory(Transaction transaction){
		this.transactionHistory.add(transaction);
	}
	
	public Transaction getTransactionFromHistory(int i){
		return this.transactionHistory.get(i);
	}	
	
	
}
