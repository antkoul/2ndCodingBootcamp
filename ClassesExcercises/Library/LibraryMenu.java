package Library;
import java.util.Scanner;

public class LibraryMenu {
	private Book [] books;
	public LibraryMenu(Book[] books){
		this.books = books;
	}
	
	public void libraryMenu(){
		System.out.println("Welcome to the Bootcamp library.");
		System.out.println("How do you want to proceed?");
		System.out.println("1. Show all available books");
		System.out.println("2. Search for a book (by book title)");
		System.out.println("3. Display books from a specific author");
		System.out.println("4. Show me the most popular book");
		System.out.println("q. Quit");
		System.out.print(">");
		
		Scanner scanner = new Scanner(System.in);
		String menuSelection=scanner.nextLine();
		while((Integer.parseInt(menuSelection)<0)&&(Integer.parseInt(menuSelection)>5)&&(!menuSelection.equals("q"))){ 
		    System.out.println("Enter 0-4 or q for quit");
		    menuSelection=scanner.nextLine();
		}
		Library library = new Library(books);
		switch(menuSelection){
		case "1":
			library.printAvailableBooks();
			break;
		case "2":
			library.printBookDetails("Book3");
			break;
		case "3":
			library.printBooksFromAuthor("Ruth");
			break;
		case "4":
			library.printTheMostPopularBook();
			break;
		case "q":
			System.out.println("Quit");
			break;
		}
		scanner.close();
		
	}
}

