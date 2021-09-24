package lk.ac.vau.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lk.ac.vau.Model.User;
import lk.ac.vau.Repo.UserRepo;
import lk.ac.vau.Model.Comment;
import lk.ac.vau.Model.Post;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.*;



@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	UserRepo context;

	@GetMapping
	public List<User> getAll() {
		List<User> users=context.findAll();
		for(User u:users)
		{
			String userUrl=linkTo(UserController.class).slash(u.getUserId()).toString();
			String postUrl= linkTo(UserController.class).slash(u.getUserId()).toString();
			String commentUrl= linkTo(UserController.class).slash(u.getUserId()).toString();
			u.addLink(userUrl, "User");
			u.addLink(postUrl, "Post");
			u.addLink(commentUrl, "Comment");
		}
		return users;
	}

	@GetMapping("/{id}")
	public User get(@PathVariable("id") String id) {
		return context.findById(id).get();
	}

	@PostMapping
	public void add(@RequestBody User user) {
		context.save(user);
	}

	@PutMapping
	public void update(@RequestBody User user) {
		context.save(user);
	}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") String id) {
		context.deleteById(id);
	}
	
	@GetMapping("/{id}/post")
	public List<Post> getPost(@PathVariable("id") String id) {
		return context.findById(id).get().getPosts();
	}
	
	@GetMapping("/{id}/comment")
	public List<Comment> getComment(@PathVariable("id") String id) {
		return context.findById(id).get().getComments();
	}
	//HATEOAS - Hypermedia As The Engine Of Application Sate
	
	
	
}
