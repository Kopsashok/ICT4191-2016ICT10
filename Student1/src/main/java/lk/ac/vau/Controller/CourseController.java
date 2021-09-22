package lk.ac.vau.Controller;

import java.util.Collection;

import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lk.ac.vau.Model.course;
import lk.ac.vau.Repo.Repo;

@RestController
@RequestMapping("course")
@Produces(MediaType.APPLICATION_XML)
@Consumes(MediaType.APPLICATION_XML)
public class CourseController {

	private Repo<String,course> crse=new Repo<String,course>();
	
	@GetMapping
	public Collection<course> getAll() {
		// add();
		return crse.getAll();
	}

	@GetMapping("/{id}")
	public course get(@PathVariable("id") String id) {
		// add();
		return crse.get(id);
	}

	@PostMapping 
	public void add(@RequestBody course c) {
		crse.add(c);
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") String id) {
		crse.delete(id);
	}

	@PutMapping("/{id}")
	public void update(@PathVariable("id") String id,@RequestBody course c) {
		crse.update(id, c);
	}
}
