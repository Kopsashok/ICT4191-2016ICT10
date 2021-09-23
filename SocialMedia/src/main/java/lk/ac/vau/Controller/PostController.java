package lk.ac.vau.Controller;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lk.ac.vau.Repo.Postrepo;
import lk.ac.vau.Model.Post;


@RestController
@RequestMapping("Post")
@Produces(MediaType.APPLICATION_XML)
@Consumes(MediaType.APPLICATION_XML)
public class PostController {
	@Autowired
	private Postrepo post;
	
	@GetMapping
	public List<Post> getAll(){
		return post.findAll();
	}
	
	@GetMapping("/{id}")
	public Post get(@PathVariable("id") Long id) {
		return post.findById(id).get();
	}
	@PostMapping
	public void add(@RequestBody Post p) {
		post.save(p);
	}
	
	@DeleteMapping("/{id}")
	public void delte(@PathVariable("id") Long id) {
		post.deleteById(id);
	}
	
	@PutMapping
	public void update(@RequestBody Post p) {
		post.save(p);
	}
}
