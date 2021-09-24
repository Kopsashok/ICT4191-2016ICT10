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

import lk.ac.vau.Model.Authors;
import lk.ac.vau.Repo.AuthorsRepoo;

@RestController
@RequestMapping("Authorss")
@Produces(MediaType.APPLICATION_XML)
@Consumes(MediaType.APPLICATION_XML)

public class AuthorsController {
	@Autowired
	private AuthorsRepoo Au;
	
	@GetMapping
	public List<Authors> getAll(){
		return Au.findAll();
	}
	
	@GetMapping("/{id}")
	public Authors get(@PathVariable("id") String id) {
		return Au.findById(id).get();
	}
	@PostMapping
	public void add(@RequestBody Authors a) {
		Au.save(a);
	}
	
	@DeleteMapping("/{id}")
	public void delte(@PathVariable("id") String id) {
		Au.deleteById(id);
	}
	
	@PutMapping
	public void update(@RequestBody Authors a) {
		Au.save(a);
	}
}
