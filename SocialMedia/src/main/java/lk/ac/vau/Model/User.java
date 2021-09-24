package lk.ac.vau.Model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Transient;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@XmlRootElement
public class User extends PrimaryKeyId<String> {
	@Id
	private String UserId;
	private String Email;
	private String FirstName;
	private String lastName;
	private int age;
	@Transient
	private List<Link>links=new ArrayList<Link>();
	@OneToMany(mappedBy = "Owner")
	private List<Post>posts;
	@OneToMany(mappedBy = "CommentedBy")
	private List<Comment>comments;
	public User() {

	}
	public User(String userId, String email, String firstName, String lastName, int age, List<Post> posts,
			List<Comment> comments) {
		super();
		UserId = userId;
		Email = email;
		FirstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.posts = posts;
		this.comments = comments;
	}
	public String getUserId() {
		return UserId;
	}
	public void setUserId(String userId) {
		UserId = userId;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@JsonIgnore
	public List<Post> getPosts() {
		return posts;
	}
	public void setPosts(List<Post> posts) {
		this.posts = posts;
	}
	@JsonIgnore
	public List<Comment> getComments() {
		return comments;
	}
	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}
	public List<Link> getLinks() {
		return links;
	}
	public void setLinks(List<Link> links) {
		this.links = links;
	}
	
	public void addLink(String uri, String rel) {
		Link link=new Link(uri,rel);
		links.add(link);
	}
}
