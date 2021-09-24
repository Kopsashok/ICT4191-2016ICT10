package lk.ac.vau.Model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Authors {
	@Id
	private String AuthorId;
	public String Name;
	public String Gender;
	@ManyToMany(fetch = FetchType.LAZY,mappedBy = "Auth")
	public List<Books> book=new ArrayList<Books>();
	
	public Authors() {
		
	}

	public Authors(String authorId, String name, String gender, List<Books> book) {
		super();
		AuthorId = authorId;
		Name = name;
		Gender = gender;
		this.book = book;
	}

	public String getAuthorId() {
		return AuthorId;
	}

	public void setAuthorId(String authorId) {
		AuthorId = authorId;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getGender() {
		return Gender;
	}

	public void setGender(String gender) {
		Gender = gender;
	}

	public List<Books> getBook() {
		return book;
	}

	public void setBook(List<Books> book) {
		this.book = book;
	}

	
}
