package Library;

public class Book {
	//Variables
	private String title;
	private AuthorList authorList;
	//private Author author;
	private String isbn;
	private int physicalCopies;
	private int availableCopies;
	private int timesRented;

	
	public Book(String title, Author[] authorArray, String isbn, int physicalCopies, int availableCopies, int timesRented) {
		this.title = title;
		this.authorList = new AuthorList(authorArray);
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
	
	public void setAuthorList(AuthorList authorList){
		this.authorList=authorList;
	}
	public AuthorList getAuthorList(){
		return this.authorList;
	}

	//Methods
	public String toString(){
		return "Title: "+this.title+", AuthorList: "+this.authorList.toString()+", ISBN: "+this.isbn+", physicalCopies: "+this.physicalCopies+",  availableCopies: "+this.availableCopies+", timesRented: "+this.timesRented;
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
		if(this.authorList.existAuthor(name)){
			return true;
		}else{
			return false;
		}		
	}
}
