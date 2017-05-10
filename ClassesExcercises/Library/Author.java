package Library;

public class Author {
	//Variables
	private String name;
	
	//Constructor
	public Author(String name) {
		this.name = name;
	}
	
	//Getters-Setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	//Methods
	public String toString(){
		return this.name;
	}

}
