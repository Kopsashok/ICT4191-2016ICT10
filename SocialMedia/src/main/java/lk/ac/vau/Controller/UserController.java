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

import lk.ac.vau.Repo.UserRepo;
import lk.ac.vau.Model.User;

@RestController
@RequestMapping("User")
@Produces(MediaType.APPLICATION_XML)
@Consumes(MediaType.APPLICATION_XML)

public class UserController {
	@Autowired
	private UserRepo user;
	
	@GetMapping
	public List<User> getAll(){
		return user.findAll();
	}
	
	@GetMapping("/{id}")
	public User get(@PathVariable("id") String id) {
		return user.findById(id).get();
	}
	@PostMapping
	public void add(@RequestBody User u) {
		user.save(u);
	}
	
	@DeleteMapping("/{id}")
	public void delte(@PathVariable("id") String id) {
		user.deleteById(id);
	}
	
	@PutMapping
	public void update(@RequestBody User u) {
		user.save(u);
	}
}
