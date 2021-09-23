package lk.ac.vau.Model;

import javax.persistence.Entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@XmlRootElement
public class Post extends PrimaryKeyId<Long>{
	@Id
	private long PostId;
	private String Title;
	private String Content;
	@Column(columnDefinition="datetime")
	private String CreatedOn;
	
	@ManyToOne
	@JoinColumn(name="owner",referencedColumnName="UserId")
	private User Owner;
	
	@OneToMany(mappedBy="CommentedIn")
	private List<Comment> comments;
	
	public Post() {
		
	}

	public Post(long postId, String title, String content, String createdOn, User owner, List<Comment> comments) {
		super();
		PostId = postId;
		Title = title;
		Content = content;
		CreatedOn = createdOn;
		Owner = owner;
		this.comments = comments;
	}

	public long getPostId() {
		return PostId;
	}

	public void setPostId(long postId) {
		PostId = postId;
	}

	public String getTitle() {
		return Title;
	}

	public void setTitle(String title) {
		Title = title;
	}

	public String getContent() {
		return Content;
	}

	public void setContent(String content) {
		Content = content;
	}

	public String getCreatedOn() {
		return CreatedOn;
	}

	public void setCreatedOn(String createdOn) {
		CreatedOn = createdOn;
	}

	public User getOwner() {
		return Owner;
	}

	public void setOwner(User owner) {
		Owner = owner;
	}

	public List<Comment> getComments() {
		return comments;
	}

	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}

	
}
