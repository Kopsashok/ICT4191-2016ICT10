package lk.ac.vau.Model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Books {
	@Id
	private String BookId;
	public String Name;
	public int pages;
	@Column(columnDefinition="datetime")
	public String Published_Date;
	@ManyToMany
	@JoinTable(name="Book_Author",joinColumns= {@JoinColumn(name="Book_Id",referencedColumnName = "BookId" )},
	inverseJoinColumns = {@JoinColumn(name="Author_Id",referencedColumnName = "AuthorId")})
	private List<Authors> Auth=new ArrayList<Authors>();
	
	public Books() {
		
	}

	public Books(String bookId, String name, int pages, String published_Date, List<Authors> auth) {
		super();
		BookId = bookId;
		Name = name;
		this.pages = pages;
		Published_Date = published_Date;
		Auth = auth;
	}

	public String getBookId() {
		return BookId;
	}

	public void setBookId(String bookId) {
		BookId = bookId;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	public String getPublished_Date() {
		return Published_Date;
	}

	public void setPublished_Date(String published_Date) {
		Published_Date = published_Date;
	}

	public List<Authors> getAuth() {
		return Auth;
	}

	public void setAuth(List<Authors> auth) {
		Auth = auth;
	}
	
}
