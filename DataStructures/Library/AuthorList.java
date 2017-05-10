package Library;

import java.util.Arrays;
import java.util.ArrayList;

public class AuthorList {
	private ArrayList<Author> authorList;
	
	//Getters - Setters
	public ArrayList<Author> getAuthorList() {
		return authorList;
	}
	
	

	//Constructors
	AuthorList(Author[] authorArray){
		//this.authorList.addAll(Arrays.asList(authorArray));
		this.authorList = new ArrayList<Author>(Arrays.asList(authorArray));
	}
	
	//Methods
	public void addAuthor(Author author){
		for(int i=0;i<authorList.size();i++){
			if(!this.authorList.contains(author.getName())){
				this.authorList.add(author);
			}
		}
	}
	
	public boolean existAuthor(String name){
		for(int i=0;i<authorList.size();i++){
			if(this.authorList.get(i).getName().equals(name)){
				return true;
			}
		}	
		return false;
	}
	
	public String toString(){
			return this.authorList.toString();	
	}
	
}