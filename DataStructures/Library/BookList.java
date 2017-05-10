package Library;

import java.util.Arrays;
import java.util.LinkedList;

public class BookList {
	private LinkedList<Book> bookList;

	//Constructors
	BookList(Book[] bookArray){
		this.bookList = new LinkedList<Book>(Arrays.asList(bookArray));
	}
	
	//Getters - Setters
	public LinkedList<Book> getBookList() {
		return bookList;
	}	
	
	//Methods
	public boolean exists(String title){
		for(int i=0;i<bookList.size();i++){
			if(this.bookList.get(i).getTitle()==title){
				return true;
			}
		}	
		return false;
	}

	public Book returnBook(String title){
		for(int i=0;i<bookList.size();i++){
			if(this.bookList.get(i).getTitle()==title){
				return this.bookList.get(i);
			}
		}	
		return null;
	}
	
	


	public void addBook(Book newBook){
		for(int i=0;i<this.bookList.size();i++){
			if(!this.exists(newBook.getTitle())){
				this.bookList.addLast(newBook);
			}
		}
	}
	
	public void removeBook(String title){
		for(int i=0;i<this.bookList.size();i++){
			if(this.exists(title)){
				this.bookList.remove(this.bookList.get(i));
			}
		}
	}
	
	public void printAvailableBooks(){
		for(int i=0;i<this.bookList.size();i++){
			if(this.bookList.get(i).isAvailable()){
				System.out.println(this.bookList.get(i).toString());
			}
		}	
	}
	
	
	public void printBookDetails(String title){
		int a=0;
		for(int i=0;i<this.bookList.size();i++){
			if(this.bookList.get(i).getTitle().equals(title)){
				if(this.bookList.get(i).isAvailable()){
					System.out.println("Book with title= '"+title+"' found! Details:");
					System.out.println(this.bookList.get(i).toString());
					a=1;
				}
			}
		}
		if(a==0){
			System.out.println("The book with title= '"+title+"' not found");
		}	
	}
	
	public void printBooksFromAuthor(String name){
		int a=0;
		for(int i=0;i<this.bookList.size();i++){
			if(this.bookList.get(i).hasAuthor(name)){				
					System.out.println(this.bookList.get(i).toString());	
					a=1;
			}
		}	
		if(a==0){
			System.out.println("The book with author'"+name+"' not found");
		}
	}
	
	public void printTheMostPopularBook(){
		Book tempBook=this.bookList.get(0);
		for(int i=0;i<this.bookList.size();i++){
			if(this.bookList.get(i).getTimesRented()>tempBook.getTimesRented()){
				tempBook=this.bookList.get(i);
			}
		}
		System.out.println(tempBook.toString());
	}
}