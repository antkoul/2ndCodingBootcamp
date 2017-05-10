package Library;

//import java.util.Arrays;

public class Library {
	//Constants
	private Book [] books;

	//Constractor
	public Library(Book[] books) {
		this.books = books;
	}

	//Getters-Setters
	public Book[] getBooks() {
		return books;
	}
	public void setBooks(Book[] books) {
		this.books = books;
	}
	
	//Methods
	public void printAvailableBooks(){	
		for(int i=0;i<this.books.length;i++){
			if(this.books[i].isAvailable()){
				System.out.println(this.books[i].toString());
			}
		}
	}
	
	public void printBookDetails(String title){
		int a=0;
		for(int i=0;i<this.books.length;i++){
			if(this.books[i].getTitle().equals(title)){
				if(this.books[i].isAvailable()){
					System.out.println("Book with title= '"+title+"' found! Details:");
					System.out.println(this.books[i].toString());
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
		for(int i=0;i<this.books.length;i++){
			if(this.books[i].hasAuthor(name)){
				System.out.println(this.books[i].toString());	
				a=1;
			}
		}	
		if(a==0){
			System.out.println("The book with author'"+name+"' not found");
		}
	}
	
	public void printTheMostPopularBook(){
		Book tempBook=this.books[0];
		for(int i=0;i<this.books.length;i++){
			if(this.books[i].getTimesRented()>tempBook.getTimesRented()){
				tempBook=this.books[i];
			}
		}
		System.out.println(tempBook.toString());
		
		/*		//2nd way to print most Rented book
		int[] temp=new int[this.books.length];
		for(int i=0;i<this.books.length;i++){
			temp[i]=this.books[i].getTimesRented();
		}
		Arrays.sort(temp);
		System.out.println(temp[temp.length-1]);*/
	}
}
