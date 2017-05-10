package Library;

public class Book {
	//Variables
	private String title;
	private Author author;
	private String isbn;
	private int physicalCopies;
	private int availableCopies;
	private int timesRented;
	
	public Book(String title, Author author, String isbn, int physicalCopies, int availableCopies, int timesRented) {
		this.title = title;
		this.author = author;
		this.isbn = isbn;
		this.physicalCopies = physicalCopies;
		this.availableCopies = availableCopies;
		this.timesRented = timesRented;
	}

	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Author getAuthor() {
		return author;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public int getPhysicalCopies() {
		return physicalCopies;
	}
	public void setPhysicalCopies(int physicalCopies) {
		this.physicalCopies = physicalCopies;
	}
	public int getAvailableCopies() {
		return availableCopies;
	}
	public void setAvailableCopies(int availableCopies) {
		this.availableCopies = availableCopies;
	}
	public int getTimesRented() {
		return timesRented;
	}
	public void setTimesRented(int timesRented) {
		this.timesRented = timesRented;
	}

	//Methods
	public String toString(){
		return "Title: "+this.title+", Author: "+this.author.toString()+", ISBN: "+this.isbn+", physicalCopies: "+this.physicalCopies+",  availableCopies: "+this.availableCopies+", timesRented: "+this.timesRented;
	}
	public void rentPhysicalCopy(){
		if(this.availableCopies>0){
			System.out.println("There is available copie!");
			this.availableCopies--;
		}
	}
	public boolean isAvailable(){
		if(this.physicalCopies>0){
			return true;
		}else{
			return false;
		}
	}
	public boolean hasAuthor(String name){
		if(this.author.getName().equals(name)){
			return true;
		}else{
			return false;
		}		
	}
}
