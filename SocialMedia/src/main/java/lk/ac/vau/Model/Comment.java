package lk.ac.vau.Model;

import javax.persistence.Entity;
import javax.xml.bind.annotation.XmlRootElement;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Column;
import javax.persistence.JoinColumn;

@Entity
@XmlRootElement
public class Comment extends PrimaryKeyId<Long>{
	@Id
	private long CommentId;
	public String Comment;
	@Column(columnDefinition="datetime")
	public String CommentedOn;
	@ManyToOne
	@JoinColumn(name="commentedin",referencedColumnName="PostId")
	public Post CommentedIn;
	@ManyToOne
	@JoinColumn(name="commentedby",referencedColumnName="UserId")
	public User CommentedBy;
	
	public Comment() {
		
	}

	public Comment(long commentId, String comment, String commentedOn, Post commentedIn, User commentedBy) {
		super();
		CommentId = commentId;
		Comment = comment;
		CommentedOn = commentedOn;
		CommentedIn = commentedIn;
		CommentedBy = commentedBy;
	}

	public long getCommentId() {
		return CommentId;
	}

	public void setCommentId(long commentId) {
		CommentId = commentId;
	}

	public String getComment() {
		return Comment;
	}

	public void setComment(String comment) {
		Comment = comment;
	}

	public String getCommentedOn() {
		return CommentedOn;
	}

	public void setCommentedOn(String commentedOn) {
		CommentedOn = commentedOn;
	}

	public Post getCommentedIn() {
		return CommentedIn;
	}

	public void setCommentedIn(Post commentedIn) {
		CommentedIn = commentedIn;
	}

	public User getCommentedBy() {
		return CommentedBy;
	}

	public void setCommentedBy(User commentedBy) {
		CommentedBy = commentedBy;
	}

	
}
