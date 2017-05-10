package Library;

public class Librarian {
	//Variables
	Library library;
	
	//Consturctor
	public Librarian(Library library){
		this.library=library;
	}
	
	//Methods
	public void findMeBooksFromAuthor(String name){		
		this.library.printBooksFromAuthor(name);
	}
	
	public void findMeAvailableBooks(){
		this.library.printAvailableBooks();
	}
	
	public void findMeBook(String title){
		this.library.printBookDetails(title);
	}
	
	public void findMostPopularBooks(){
		this.library.printTheMostPopularBook();
	}
}
